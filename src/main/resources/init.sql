create schema if not  exists employee;
use schema employee;

CREATE TABLE if not  exists employee(

id int unsigned primary key auto_increment
name varchar (45) not null,
lastName varchar (45) not null ,
salary decimal (7,2) not null,
email varchar (45) unique not null,

);

create table if not exists agreements(

id int primary key AUTO_INCREMENT,
number varchar (20) unique not null,
creationDate datetime not null default current_timestamp,
updateDate datetime,
expiryDate datetime,
state varchar (20) not null,
agreementType varchar (20) not null,
description varchar (400),
role varchar (45) not null,
lengthInMonth int not null,

);

