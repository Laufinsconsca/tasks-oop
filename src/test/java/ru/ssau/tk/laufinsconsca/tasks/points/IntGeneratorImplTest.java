package ru.ssau.tk.laufinsconsca.tasks.points;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntGeneratorImplTest {
    private IntGenerator generator = new IntGeneratorImpl();
    private int i = generator.nextInt();

    @Test
    public void testNextInt() {
        i = generator.nextInt();
        i = generator.nextInt();
        assertEquals(i, 2, 0.0001);
    }
}