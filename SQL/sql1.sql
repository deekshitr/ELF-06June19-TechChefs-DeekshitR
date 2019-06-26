Select * from employee;

Select * from employee where salary = (select max(salary) from employee);

Select * from employee where salary = (select max(salary) from employee where salary < ((select max(salary) from employee)));

Select * from employee where deptId in((Select deptId from employee group by deptId)) order by deptId;

Select fName, salary, deptId from employee where salary in (Select max(salary) as max_sal from employee group by deptId);

insert into project (select * from department);
select * from project;