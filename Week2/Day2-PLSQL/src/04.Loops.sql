-- PL/SQL Loops
-- FOR, WHILE, LOOP

BEGIN
    -- 1. Simple LOOP
    DECLARE
        v_count NUMBER := 1;
    BEGIN
        LOOP
            DBMS_OUTPUT.PUT_LINE('Simple Loop: ' || v_count);
            v_count := v_count + 1;
            EXIT WHEN v_count > 3;
        END LOOP;
    END;

    -- 2. WHILE LOOP
    DECLARE
        v_num NUMBER := 1;
    BEGIN
        WHILE v_num <= 3 LOOP
            DBMS_OUTPUT.PUT_LINE('While Loop: ' || v_num);
            v_num := v_num + 1;
        END LOOP;
    END;

    -- 3. FOR LOOP
    BEGIN
        FOR i IN 1..3 LOOP
            DBMS_OUTPUT.PUT_LINE('For Loop: ' || i);
        END LOOP;
    END;

END;
