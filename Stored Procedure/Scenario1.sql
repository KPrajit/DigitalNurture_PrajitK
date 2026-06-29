create table accounts(
    accountid number primary key,
    customername varchar2(50),
    accounttype varchar2(20),
    balance number(10,2)
);

insert into accounts values(101,'A','SAVINGS',10000);
insert into accounts values(102,'B','CURRENT',15000);
insert into accounts values(103,'C','SAVINGS',25000);
insert into accounts values(104,'D','CURRENT',5000);
insert into accounts values(105,'E','SAVINGS',18000);

commit;

create or replace procedure processmonthlyinterest
as
begin

    update accounts
    set balance = balance + (balance * 0.01)
    where accounttype = 'SAVINGS';

    commit;

end;
/

begin
    processmonthlyinterest;
end;
/

select * from accounts;