package com.example.dahnbalan.assignment2;

import org.junit.Test;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ValidatorUnitTest {
    static Validator validator;


    @BeforeClass
    public static void init () {
        validator = new Validator ();
    }

    @Test
    public void shortPassword () {
        int passed = validator.validate("jamie");
        assertEquals(passed,1);
    }

    @Test
    public void longPassword () {
        int passed = validator.validate("prometheus");
        assertEquals(passed, 2);
    }

    @Test
    public void isMinLength() {
        int passed = validator.validate("highjack");
        assertEquals(passed, 2);
    }

    @Test
    public void isLowerCasePassword () {
        int passed = validator.validate("password");
        assertEquals(passed, 1);
    }


}