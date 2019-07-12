1) WAQ to display all software developers in dept 30.

Solution ->  select * from employee where job='junior Engineer';

2)WAQ to display the list for all the software developer in dept no 40 and havong salary greater than 5000.

Solution ->  select * from employee where job='junior Engineer' and dept_no=40 and salary>5000;

3) WAQ to display all the employees except those working in dept 10 & 20.

Solution ->  select * from employee where Dept_no NOT IN(10,20);

4) WAQ to display the list the employees who are not working as jun. engineer and clerks in dept 10 & 20 with a salary in the range 10000 to 30000.

Solution ->  select * from employee where job NOT In('junior Engineer' , 'Clerk') and dept_no In(10,20) and salary BETWEEN 10000 and 30000;

5) WAQ to display the list the employees whose salary is not in the range of 10000 to 20000 in dept 10,20,30 except all salesman

Solution ->  select * from employee where salary NOT BETWEEN 10000 and 20000 and Dept_no in(10,20,30) and Job != 'Salesman';

6) WAQ to arrange all the employees by thier salary in descending order

Solution ->  select * from employee ORDER BY Salary DESC;

7) WAQ to display the  maximum salary, minimum salary and total salary from employee

Solution ->  Select max(salary) maximum, min(salary) minimum, sum(salary) sum from employee;

8)  WAQ to display the list of number of software developer in dep 20

Solution ->  Select count(Job) from employee where job='junior Engineer' and dept_no=20;

9)  WAQ to display the list of the highest and lowest salary earned by salesman.

Solution ->  Select max(salary) maximum, min(salary) minimum from employee where job='QA';

10) WAQ to display the total salary of all departments

Solution ->  Select dept_no , sum(salary) from employee GROUP BY dept_no;