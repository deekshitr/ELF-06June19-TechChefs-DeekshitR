1. WAQ to display all the employee whose name and job is having exactly 5 characters

==> select * from employee where First_Name like'_____' and Job like'_____';

2. WAQ to display all the employee whose job starts with "soft";

==> select * from employee where Job like 'soft%';

3. WAQ to display the maximum salary for each job

==> select job,max(salary) salary,First_Name from employee group by Job;

4. WAQ to display the department numbers along with number of employees working in it.

==> select count(First_Name) No_Of_employees, Dept_no from employee group by Dept_no;

5. WAQ to display the minimum salary for each of the job excluding all the employees whose name end with 'S'.

==> select First_Name , min(salary) salary , job from employee where First_Name NOT like '%s' GROUP BY JOB ;

6. WAQ to display the list of the employees who is working in "Admin" department

==> Select * from employee where Dept_no=(Select Dept_no from department where Dept_name="Admin")

7. WAQ to display the list of the department names who are working as software developer.

==> Select * from department where Dept_no=(Select Dept_no from employee where Job="Software developer")

8. WAQ to display the second maximum salary.

==> Select First_Name,Last_name,Job,max(salary) from employee where Salary<(Select max(Salary) from employee)

9. WAQ to display the third maximum salary.

==> Select First_Name,Last_name,Job,max(salary) from employee where Salary<(Select max(Salary) from employee where 
Salary < (Select max(Salary) from employee))

10. WAQ to display the fourth maximum salary.

==> Select First_Name,Last_name,Job,max(salary) from employee where Salary<(Select max(Salary) from employee where 
Salary < (Select max(Salary) from employee where Salary < (Select max(Salary) from employee)))