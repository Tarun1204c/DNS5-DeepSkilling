-- PL/SQL Triggers
-- Automatically execute hota hai jab koi event ho

-- BEFORE INSERT Trigger
CREATE OR REPLACE TRIGGER before_insert_student
BEFORE INSERT ON students
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('New student adding: ' || :NEW.name);
END;

-- AFTER INSERT Trigger  
CREATE OR REPLACE TRIGGER after_insert_student
AFTER INSERT ON students
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Student added successfully: ' || :NEW.name);
END;

-- Test karo
INSERT INTO students VALUES(4, 'Rahul', 78);
