show databases;
create database test_db_15;
use test_db_15;
create table EmployeeDetails(
    id INT AUTO_INCREMENT PRIMARY KEY,
Name varchar(200),
Mail_Id varchar(200),
PhoneNumber varchar(200));
alter table EmployeeDetails add Password varchar(255);
select* from EmployeeDetails;
drop database test_db_15;

