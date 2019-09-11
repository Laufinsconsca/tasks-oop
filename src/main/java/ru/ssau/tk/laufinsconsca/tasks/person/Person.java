package ru.ssau.tk.laufinsconsca.tasks.person;

class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    Person() {
        this.firstName = null;
        this.lastName = null;
        this.passportId = 0;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(int passportId) {
        this.passportId = passportId;
    }

    Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

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

