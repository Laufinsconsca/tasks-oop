package ru.ssau.tk.laufinsconsca.tasks.task1_10;

import org.testng.annotations.Test;
import ru.ssau.tk.laufinsconsca.tasks.task1_10.Person;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void test(){
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        firstHuman.setFirstName("James");
        firstHuman.setLastName("Hawkins");
        firstHuman.setPassportId(236232);

        secondHuman.setFirstName("Kate");
        secondHuman.setLastName("Wilson");
        secondHuman.setPassportId(833526);

        thirdHuman.setFirstName("David");
        thirdHuman.setLastName("Melton");
        thirdHuman.setPassportId(919424);

        assertEquals(firstHuman.getFirstName(), "James");
        assertEquals(firstHuman.getLastName(), "Hawkins");
        assertEquals(firstHuman.getPassportId(), 236232);

        assertEquals(secondHuman.getFirstName(), "Kate");
        assertEquals(secondHuman.getLastName(), "Wilson");
        assertEquals(secondHuman.getPassportId(), 833526);

        assertEquals(thirdHuman.getFirstName(), "David");
        assertEquals(thirdHuman.getLastName(), "Melton");
        assertEquals(thirdHuman.getPassportId(), 919424);
    }
}