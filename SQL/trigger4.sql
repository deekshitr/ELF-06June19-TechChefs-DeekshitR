DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    TRIGGER `test3`.`calc_stude_total_marks` BEFORE INSERT
    ON `test3`.`student`
    FOR EACH ROW BEGIN
    set new.total=new.kannada_new.english+new.hindi;
    END$$

DELIMITER ;