package ru.ssau.tk.laufinsconsca.tasks;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WrapperTest {
    @Test
    @Deprecated
    public void test() {
        int i = 5;
        int j = 3;
        boolean b = true;
        Integer I = Wrapper.boxing(i);
        Boolean conditionTrue = Wrapper.boxing(b);
        Boolean conditionFalse = Wrapper.autoBoxing(!b);
        Boolean conditionNull = null;
        if (Boolean.TRUE.equals(conditionTrue)) {
            b = Wrapper.unboxing(!conditionTrue);
            if (!b) {
                assertEquals(Wrapper.autoUnboxing(++I), ++i, 0.00001);
                assertTrue(Wrapper.autoUnboxing(conditionTrue));
            }
        }
        try {
            if (conditionNull) {
            }
        } catch (NullPointerException e) {
            System.out.println("This block of code throws NullPointerException");
        }
        if (Boolean.TRUE.equals(conditionTrue)) {
            Integer J = Wrapper.autoBoxing(j);
            ToConsole.printType(J);
            ToConsole.printType((int) J);
            ToConsole.printType(Wrapper.autoBoxing(J == j));
            ToConsole.printType(J == j);
        }
        if (Boolean.TRUE.equals(conditionNull)) {
            System.out.println("This block of code will not be executed");
        }
        if (Boolean.TRUE.equals(conditionFalse)) {
            System.out.println("This block of code will not be executed");
        }
        if (conditionFalse != Wrapper.autoBoxing(Wrapper.autoBoxing(Wrapper.unboxing(I) - 1) + 1).equals(I))
            assertFalse(conditionFalse);
    }

}