# scraper.py Instructions
The `scraper.py` script will crawl a subject's course catalog and audit web page, parse them, and put the relevant data into the backend's MySQL database. The scraper depends on:
1. [requests](https://requests.readthedocs.io/en/master/), for connecting to and parsing websites
2. [lxml](https://pypi.org/project/lxml/), which is used to extract data from HTML documents
3. [SQLAlchemy](https://www.sqlalchemy.org), an Object Relational Mapping (ORM) package to convert from Python objects to database schemas
4. [MySQL Python Connector](https://dev.mysql.com/doc/connector-python/en/), for connecting to the MySQL database 

```
./scraper.py -h
usage: scraper.py [-h] [-m MAJOR] [-i] password

positional arguments:
  password              Password for the MySQL database

optional arguments:
  -h, --help            show this help message and exit
  -m MAJOR, --major MAJOR
                        The major you wish to scrape
  -i, --init            Initialize the database
```

The scraper should be invoked by the backend application when:
1. Initializing the application
2. Requesting a new subject's courses and audit data to be added to the database

The return code shall be 0 when the requested operation completed successfully, or non-zero if an error occurred.

# MySQL Schema
The database populated by the scraper contains two primary tables:
1. courses -- this table contains the individual course data scraped from the course catalog
2. audit -- this table contains the data scraped from the degree audit web pages

