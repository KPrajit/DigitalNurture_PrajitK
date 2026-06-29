create table Customer(CustomerId int primary key, CustomerName varchar(50),
Age int, Balance decimal(10,2), IsVIP CHAR(1) DEFAULT 'N');

create table Loan( LoanId int primary key, CustomerId int, LoanAmount decimal(10,2),
InterestRate decimal(4,2), DueDate date, foreign key(CustomerId) references Customer(CustomerId));

Insert into Customer values(1,'A',69,19000,'N'),
(2,'B',44,7000,'N'),
(3,'C',20,20000,'N'),
(4,'D',30,10000,'N'),
(5,'E',65,11000,'N');

Insert into Loan values
(1001,1,600000,9.75,SYSDATE+12),
(1002,2,250000,10.50,SYSDATE+50),
(1003,3,750000,8.80,SYSDATE+8),
(1004,4,150000,11.25,SYSDATE+75),
(1005,5,350000,9.20,SYSDATE+25);

BEGIN
    FOR cust IN
    (
        SELECT c.CustomerID,
               l.LoanID
        FROM Customer c
        JOIN Loan l
        ON c.CustomerID = l.CustomerID
        WHERE c.Age > 60
    )
    LOOP
        UPDATE Loan
        SET InterestRate = InterestRate - 1
        WHERE LoanID = cust.LoanID;
    END LOOP;
    COMMIT;
END;
/

BEGIN
    FOR cust IN
    (
        SELECT CustomerID
        FROM Customer
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customer
        SET IsVIP = 'Y'
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

SET SERVEROUTPUT ON;
BEGIN
    FOR loan_rec IN
    (
        SELECT c.CustomerName,
               l.LoanAmount,
               l.DueDate
        FROM Customer c
        JOIN Loan l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate <= SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loan_rec.CustomerName
            || ', your loan amount '
            || loan_rec.LoanAmount
            || ' is due on '
            || TO_CHAR(loan_rec.DueDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/