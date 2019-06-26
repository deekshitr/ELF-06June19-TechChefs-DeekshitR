DELIMITER $$

DROP VIEW IF EXISTS `test3`.`view_emp`$$

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_emp` AS (select `employee`.`id` AS `id`,`employee`.`fName` AS `fName`,`employee`.`lName` AS `lName`,`employee`.`age` AS `age`,`employee`.`salary` AS `salary`,`employee`.`joiningDate` AS `joiningDate`,`employee`.`emailId` AS `emailId`,`employee`.`deptId` AS `deptId` from `employee` where deptId in (1,2))$$

DELIMITER ;

Select * from view_emp;