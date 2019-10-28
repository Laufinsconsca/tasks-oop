package ru.ssau.tk.laufinsconsca.tasks.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {

    @Test
    public void testStringToCharArray() {
        String string = "Test string";
        char[] chars = Strings.stringToCharArray(string);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}