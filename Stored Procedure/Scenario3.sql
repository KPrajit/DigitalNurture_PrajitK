create table bankaccount(

    accountid number primary key,

    customername varchar2(50),

    balance number(10,2)

);

insert into bankaccount values(101,'A',15000);
insert into bankaccount values(102,'B',12000);
insert into bankaccount values(103,'C',5000);

commit; 

create or replace procedure transferfunds(

    p_fromaccount in number,

    p_toaccount in number,

    p_amount in number

)
as

    v_balance number;

begin

    select balance
    into v_balance
    from bankaccount
    where accountid = p_fromaccount;

    if v_balance >= p_amount then

        update bankaccount
        set balance = balance - p_amount
        where accountid = p_fromaccount;

        update bankaccount
        set balance = balance + p_amount
        where accountid = p_toaccount;

        commit;

        dbms_output.put_line('Transfer Successful');

    else

        dbms_output.put_line('Insufficient Balance');

    end if;

end;
/

set serveroutput on;

begin
    transferfunds(101,102,3000);
end;
/

select * from bankaccount;