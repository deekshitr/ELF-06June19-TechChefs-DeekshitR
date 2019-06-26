DELIMITER $$

DROP PROCEDURE IF EXISTS `test3`.`stored_emp`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `stored_emp`(in deptIds int,in deptname varchar(255))
BEGIN
	select * from department where id=deptIds or name=deptname;
    END$$

DELIMITER ;