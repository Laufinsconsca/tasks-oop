package ru.ssau.tk.laufinsconsca.tasks.person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SecondPersonTest {
    private Person firstHuman = new Person();
    private Person secondHuman = new Person();
    private Person thirdHuman = new Person();

    @Test
    public void testFirstName() {
        firstHuman.setFirstName("James");
        secondHuman.setFirstName("Kate");
        thirdHuman.setFirstName("David");

        assertEquals(firstHuman.getFirstName(), "James");
        assertEquals(secondHuman.getFirstName(), "Kate");
        assertEquals(thirdHuman.getFirstName(), "David");
    }

    @Test
    public void testLastName() {

        firstHuman.setLastName("Hawkins");
        secondHuman.setLastName("Wilson");
        thirdHuman.setLastName("Melton");

        assertEquals(firstHuman.getLastName(), "Hawkins");
        assertEquals(secondHuman.getLastName(), "Wilson");
        assertEquals(thirdHuman.getLastName(), "Melton");
    }

    @Test
    public void testPassportId() {
        firstHuman.setPassportId(236232);
        secondHuman.setPassportId(833526);
        thirdHuman.setPassportId(919424);

        assertEquals(firstHuman.getPassportId(), 236232);
        assertEquals(secondHuman.getPassportId(), 833526);
        assertEquals(thirdHuman.getPassportId(), 919424);
    }

    @Test
    public void testFirstPersonConstructor() {
        Person nonExistentHuman = new Person();
        nonExistentHuman.setFirstName("Unknown");
        assertEquals(nonExistentHuman.getFirstName(), "Unknown");
    }

    @Test
    public void testSecondPersonConstructor() {
        Person gastarbeiter = new Person("Mike", "Scott");
        assertEquals(gastarbeiter.getFirstName(), "Mike");
        assertEquals(gastarbeiter.getLastName(), "Scott");
    }

    @Test
    public void testThirdPersonConstructor() {
        Person knownForGovernmentHuman = new Person(386466);
        assertEquals(knownForGovernmentHuman.getPassportId(), 386466);
    }

    @Test
    public void testFourthPersonConstructor() {
        Person knownHuman = new Person("Jerrie", "Nelson", 913295);
        assertEquals(knownHuman.getFirstName(), "Jerrie");
        assertEquals(knownHuman.getLastName(), "Nelson");
        assertEquals(knownHuman.getPassportId(), 913295);
    }

    @Test
    public void testFifthPersonConstructor() {
        Person knownHuman = new Person("John", "Reynolds", "MALE", 824288);
        assertEquals(knownHuman.getFirstName(), "John");
        assertEquals(knownHuman.getLastName(), "Reynolds");
        assertEquals(knownHuman.getPassportId(), 824288);
    }

    @Test
    public void testSixthPersonConstructor() {
        Person knownHuman = new Person("Emily", "Griffin", Gender.FEMALE, 114029);
        assertEquals(knownHuman.getFirstName(), "Emily");
        assertEquals(knownHuman.getLastName(), "Griffin");
        assertEquals(knownHuman.getPassportId(), 114029);
    }
}