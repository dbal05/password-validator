package com.example.dahnbalan.assignment2;

public class Validator {
    private String passwordVerification = "password";
    private int minLength = 8;

    /**
     * This method is used to validate the password with number of rules
     * @param password
     * @return integer determining how strong the password is
     */
    public int validate (String password) {
        int passed = 0;
        if (password.length() >= minLength)
            passed++;
        if (!password.equals(passwordVerification))
            passed++;
        return passed;
    }
}
