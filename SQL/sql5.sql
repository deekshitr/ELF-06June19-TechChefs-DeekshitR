DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    TRIGGER `test3`.`calc_stud_percentage` BEFORE/AFTER INSERT/UPDATE/DELETE
    ON `test3`.``
    FOR EACH ROW BEGIN

    END$$

DELIMITER ;