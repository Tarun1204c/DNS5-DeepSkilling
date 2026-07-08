-- PL/SQL Conditions
-- IF-THEN-ELSE and CASE statements

DECLARE
    v_marks NUMBER := 75;
    v_grade VARCHAR2(10);

BEGIN
    -- IF-THEN-ELSE
    IF v_marks >= 90 THEN
        v_grade := 'A';
    ELSIF v_marks >= 75 THEN
        v_grade := 'B';
    ELSIF v_marks >= 60 THEN
        v_grade := 'C';
    ELSE
        v_grade := 'F';
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('Marks: ' || v_marks);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || v_grade);

    -- CASE Statement
    CASE v_grade
        WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Excellent!');
        WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Good!');
        WHEN 'C' THEN DBMS_OUTPUT.PUT_LINE('Average!');
        ELSE DBMS_OUTPUT.PUT_LINE('Fail!');
    END CASE;

END; 