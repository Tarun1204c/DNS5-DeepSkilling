-- PL/SQL Functions
-- Procedure vs Function - Function value return karta hai

-- Function banao
CREATE OR REPLACE FUNCTION calculate_grade(
    p_marks IN NUMBER
) RETURN VARCHAR2 AS
    v_grade VARCHAR2(10);
BEGIN
    IF p_marks >= 90 THEN
        v_grade := 'A';
    ELSIF p_marks >= 75 THEN
        v_grade := 'B';
    ELSIF p_marks >= 60 THEN
        v_grade := 'C';
    ELSE
        v_grade := 'F';
    END IF;
    
    RETURN v_grade;
END;

-- Function call karo
DECLARE
    v_result VARCHAR2(10);
BEGIN
    v_result := calculate_grade(85);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || v_result);
END;