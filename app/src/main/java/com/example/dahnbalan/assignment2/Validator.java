package com.example.dahnbalan.assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private String lowerCasePassword = "password";
    private int minLength = 8;

    /**
     * This method is used to validate the password with number of rules
     * @param password
     * @return integer determining how strong the password is
     */
    public int validate (String password) {
        int passed = 0;
        //Password must be greater than minimum length
        if (password.length() >= minLength)
            passed++;
        //Password must not be equal to lowerCase password
        if (!password.equals(lowerCasePassword))
            passed++;

        //Password must have at least one digit
        if (password.matches(".*\\d+.*"))
            passed++;

        //Password must have at least one symbol
        Pattern symbolPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher symbolMatcher = symbolPattern.matcher(password);
        if (!symbolMatcher.matches())
            passed++;

        //Password must have upperCase and lowerCase characters
        if (!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()))
            passed++;

        return passed;
    }
}
