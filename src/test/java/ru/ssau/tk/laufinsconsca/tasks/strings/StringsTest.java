package ru.ssau.tk.laufinsconsca.tasks.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
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
        assertTrue(isPalindrome(firstString));
        assertTrue(isPalindrome(secondString));
        assertTrue(isPalindrome(thirdString));
        System.out.println(isPalindrome(secondString));
        System.out.println(isPalindrome(thirdString));
    }

    @Test
    public void testIsDifferOnlyInCase() {
        String firstString = "ABCDEF";
        String secondString = "abcdef";
        String thirdString = "ghijkl";
        assertTrue(Strings.isDifferOnlyInCase(firstString, secondString));
        assertFalse(Strings.isDifferOnlyInCase(secondString, secondString));
        assertFalse(Strings.isDifferOnlyInCase(secondString, thirdString));
        assertFalse(Strings.isDifferOnlyInCase(null, secondString));
        assertFalse(Strings.isDifferOnlyInCase(firstString, null));
        assertFalse(Strings.isDifferOnlyInCase(null, null));
    }
}