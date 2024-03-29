use anudip;
#1. create table EMPLOYEE
create table EMPLOYEE(Employee_id integer(6), Last_name varchar(25), Job_id Varchar(10), Salary Double, 
Comm_pct float(4,2), Mgr_id integer(6), Department_id integer(4));

#2. Inserting the data in the table EMPLOYEE
 insert into EMPLOYEE values(198, 'Connell','SH_CLERK', 2600, 2.5, 124, 50);
select * from EMPLOYEE;
insert into EMPLOYEE values(199, 'Grant','SH_CLERK', 2600, 2.2, 124, 50);
insert into EMPLOYEE values(200, 'Whalen','AD_ASST', 4400, 1.3, 101, 10);
insert into EMPLOYEE values(201, 'Hartstein','IT_PROG', 6000, null, 100, 20);
insert into EMPLOYEE values(202, 'Fay','AC_MGR', 6500, null, 210, 20);
insert into EMPLOYEE values(203, 'Mavris','AD_VP', 7500, null, 101, 40);
insert into EMPLOYEE values(204, 'Baer','AD_PRES', 3500, 1.5, 101, 90);
insert into EMPLOYEE values(205, 'Higgins','AC_MGR', 2300, null, 101, 60);
insert into EMPLOYEE values(202, 'Gitz','IT_PROGS', 5000, null, 103, 60);
insert into EMPLOYEE values(100, 'King','AD_ASST', 8956, 0.3, 108, 100);
insert into EMPLOYEE values(201, 'Kochar','SH_CLERK', 3400, 1.3, 118, 30);

#3. Display last_name, job_id, employee_id for each employee with employee_id appearing first.
select EMPLOYEE_id, Last_name, Job_id from EMPLOYEE;
#4. Display the details of all employees of department 60
select * from EMPLOYEE Where Department_id = 60; 

#5. Display the employee details of the employee who's lat_name is King.
select * from EMPLOYEE Where Last_name = "King";

#6. Display unique job_id from Employee table. give alias name to the column as JOB_TITLE.
Select Job_id AS JOB_TITLE from EMPLOYEE;

#7. Display last_name, salary and salary increase of Rs300. Give the new column name as 'Increased Salary'.
select Last_name , Salary,(Salary+300) as 'Increased_Salary' from EMPLOYEE;

#8. Display Last_name, salary and annual compensastion of all employees, plus a onetime bonus of Rs 100. Give
# an alias name to the column displaying annual compensastion.
select Last_name, Salary, (Salary*12)+100 as Annual_Compensastion from EMPLOYEE;

#9. Display the details of those employees who get commission. 
select*  from EMPLOYEE where comm_pct is not null;

#10. Display the details of those who do not get the commission. 
select*  from EMPLOYEE where comm_pct is null;

#11. display the Employee_id, Department_id, and Salary of those Employee whose salary is greater than 5000. 
select Employee_id,Department_id,Salary from EMPLOYEE where Salary>5000;

#12.  display the Last_name , and Salary of those Employee whose salary is between 4000 and 7000.
select Last_name , Salary from EMPLOYEE where Salary between 4000 and 7000;

#13. Display the details of all employees whose salary is either 6000 or 6500 or 7000. 
select * from EMPLOYEE where Salary in (6000 ,6500 ,7000);

#14. Display the details of all those employees who work either in department 10 or 20 or 30 or 50.
select * from EMPLOYEE where department_id in (10,20,30,50);

#15. Display the details of all employees whose salary iss not equal to 5000. 
select * from EMPLOYEE where Salary != 5000;

#16. Display the details of all the CLERKS working in the organization. 
select * from EMPLOYEE where Job_id= "SH_CLERK";

#17. Update th job_id of the employees who earn more than 5000 to Grade_A. 
#Display the table EMPLOYEE after updating.
set SQL_SAFE_UPDATES = 0 ;
update EMPLOYEE set Job_id = 'GRADE_A' where Salary >5000;
select * from EMPLOYEE;

#18. Display the details of all those employees who are either CLERK or PROGRAMMER Or ASSISTANT.
select * from EMPLOYEE where Job_id IN ( 'SH_CLERK','IT_PROGS','AD_ASST');

#19. Display those employees from the EMPLOYEE table whose designation is CLERK and salary is less than 3000. 
select * from EMPLOYEE where Job_id = 'SH_CLERK' and Salary < 3000;

#20. Display those employees Last_Name, Mgr_id from the EMPLOYEE table whose salary is above 3000 and work
# under Manager 101.
select Last_name, Mgr_id from EMPLOYEE where salary >3000 and Mgr_id = 101;







