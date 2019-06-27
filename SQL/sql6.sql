DELIMITER $$

DROP TRIGGER /*!50032 IF EXISTS */ `test3`.`calc_stude_total_marks`$$

CREATE
    /*!50017 DEFINER = 'root'@'localhost' */
    TRIGGER `calc_stud_total_percentage` BEFORE INSERT ON `student` 
    FOR EACH ROW BEGIN
    set new.total=(new.kannada+new.english+new.hindi),new.percentage=(((new.total)*100)/300);
    END;
$$

DELIMITER ;