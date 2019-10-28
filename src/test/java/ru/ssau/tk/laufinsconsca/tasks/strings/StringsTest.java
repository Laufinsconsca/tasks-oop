package ru.ssau.tk.laufinsconsca.tasks.strings;

import org.testng.annotations.Test;

public class StringsTest {

    @Test
    public void testStringToCharArray() {
        String string = "Test string";
        char[] chars = Strings.getChars(string);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    @Test
    public void testPrintBytes() {
        String firstString = "Test string";
        String secondString = "Тестовая строка";
        Strings.printBytes(firstString);
        Strings.printBytes(secondString);
    }
}