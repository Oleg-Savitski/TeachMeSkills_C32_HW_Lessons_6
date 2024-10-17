package com.teachmeskills.lesson_6.task_1;

class Student {
    private final String firstName;
    private final String lastName;
    private final int student_ID_card;
    private final String groupName;
    private final int age;
    private final String maritalStatus;

    public Student(String firstName, String lastName, int student_ID_card, String groupName, int age, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.student_ID_card = student_ID_card;
        this.groupName = groupName;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public String toString() {
        return firstName + " " + lastName + ", Student ID card: " + student_ID_card +
                ", Group name: " + groupName + ", Age " + age + ", Marital status: " +
                maritalStatus;
    }
}
