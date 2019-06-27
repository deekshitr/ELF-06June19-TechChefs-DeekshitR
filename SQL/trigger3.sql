DELIMITER $$

DROP TRIGGER /*!50032 IF EXISTS */ `test3`.`Emp_Trigger`$$

CREATE
    /*!50017 DEFINER = 'root'@'localhost' */
    TRIGGER `Emp_Trigger` BEFORE UPDATE ON `employee` 
    FOR EACH ROW BEGIN
    insert into new_emp value(old.id,old.fName,new.salary);
    END;
$$

DELIMITER ;