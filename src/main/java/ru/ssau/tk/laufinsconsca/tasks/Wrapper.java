package ru.ssau.tk.laufinsconsca.tasks;

class Wrapper {

    @Deprecated
    static Integer boxing(int i){
        return new Integer(i);
    }

    @Deprecated
    static Boolean boxing(boolean b){
        return new Boolean(b);
    }

    static Boolean autoBoxing(boolean i){
        return i;
    }

    static Integer autoBoxing(int i){
        return i;
    }

    static int unboxing(Integer i){
        return i.intValue();
    }

    static boolean unboxing(Boolean b){
        return b.booleanValue();
    }

    static boolean autoUnboxing(Boolean b){
        return b;
    }

    static int autoUnboxing(Integer i){
        return i;
    }
}
