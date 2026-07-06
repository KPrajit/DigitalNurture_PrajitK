create table employee(
    employeeid number primary key,
    employeename varchar2(50),
    department varchar2(30),
    salary number(10,2)
);

insert into employee values(1,'John','IT',50000);
insert into employee values(2,'Peter','HR',45000);
insert into employee values(3,'David','IT',60000);
insert into employee values(4,'Mary','Finance',55000);
insert into employee values(5,'Lisa','HR',40000);

commit;

create or replace procedure updateemployeebonus(

    p_department in varchar2,

    p_bonuspercent in number

)
as
begin

    update employee
    set salary = salary + (salary * p_bonuspercent/100)
    where department = p_department;

    commit;

end;
/

begin
    updateemployeebonus('IT',10);
end;
/

select * from employee;