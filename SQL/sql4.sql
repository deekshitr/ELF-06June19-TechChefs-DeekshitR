DELIMITER $$

DROP TRIGGER /*!50032 IF EXISTS */ `test3`.`calc_stude_total_marks`$$

CREATE
    /*!50017 DEFINER = 'root'@'localhost' */
    TRIGGER `calc_stude_total_marks` BEFORE INSERT ON `student` 
    FOR EACH ROW BEGIN
    set new.total=new.kannada+new.english+new.hindi;
    END;
$$

DELIMITER ;