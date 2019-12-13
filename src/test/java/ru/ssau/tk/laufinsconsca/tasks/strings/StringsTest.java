package ru.ssau.tk.laufinsconsca.tasks.strings;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.laufinsconsca.tasks.matrix.Matrix;
import ru.ssau.tk.laufinsconsca.tasks.person.Person;
import ru.ssau.tk.laufinsconsca.tasks.points.NamedPoint;
import ru.ssau.tk.laufinsconsca.tasks.points.Point;

import static org.testng.Assert.*;
import static ru.ssau.tk.laufinsconsca.tasks.strings.Strings.*;

public class StringsTest {

    String first = "В мире постоянны только монологи";
    String second = "А климат переменится - вот увидишь"; // Смешарики: Монологи (181 серия)

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
        String[] strings = {"Only", "a", "slight", "light", "was", "getting", "into", "sight"};
        assertEquals(theNumberOfStringThatSatisfyTheCondition(strings, "s", "t"), 2);
        assertEquals(theNumberOfStringThatSatisfyTheCondition(strings, "r", "i"), 0);
    }

    @Test
    public void testTheNumberOfStringThatSatisfyTheConditionWithTrim() {
        assertEquals(theNumberOfStringThatSatisfyTheCondition(
                new String[]{"Only", "a", " slight", "light", "was", "getting", "into", "sight "}, "s", "t"),
                0);
        assertEquals(theNumberOfStringThatSatisfyTheConditionWithTrim(
                new String[]{"Only", "a", " slight", "light", "was", "getting", "into", "sight "}, "s", "t"),
                2);
    }

    @Test
    public void testRecursiveReplaceAll() {
        Assert.assertEquals(recursiveReplaceAll("opopopopo", "opo", "po"), "popppo");
    }

    @Test
    public void testExtendedSubstring() {
        String string = "imperturbability";
        assertEquals(extendedSubstring(string, -2, 18), string);
        assertEquals(extendedSubstring(string, 18, -2), "");
        assertEquals(extendedSubstring(string, 2, 18), string.substring(2));
        assertEquals(extendedSubstring(string, -2, 14), string.substring(0, 14));
        assertEquals(extendedSubstring(string, 2, 14), string.substring(2, 14));
    }

    @Test
    public void testDisplayTheObjectInConsole() {
        Matrix matrix = new Matrix(3, 3);
        matrix.set(1, 1, 1);
        matrix.set(1, 2, 2);
        matrix.set(1, 3, 3);
        matrix.set(2, 1, 4);
        matrix.set(2, 2, 10);
        matrix.set(2, 3, 12);
        matrix.set(3, 1, -7);
        matrix.set(3, 2, 8);
        matrix.set(3, 3, -9);
        displayTheObjectInConsole(matrix);
        displayTheObjectInConsole(new Person("James", "Hawkins", 236232));
        displayTheObjectInConsole(new Point(1, 4, 3));
        displayTheObjectInConsole(new NamedPoint("x", 1, 4, 3));
        displayTheObjectInConsole(5);
        displayTheObjectInConsole(4.);
        displayTheObjectInConsole(new Complex(2, -3));
    }

    @Test
    public void testUpperCaseSplit() {
        String[] firstStrings = upperCaseSplit(first);
        String[] secondStrings = upperCaseSplit(second);
        for (String string : firstStrings) {
            System.out.println(string);
        }
        for (String string : secondStrings) {
            System.out.println(string);
        }
    }

    @Test
    public void testConcatArray() {
        String[] strings = {"Only", "a", "slight", "light", "was", "getting", "into", "sight"};
        assertEquals(Strings.concatArray(strings), "Only, a, slight, light, was, getting, into, sight");
    }

    @Test
    public void testReplaceTheEvenCharactersWithTheirNumbersAndRevert() {
        assertEquals(Strings.replaceTheEvenCharactersWithTheirNumbersAndRevert("imperturbability"), "y41i21i01a8r6t4e2m0");
    }

    @Test
    public void testGetStrEnumOfNumsInAscOrder() {
        assertEquals(Strings.getStrEnumOfNumsInAscOrder(0), "");
        assertEquals(Strings.getStrEnumOfNumsInAscOrder(1), "0");
        assertEquals(Strings.getStrEnumOfNumsInAscOrder(5), "01234");
        assertThrows(IllegalArgumentException.class, () -> Strings.getStrEnumOfNumsInAscOrder(-1));
        System.out.println(Strings.getStrEnumOfNumsInAscOrder(10000));
    }
}