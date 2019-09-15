package ru.ssau.tk.laufinsconsca.tasks;

import org.testng.annotations.Test;
import ru.ssau.tk.laufinsconsca.tasks.person.Person;
import ru.ssau.tk.laufinsconsca.tasks.points.Point;

public class ToConsoleTest {

    @Test
    public void printType() {
        ToConsole.printType((byte) 5);
        ToConsole.printType('a');
        ToConsole.printType((short) 5);
        ToConsole.printType(5);
        ToConsole.printType(5L);
        ToConsole.printType(5.1f);
        ToConsole.printType(5.2d);
        ToConsole.printType(true);
        ToConsole.printType(new Person());
        ToConsole.printType(new Point(0, 0, 0));
        ToConsole.printType(Integer.valueOf(5));
        ToConsole.printType("a");
    }

}