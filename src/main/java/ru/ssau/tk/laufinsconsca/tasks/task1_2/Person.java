package ru.ssau.tk.laufinsconsca.tasks.task1_2;

class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    Person(){}

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(int passportId){
        this.passportId = passportId;
    }

    Person(String firstName, String lastName, int passportId){
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

class Task1_2{
    public static void main(String[] args) {
        Person firstHuman = new Person();
        Person secondHuman = new Person("Peter", "Craig");
        Person thirdHuman = new Person(246429);
        Person fourthHuman = new Person("Elizabeth", "Bell", 436546);

        System.out.println("First human: unknown");
        System.out.println("Second human: " + secondHuman.getFirstName() + " " + secondHuman.getLastName() + ", passport ID: unknown");
        System.out.println("Third human: noname, passport ID: " + thirdHuman.getPassportId());
        System.out.println("Fourth human: " + fourthHuman.getFirstName() + " " + fourthHuman.getLastName() + ", passport ID: " + fourthHuman.getPassportId());
    }
}
