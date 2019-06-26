select * from employee cross join department;

select e.fName,e.salary,e.deptId,d.id,d.name from employee e cross join department d;

select * from employee e inner join department d on e.deptId=d.id;

select * from employee e left join department d on e.deptId=d.id;

select * from employee e right join department d on e.deptId=d.id;

select e.fName,e.salary,d.name,d.location from employee e inner join department d on e.deptId=d.id;

select e.fName,d.name,d.location from employee e inner join department d on e.deptId=d.id where e.fName like 'S%d';

Select * from view_emp;

Select * from view_dept;

select id,name from view_dept;

call stored_emp(1,"IT");