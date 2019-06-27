DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    TRIGGER `e BEFORE INSERT
    ON `employee`.`new_emp`
    FOR EACH ROW BEGIN
    insert into new_emp values(new_emp_id,new_emp_name,new_emp_salary);
    END$$

DELIMITER ;