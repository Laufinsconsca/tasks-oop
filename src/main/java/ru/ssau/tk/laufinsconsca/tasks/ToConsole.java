package ru.ssau.tk.laufinsconsca.tasks;

class ToConsole {

    static void printType(byte type) {
        System.out.println("byte");
    }

    static void printType(char type) {
        System.out.println("char");
    }

    static void printType(short type) {
        System.out.println("short");
    }

    static void printType(int type) {
        System.out.println("int");
    }

    static void printType(long type) {
        System.out.println("long");
    }

    static void printType(float type) {
        System.out.println("float");
    }

    static void printType(double type) {
        System.out.println("double");
    }

    static void printType(boolean type) {
        System.out.println("boolean");
    }

    static void printType(Object type) {
        if (type == null) {
            System.out.println("null");
        } else {
            System.out.println(type.getClass().getSimpleName());
        }
    }
}
