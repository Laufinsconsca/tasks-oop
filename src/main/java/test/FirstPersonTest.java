package test;

import org.testng.annotations.Test;
import ru.ssau.tk.laufinsconsca.tasks.person.FirstTask;
import ru.ssau.tk.laufinsconsca.tasks.person.Person;

import static org.testng.Assert.assertEquals;

public class FirstPersonTest {
    @Test
    public void test() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        FirstTask.initializePerson();

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