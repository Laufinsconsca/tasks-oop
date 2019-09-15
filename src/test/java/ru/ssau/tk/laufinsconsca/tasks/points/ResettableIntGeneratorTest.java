package ru.ssau.tk.laufinsconsca.tasks.points;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ResettableIntGeneratorTest {
    private IntGenerator generator = new ResettableIntGenerator();
    private int i = generator.nextInt();

    @Test
    public void testNextInt() {
        i = generator.nextInt();
        i = generator.nextInt();
        assertEquals(i, 2, 0.0001);
    }

    @Test
    public void testReset() {
        i = generator.nextInt();
        i = generator.nextInt();
        ((Resettable) generator).reset();
        i = generator.nextInt();
        assertEquals(i, 0, 0.0001);
    }
}