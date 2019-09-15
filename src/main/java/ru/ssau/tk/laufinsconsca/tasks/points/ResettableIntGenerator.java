package ru.ssau.tk.laufinsconsca.tasks.points;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    private int countCalls = 0;

    @Override
    public int nextInt() {
        return countCalls++;
    }

    @Override
    public void reset() {
        countCalls = 0;
    }
}
