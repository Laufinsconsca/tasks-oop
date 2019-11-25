package ru.ssau.tk.laufinsconsca.tasks.person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testToString() {
        Person firstPerson = new Person("James", "Hawkins", 236232);
        Person secondPerson = new Person("Kate", "Wilson", 833526);
        Person thirdPerson = new Person("David", "Melton", 919424);
        assertEquals(firstPerson.toString(), "James Hawkins");
        assertEquals(secondPerson.toString(), "Kate Wilson");
        assertEquals(thirdPerson.toString(), "David Melton");
        secondPerson.setLastName("");
        assertEquals(secondPerson.toString(), "Kate");
        thirdPerson.setFirstName("");
        assertEquals(thirdPerson.toString(), "Melton");
        firstPerson.setFirstName("");
        firstPerson.setLastName("");
        assertEquals(firstPerson.toString(), "");
    }
}