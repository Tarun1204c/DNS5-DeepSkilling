-- PL/SQL Stored Procedures
-- IN, OUT, IN OUT parameters

-- Procedure banao
CREATE OR REPLACE PROCEDURE greet_student(
    p_name IN VARCHAR2,
    p_message OUT VARCHAR2
) AS
BEGIN
    p_message := 'Hello ' || p_name || '! Welcome to PL/SQL';
END;

-- Procedure call karo
DECLARE
    v_msg VARCHAR2(100);
BEGIN
    greet_student('Tarun', v_msg);
    DBMS_OUTPUT.PUT_LINE(v_msg);
END;