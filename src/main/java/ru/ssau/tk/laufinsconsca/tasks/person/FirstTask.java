package ru.ssau.tk.laufinsconsca.tasks.person;

class FirstTask {
    static Person firstHuman = new Person();
    static Person secondHuman = new Person();
    static Person thirdHuman = new Person();

    static void initializePerson() {
        firstHuman.setFirstName("James");
        firstHuman.setLastName("Hawkins");
        firstHuman.setPassportId(236232);

        secondHuman.setFirstName("Kate");
        secondHuman.setLastName("Wilson");
        secondHuman.setPassportId(833526);

        thirdHuman.setFirstName("David");
        thirdHuman.setLastName("Melton");
        thirdHuman.setPassportId(919424);
    }

    public static void main(String[] args) {

        System.out.println(firstHuman.getFirstName() + " " + firstHuman.getLastName() + ", passport ID: " + firstHuman.getPassportId());
        System.out.println(secondHuman.getFirstName() + " " + secondHuman.getLastName() + ", passport ID: " + secondHuman.getPassportId());
        System.out.println(thirdHuman.getFirstName() + " " + thirdHuman.getLastName() + ", passport ID: " + thirdHuman.getPassportId());

        Person fifthHuman = new Person();
        Person sixthHuman = new Person("Peter", "Craig");
        Person seventhHuman = new Person(246429);
        Person eighthHuman = new Person("Elizabeth", "Bell", 436546);

        System.out.println("Fifth human: unknown");
        System.out.println("Sixth human: " + sixthHuman.getFirstName() + " " + sixthHuman.getLastName() + ", passport ID: unknown");
        System.out.println("Seventh human: noname, passport ID: " + seventhHuman.getPassportId());
        System.out.println("Eighth human: " + eighthHuman.getFirstName() + " " + eighthHuman.getLastName() + ", passport ID: " + eighthHuman.getPassportId());
    }
}
