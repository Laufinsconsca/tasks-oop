package ru.ssau.tk.laufinsconsca.tasks.strings;

import java.util.Objects;

public class Strings {

    public static void main(String[] args) {
        testEquals();
        forCharacterEscaping();
    }

    public static char[] getChars(String string) {
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }
        return chars;
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

    public static void forCharacterEscaping(){
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
        return base.indexOf(searchable, base.length()/2);
    }



}
