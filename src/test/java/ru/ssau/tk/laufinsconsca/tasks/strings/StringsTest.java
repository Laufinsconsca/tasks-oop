package ru.ssau.tk.laufinsconsca.tasks.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.laufinsconsca.tasks.strings.Strings.*;

public class StringsTest {

    String first = "В мире постоянны только монологи";
    String second = "А климат переменится - вот увидишь";

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
        assertFalse(isPalindrome(firstString));
        assertFalse(isPalindrome(secondString));
        assertTrue(isPalindrome(thirdString));
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

    @Test
    public void testIndexOfFirstEntry() {
        assertEquals(indexOfFirstEntry(first, "ир"), 3);
        assertEquals(indexOfFirstEntry(first, "ри"), -1);
    }

    @Test
    public void testIndexOfFirstEntryInSecondPartOfBase() {
        assertEquals(indexOfFirstEntryInSecondPartOfBase(first, "мон"), 24);
        assertEquals(indexOfFirstEntryInSecondPartOfBase(first, "мир"), -1);
    }

    @Test
    public void testIndexOfLastEntryInFirstPartOfBase() {
        assertEquals(indexOfLastEntryInFirstPartOfBase(first, "мир"), 2);
        assertEquals(indexOfLastEntryInFirstPartOfBase(first, "мон"), -1);
    }

    @Test
    public void testTheNumberOfStringThatSatisfyTheCondition() {
        String[] strings = {"Only","a","slight","light","was","getting","into","sight"};
        assertEquals(theNumberOfStringThatSatisfyTheCondition(strings, "s", "t"), 2);
        assertEquals(theNumberOfStringThatSatisfyTheCondition(strings, "r", "i"), 0);
    }
}