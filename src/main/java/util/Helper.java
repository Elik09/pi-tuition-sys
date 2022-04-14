package main.java.util;

import org.apache.commons.lang3.RandomStringUtils;


public class Helper {

    private static final int LENGTH = 7;
    private static final boolean USE_LETTERS = false;
    private static final boolean USE_NUMBERS = true;

    public static String generateId(){
        return RandomStringUtils.random(LENGTH, USE_LETTERS, USE_NUMBERS);
    }
}
