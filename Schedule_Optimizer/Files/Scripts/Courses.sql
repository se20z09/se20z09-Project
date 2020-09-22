create table development.courses(courseyear varchar(255), 
semester varchar(255),
coursecode varchar(255), 
coursename varchar(255), credit numeric);
drop table development.courses;
insert into development.courses values ("Freshman", "Fall", "CH 101", 
"Chemistry - A Molecular Science", 3);
insert into development.courses values ("Freshman", "Fall", "CH 102", 
"General Chemistry Laboratory", 1);
insert into development.courses values ("Freshman", "Fall", "E 101", 
"Introduction to Engineering & Problem Solving", 1);
insert into development.courses values ("Freshman", "Fall", "E 115", 
"Introduction to Computing Environments", 1);
insert into development.courses values ("Freshman", "Fall", "MA 141", 
"Calculus I", 4);
insert into development.courses values ("Freshman", "Fall", "ENG 101", 
"Acad Writing Research", 4);


insert into development.courses values ("Freshman", "Spring", "CSC 116", 
"Introduction to Computing - Java", 3);
insert into development.courses values ("Freshman", "Spring", "MA 241", 
"Calculus II ", 4);
insert into development.courses values ("Freshman", "Spring", "PY 205", 
"Physics for Engineers and Scientists I", 4);
insert into development.courses values ("Freshman", "Spring", "PY 206", 
"Physics for Engineers and Scientists I Laboratory", 4);
insert into development.courses values ("Freshman", "Spring", "EC 205", 
"Fundamentals of Economics", 3);
insert into development.courses values ("Freshman", "Spring", "E 102", 
"Engineering in the 21st Century", 2);


insert into development.courses values ("Sophomore", "Fall", "CSC 216", 
"Software Development Fundamentals", 3);
insert into development.courses values ("Sophomore", "Fall", "CSC 217", 
"Software Development Fundamentals Lab", 1);
insert into development.courses values ("Sophomore", "Fall", "CSC 226", 
"Discrete Mathematics for Computer Scientists", 3);
insert into development.courses values ("Sophomore", "Fall", "MA 242", 
"Calculus III", 4);
insert into development.courses values ("Sophomore", "Fall", "PY 208", 
"Physics for Engineers and Scientists II", 3);
insert into development.courses values ("Sophomore", "Fall", "PY 209", 
"Physics for Engineers and Scientists II Laboratory", 1);


insert into development.courses values ("Sophomore", "Spring", "CSC 230", 
"C and Software Tools", 3);
insert into development.courses values ("Sophomore", "Spring", "CSC 316", 
"Data Structures and Algorithms", 3);
insert into development.courses values ("Sophomore", "Spring", "MA 305", 
"Introductory Linear Algebra and Matrices", 3);
insert into development.courses values ("Sophomore", "Spring", "AEC 360", 
"Ecology", 3);
insert into development.courses values ("Sophomore", "Spring", "AEC 419", 
"Freshwater Ecology", 3);
insert into development.courses values ("Sophomore", "Spring", "AEC 420", 
"Introduction to Fisheries Science", 3);


insert into development.courses values ("Junior", "Fall", "CSC 236", 
"Computer Organization and Assembly Language", 3);
insert into development.courses values ("Junior", "Fall", "CSC 246", 
"Concepts and Facilities of Operating Systems", 3);
insert into development.courses values ("Junior", "Fall", "CSC 333", 
"Automata, Grammars, and Computability", 3);
insert into development.courses values ("Junior", "Fall", "ST 370", 
"Probability and Statistics for Engineers", 3);


insert into development.courses values ("Junior", "Spring", "CSC 326", 
"Software Engineering", 4);
insert into development.courses values ("Junior", "Spring", "CSC 379", 
"Ethics in Computing", 1);
insert into development.courses values ("Junior", "Spring", "ENG 331", 
"Communication for Engineering and Technology", 3);

insert into development.courses values ("Senior", "All", "CSC 492", 
"Senior Design Project", 3);

insert into development.courses values ("CSC Restricted Electives", "All", "CSC 302", 
"Introduction to Numerical Methods", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 342", 
"Applied Web-based Client-Server Computing", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 401", 
"Data and Computer Communications Networks", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 402", 
"Networking Projects", 3);

insert into development.courses values ("CSC Restricted Electives", "All", "CSC 405", 
"Computer Security", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 406", 
"Architecture Of Parallel Computers", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 411", 
"Introduction to Artificial Intelligence", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 412",
"Compiler Construction", 3);
insert into development.courses values ("CSC Restricted Electives", "All", "CSC 414",
"Foundations of Cryptography", 3);
commit;
select * from development.courses;
