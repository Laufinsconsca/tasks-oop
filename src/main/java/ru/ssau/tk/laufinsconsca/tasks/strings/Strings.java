package ru.ssau.tk.laufinsconsca.tasks.strings;

import java.nio.charset.Charset;
import java.util.Objects;

public class Strings {

    public static void main(String[] args) {
        testEquals();
        forCharacterEscaping();
        findOutCharset();
    }

    public static void getChars(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public static void printBytes(String string) {
        byte[] bytes = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(bytes[i]);
        }
    }

    public static void testEquals() {
        String first = "Test";
        String second = first;
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }

    public static boolean isPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != string.charAt(length - 1 - i)) return false;
        }
        return true;
    }

    public static boolean isDifferOnlyInCase(String first, String second) {
        return !Objects.equals(null, first) && !Objects.equals(null, second) && !first.equals(second) && first.equalsIgnoreCase(second);
    }

    public static void forCharacterEscaping() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public static int indexOfFirstEntry(String base, String searchable) {
        return base.indexOf(searchable);
    }

    public static int indexOfFirstEntryInSecondPartOfBase(String base, String searchable) {
        return base.indexOf(searchable, base.length() / 2);
    }

    public static int indexOfLastEntryInFirstPartOfBase(String base, String searchable) {
        return base.lastIndexOf(searchable, base.length() / 2);
    }

    public static int theNumberOfStringThatSatisfyTheCondition(String[] strings, String prefix, String suffix) {
        int number = 0;
        for (String string : strings) {
            if (string.startsWith(prefix) && string.endsWith(suffix)) number++;
        }
        return number;
    }

    public static int theNumberOfStringThatSatisfyTheConditionWithTrim(String[] strings, String prefix, String suffix) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        return theNumberOfStringThatSatisfyTheCondition(strings, prefix, suffix);
    }

    public static String recursiveReplaceAll(String base, String replaceable, String replacer) {
        for (int i = 0; i < 100 && base.contains(replaceable); i++) {
            base = base.replaceAll(replaceable, replacer);
        }
        return base;
    }

    public static String extendedSubstring(String base, int from, int to) {
        if (from >= to) return "";
        if (from < 0) from = 0;
        if (to > base.length()) to = base.length();
        return base.substring(from, to);
    }

    public static void displayTheObjectInConsole(Object obj) {
        System.out.println(obj);
    }

    public static String[] upperCaseSplit(String string) {
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].isEmpty()) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
            }
        }
        return strings;
    }

    public static String concatArray(String[] array) {
        return String.join(", ", array);
    }

    public static String replaceTheEvenCharactersWithTheirNumbersAndRevert(String string) {
        StringBuilder builder = new StringBuilder(string);
        int j = -2;
        int t;
        for (int i = 0; i < string.length(); i += 2) {
            j += 2;
            builder.replace(j, j + 1, i + "");
            t = j;
            while (t > 9) {
                t /= 10;
                j++;
            }
        }
        return builder.reverse().toString();
    }

    public static String getStrEnumOfNumsInAscOrder(int to) throws IllegalArgumentException{
        if (to < 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < to; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    public static void findOutCharset(){
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    public static void changeCharset(String firstString, Charset first, Charset second){
        String secondString = new String(firstString.getBytes(first), second);
        System.out.println(secondString);
    }
}
