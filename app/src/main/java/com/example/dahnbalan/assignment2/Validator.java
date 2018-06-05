package com.example.dahnbalan.assignment2;

public class Validator {
    private String passwordVerification = "password";
    private int minLength = 8;

    public int validate (String password) {
        int passed = 0;
        if (password.length() >= minLength)
            passed++;
        if (!password.equals(passwordVerification))
            passed++;
        return passed;
    }
}
