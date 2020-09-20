#!/usr/bin/env python3

import argparse
import json

from lxml import html
from mysql.connector import connect, errorcode, Error
import sqlalchemy
import requests


def initialize(password):
    """ Initialize the database by creating the tables
        Simply return without initializing if the tables already exist
    """
    if password:
        print("Initializing database")
    else:
        print("Error: password required to initialize database")
    return

def get_courses():
    return

def get_audit():
    return

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("password", help="Password for the MySQL database", type=str)
    parser.add_argument("-m", "--major", help="The major you wish to scrape", type=str)
    parser.add_argument('-i', '--init', help="Initialize the database", action="store_true")
    args = parser.parse_args()

    if args.init:
        initialize(args.password)
        return

    """
    Found search URL from looking at https://webappprd.acs.ncsu.edu/php/coursecat/directory.php 
    Using Chrome, use Cmd+Option+J to open the debug viewer, go to network tab, hit record.
    On page, select undergrad as career and CSC as subject, press the magnifying glass button.
    Then in the debug view, go to Network, and observe the directory_search.php element. In the
    Headers tab, look at the Form Data section to see what needs to be sent as data in the 
    requests.post() call.
    """
    # Map major to data
    MAJORS = {"CSC": {
        "search_val": 'CSC - COMPUTER SCIENCE',
        "catalog_url": "https://webappprd.acs.ncsu.edu/php/coursecat/directory_search.php",
        "audit_url": "https://oucc.dasa.ncsu.edu/coe-14cscbs-nosubplan-2177/"
        }
    }

    major = args.major.upper()
    query_data = MAJORS.get(major)

    if not query_data:
        print(f'{major} major not supported')
        exit(1)

    raw_query = requests.post(query_data["catalog_url"], data={'search_val': query_data["search_val"], 'type': 'subject', 'career': 'UGRD'})
    query_text = json.loads(raw_query.text)
    courses = query_text.get('courses')

    raw_audit = requests.get(query_data["audit_url"])
    tree = html.fromstring(raw_audit.content)
    row_elements = tree.xpath('//tr')

    for e in row_elements:
        # Need to parse subtree to get superscript
        row_data = [col.text for col in e]
        print(row_data)

    # try:
    #     mydb = connect(host="localhost", user="root", password=args.password)
    # except Error as err:
    #     if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
    #         print("user/pass error")
    #     elif err.errno == errorcode.ER_BAD_DB_ERROR:
    #         print("Database error")
    #     else:
    #         print(err)
    # else:
    #     mydb.close()

    # print(mydb)

    sqleng = sqlalchemy.create_engine(f'mysql+mysqlconnector://root:{args.password}@localhost/recourse')
    print(sqleng)

if __name__ == "__main__":
    main()