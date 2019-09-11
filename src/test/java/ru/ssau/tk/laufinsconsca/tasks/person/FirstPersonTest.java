package ru.ssau.tk.laufinsconsca.tasks.person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstPersonTest {
    @Test
    public void test() {
        FirstTask.initializePerson();

        assertEquals(FirstTask.firstHuman.getFirstName(), "James");
        assertEquals(FirstTask.firstHuman.getLastName(), "Hawkins");
        assertEquals(FirstTask.firstHuman.getPassportId(), 236232);

        assertEquals(FirstTask.secondHuman.getFirstName(), "Kate");
        assertEquals(FirstTask.secondHuman.getLastName(), "Wilson");
        assertEquals(FirstTask.secondHuman.getPassportId(), 833526);

        assertEquals(FirstTask.thirdHuman.getFirstName(), "David");
        assertEquals(FirstTask.thirdHuman.getLastName(), "Melton");
        assertEquals(FirstTask.thirdHuman.getPassportId(), 919424);
    }
}