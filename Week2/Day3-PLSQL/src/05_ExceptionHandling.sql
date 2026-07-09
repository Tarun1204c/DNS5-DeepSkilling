-- PL/SQL Exception Handling

DECLARE
    v_result NUMBER;
BEGIN
    -- Intentional error - divide by zero
    v_result := 10 / 0;
    DBMS_OUTPUT.PUT_LINE('Result: ' || v_result);

EXCEPTION
    WHEN ZERO_DIVIDE THEN
        DBMS_OUTPUT.PUT_LINE('Error: Zero se divide nahi kar sakte!');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unknown Error: ' || SQLERRM);
END;