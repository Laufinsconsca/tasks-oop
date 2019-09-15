package ru.ssau.tk.laufinsconsca.tasks.points;

class NamedPoint extends Point{
    private String name;

    NamedPoint(){
        super(0, 0, 0);
        this.name = "Origin";
    }

    NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    NamedPoint(String name, double x, double y, double z) {
        super(x, y, z);
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
