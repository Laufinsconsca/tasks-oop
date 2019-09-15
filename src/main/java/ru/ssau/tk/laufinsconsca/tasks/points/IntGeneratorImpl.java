package ru.ssau.tk.laufinsconsca.tasks.points;

public class IntGeneratorImpl implements IntGenerator {
    private int countCalls = 0;

    @Override
    public int nextInt() {
        return countCalls++;
    }
}
