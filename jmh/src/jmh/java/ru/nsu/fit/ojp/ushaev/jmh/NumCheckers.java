package ru.nsu.fit.ojp.ushaev.jmh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumCheckers {

    private final Pattern pattern = Pattern.compile("^\\d+$");

    public Boolean checkUsingException(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean checkEverySymbol(String str) {
        for (char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)) return false;
        }
        return true;
    }

    public boolean checkUsingCompiledRegexp(String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean checkUsingRegexp(String str) {
        return str.matches("^\\d+$");
    }
}
