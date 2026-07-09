-- PL/SQL Packages
-- Package = related procedures aur functions ka group

-- Package Specification
CREATE OR REPLACE PACKAGE student_pkg AS
    PROCEDURE add_student(p_name VARCHAR2, p_marks NUMBER);
    FUNCTION get_grade(p_marks NUMBER) RETURN VARCHAR2;
END student_pkg;

-- Package Body
CREATE OR REPLACE PACKAGE BODY student_pkg AS

    PROCEDURE add_student(p_name VARCHAR2, p_marks NUMBER) AS
    BEGIN
        INSERT INTO students(name, marks) VALUES(p_name, p_marks);
        DBMS_OUTPUT.PUT_LINE('Student added: ' || p_name);
    END;

    FUNCTION get_grade(p_marks NUMBER) RETURN VARCHAR2 AS
    BEGIN
        IF p_marks >= 75 THEN RETURN 'Pass';
        ELSE RETURN 'Fail';
        END IF;
    END;

END student_pkg;

-- Package use karo
BEGIN
    student_pkg.add_student('Tarun', 85);
    DBMS_OUTPUT.PUT_LINE(student_pkg.get_grade(85));
END;