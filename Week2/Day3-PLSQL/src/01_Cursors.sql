-- PL/SQL Cursors
-- Implicit aur Explicit Cursors

-- 1. Implicit Cursor
BEGIN
    UPDATE employees SET salary = salary + 1000
    WHERE department = 'IT';
    
    DBMS_OUTPUT.PUT_LINE('Rows updated: ' || SQL%ROWCOUNT);
END;

-- 2. Explicit Cursor
DECLARE
    CURSOR c_students IS
        SELECT name, marks FROM students;
    
    v_name   VARCHAR2(50);
    v_marks  NUMBER;
BEGIN
    OPEN c_students;
    LOOP
        FETCH c_students INTO v_name, v_marks;
        EXIT WHEN c_students%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(v_name || ' - ' || v_marks);
    END LOOP;
    CLOSE c_students;
END;