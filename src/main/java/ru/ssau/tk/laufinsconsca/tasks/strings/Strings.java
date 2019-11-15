package ru.ssau.tk.laufinsconsca.tasks.strings;

public class Strings {

    public static void main(String[] args) {
        testEquals();
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

    public static void testEquals(){
        String first = "Test";
        String second = new String(first);
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
