-- PL/SQL Basic Block Structure
-- DECLARE - BEGIN - END

DECLARE
    v_name VARCHAR2(50) := 'Tarun';
    v_age  NUMBER := 21;
    v_city VARCHAR2(50) := 'Mathura';
BEGIN
    DBMS_OUTPUT.PUT_LINE('Name: ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Age: ' || v_age);
    DBMS_OUTPUT.PUT_LINE('City: ' || v_city);
END;