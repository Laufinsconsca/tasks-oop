package ru.ssau.tk.laufinsconsca.tasks.strings;

import org.testng.annotations.Test;

import static ru.ssau.tk.laufinsconsca.tasks.strings.Strings.isPalindrome;

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
        String secondString = "Test строка";
        String thirdString = "Тестовая строка";
        Strings.printBytes(firstString);
        System.out.println();
        Strings.printBytes(secondString);
        System.out.println();
        Strings.printBytes(thirdString);
    }

    @Test
    public void testIsPalindrome() {
        String firstString = "градиент";
        String secondString = "дивергенция";
        String thirdString = "ротор";
        System.out.println(isPalindrome(firstString));
        System.out.println(isPalindrome(secondString));
        System.out.println(isPalindrome(thirdString));
    }
}