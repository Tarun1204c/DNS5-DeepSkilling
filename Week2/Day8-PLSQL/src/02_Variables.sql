-- PL/SQL Variables and Data Types
-- Different types of variables in PL/SQL

DECLARE
    -- VARCHAR2 - text ke liye
    v_name    VARCHAR2(50) := 'Tarun';
    
    -- NUMBER - numbers ke liye
    v_salary  NUMBER(10,2) := 25000.50;
    
    -- BOOLEAN - true/false ke liye
    v_active  BOOLEAN := TRUE;
    
    -- DATE - date ke liye
    v_today   DATE := SYSDATE;
    
    -- NUMBER without decimal
    v_age     NUMBER := 21;

BEGIN
    DBMS_OUTPUT.PUT_LINE('Name: ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Salary: ' || v_salary);
    DBMS_OUTPUT.PUT_LINE('Age: ' || v_age);
    DBMS_OUTPUT.PUT_LINE('Today: ' || v_today);
END;