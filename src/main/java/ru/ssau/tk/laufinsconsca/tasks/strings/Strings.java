package ru.ssau.tk.laufinsconsca.tasks.strings;

public class Strings {
    public static char[] stringToCharArray(String string) {
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }
        return chars;
    }
}
