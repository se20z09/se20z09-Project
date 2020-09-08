# Create a table within the Development Database
CREATE TABLE Development.USERS (id Integer PRIMARY KEY,firstname VARCHAR(200), lastname VARCHAR(200));

# Insert data into the table users
insert into Development.users(id, firstname, lastname) VALUES (1,'Alice', 'Flinstone');
insert into Development.users(id, firstname, lastname) VALUES (2,'Bob', 'Texton');
insert into Development.users(id, firstname, lastname) VALUES (3,'Dexter', 'McPherson');
insert into Development.users(id, firstname, lastname) VALUES (4,'Lisa', 'Simpson');
insert into Development.users(id, firstname, lastname) VALUES (5,'Diana', 'Warsev');

# Check the data within the table users
select * from Development.users;

# Commit the result only if the data is as expect
commit;