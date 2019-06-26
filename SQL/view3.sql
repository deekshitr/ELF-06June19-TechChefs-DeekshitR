DELIMITER $$

DROP VIEW IF EXISTS `test3`.`view_dept`$$

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_dept` AS (select `department`.`id` AS `id`,`department`.`name` AS `name`,`department`.`location` AS `location` from `department` where id in (2,3))$$

DELIMITER ;

