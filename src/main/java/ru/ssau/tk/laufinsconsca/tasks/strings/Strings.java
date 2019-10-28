package ru.ssau.tk.laufinsconsca.tasks.strings;

public class Strings {
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
}
