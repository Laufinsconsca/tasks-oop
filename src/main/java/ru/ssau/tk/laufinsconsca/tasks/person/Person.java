package ru.ssau.tk.laufinsconsca.tasks.person;

class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    private Gender gender;

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

    /**
     * @param firstName - имя
     * @param lastName - фамилия
     * @param gender - пол (MALE или FEMALE, строковое поле)
     * @param passportId - номер паспорта
     */

    Person(String firstName, String lastName, String gender, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = Gender.valueOf(gender);
    }

    /**
     * @param firstName - имя
     * @param lastName - фамилия
     * @param gender - пол (MALE или FEMALE, поле типа Gender)
     * @param passportId - номер паспорта
     */

    Person(String firstName, String lastName, Gender gender, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
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

