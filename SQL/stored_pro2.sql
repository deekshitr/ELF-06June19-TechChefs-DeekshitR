DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    PROCEDURE `test3`.`stored_emp`()
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    BEGIN

	select * from employee;

    END$$

DELIMITER ;
