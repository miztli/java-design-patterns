package com.examples.java.utils;

import java.util.List;

public class Preconditions
{
    public static void isBiggerThanCero(int number, String param) {
        if (number <= 0)
            throw new IllegalArgumentException(
                    String.format("Provided value for %s must be bigger than 0", param));
    }

    public static void isBlank(String string, String param) {
        if(string == null || string.trim().length() <= 0)
            throw new IllegalArgumentException(
                    String.format("Provided value for %s must be bigger than 0", param));
    }

    public static void isNotNull(Object object, String param) {
        if(object == null)
            throw new IllegalArgumentException(
                    String.format("Provided value for %s must not be null", param));
    }

    public static void isNotEmpty(List list, String param) {
        if(list != null && list.isEmpty())
            throw new IllegalArgumentException(
                    String.format("Provided value for %s must contain at least 1 element", param));

    }
}
