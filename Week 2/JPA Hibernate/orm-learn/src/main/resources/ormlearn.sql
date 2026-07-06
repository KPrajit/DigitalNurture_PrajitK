show databases;
drop database omrlearn;
create database ormlearn;
use ormlearn;
create table country(
code varchar(2) primary key,
name varchar(50)
);

insert into country values('IN','INDIA'),('US','UNITED STATES');
select * from country;