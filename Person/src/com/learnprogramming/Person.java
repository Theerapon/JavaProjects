package com.learnprogramming;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20) ? true : false;
    }

    public String getFullName() {
        String fullName;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            fullName = "Unknown";
        } else if (lastName.isEmpty()) {
            fullName = firstName;
        } else if (firstName.isEmpty()) {
            fullName = lastName;
        } else {
            fullName = String.format("%s %s", firstName, lastName);
        }
        return fullName;
    }
}
