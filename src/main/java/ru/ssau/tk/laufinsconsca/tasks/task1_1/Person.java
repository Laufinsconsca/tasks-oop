package ru.ssau.tk.laufinsconsca.tasks.task1_1;

class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getPassportId() {
        return passportId;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }
}

class Task1_1{
    public static void main(String[] args) {
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

        System.out.println(firstHuman.getFirstName() + " " + firstHuman.getLastName() + ", passport ID: " + firstHuman.getPassportId());
        System.out.println(secondHuman.getFirstName() + " " + secondHuman.getLastName() + ", passport ID: " + secondHuman.getPassportId());
        System.out.println(thirdHuman.getFirstName() + " " + thirdHuman.getLastName() + ", passport ID: " + thirdHuman.getPassportId());
    }
}
