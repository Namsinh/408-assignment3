CREATE SCHEMA '408_Assignment3';

CREATE TABLE studentinfo
(
  sid INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  firstname VARCHAR(25),
  lastname VARCHAR(25)
);

CREATE TABLE studentmajor
(
  sid INT,
  major VARCHAR(25),
  CONSTRAINT FOREIGN KEY(sid) REFERENCES studentinfo(sid)
);

CREATE TABLE studentaddress
(
  sid INT,
  address VARCHAR(50),
  CONSTRAINT FOREIGN KEY(sid) REFERENCES studentinfo(sid)
);

CREATE TABLE studentcity
(
  sid INT,
  city VARCHAR(25),
  CONSTRAINT FOREIGN KEY(sid) REFERENCES studentinfo(sid)
);

CREATE TABLE studentphone
(
  sid INT,
  phone VARCHAR(15),
  CONSTRAINT FOREIGN KEY(sid) REFERENCES studentinfo(sid)
);
