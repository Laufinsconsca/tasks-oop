package ru.ssau.tk.laufinsconsca.tasks.points;

import java.util.Objects;

public class NamedPoint extends Point implements Resettable {
    private String name;

    NamedPoint() {
        super(0, 0, 0);
        this.name = "Origin";
    }

    NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(String name, double x, double y, double z) {
        super(x, y, z);
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }

    @Override
    public String toString() {
        if (Objects.equals(null, name)) return super.toString();
        return name + " " + super.toString();
    }
}
