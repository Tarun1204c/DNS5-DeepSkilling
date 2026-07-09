-- PL/SQL Triggers
-- BEFORE, AFTER, INSTEAD OF

CREATE OR REPLACE TRIGGER before_insert_student
BEFORE INSERT ON students
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('New student being added: ' || :NEW.name);
END;