package test;

import org.testng.annotations.Test;
import ru.ssau.tk.laufinsconsca.tasks.person.Person;

import static org.testng.Assert.assertEquals;

public class SecondPersonTest {
    @Test(groups = {"unit1"})
    public void testFirstName() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        firstHuman.setFirstName("James");
        secondHuman.setFirstName("Kate");
        thirdHuman.setFirstName("David");

        assertEquals(firstHuman.getFirstName(), "James");
        assertEquals(secondHuman.getFirstName(), "Kate");
        assertEquals(thirdHuman.getFirstName(), "David");
    }

    @Test(groups = {"unit1"})
    public void testLastName() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        firstHuman.setLastName("Hawkins");
        secondHuman.setLastName("Wilson");
        thirdHuman.setLastName("Melton");

        assertEquals(firstHuman.getLastName(), "Hawkins");
        assertEquals(secondHuman.getLastName(), "Wilson");
        assertEquals(thirdHuman.getLastName(), "Melton");
    }

    @Test(groups = {"unit1"})
    public void testPassportId() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        firstHuman.setPassportId(236232);
        secondHuman.setPassportId(833526);
        thirdHuman.setPassportId(919424);

        assertEquals(firstHuman.getPassportId(), 236232);
        assertEquals(secondHuman.getPassportId(), 833526);
        assertEquals(thirdHuman.getPassportId(), 919424);
    }

    @Test(groups = {"unit1"})
    public void testFirstPersonConstructor() {
        Person nonExistentHuman = new Person();
        nonExistentHuman.setFirstName("Unknown");
        assertEquals(nonExistentHuman.getFirstName(), "Unknown");
    }

    @Test(groups = {"unit1"})
    public void testSecondPersonConstructor() {
        Person gastarbeiter = new Person("Mike", "Scott");
        assertEquals(gastarbeiter.getFirstName(), "Mike");
        assertEquals(gastarbeiter.getLastName(), "Scott");
    }

    @Test(groups = {"unit1"})
    public void testThirdPersonConstructor() {
        Person knownForGovernmentHuman = new Person(386466);
        assertEquals(knownForGovernmentHuman.getPassportId(), 386466);
    }

    @Test(groups = {"unit1"})
    public void testFourthPersonConstructor() {
        Person knownHuman = new Person("Jerrie", "Nelson", 913295);
        assertEquals(knownHuman.getFirstName(), "Jerrie");
        assertEquals(knownHuman.getLastName(), "Nelson");
        assertEquals(knownHuman.getPassportId(), 913295);
    }
}