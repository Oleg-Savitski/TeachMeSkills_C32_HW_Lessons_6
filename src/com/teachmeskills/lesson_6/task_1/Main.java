package com.teachmeskills.lesson_6.task_1;

/** Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти обеъекты в массив.
 * Пройти по массиву циклом for и вывести информацию на консоль.
 */


public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[6];

        student[0] = new Student("Oleg", "Savitski", 7774125, "C32-Onl", 31, "married");
        student[1] = new Student("Alexey", "Tyshkevich", 3412344, "C32-Onl", 31, "divorced");
        student[2] = new Student("Olga", "Kalatskaya", 9433321, "C32-Onl", 29, "single");
        student[3] = new Student("Alexandra", "Rahalskaya", 4411142, "C32-onl", 46,"divorced");
        student[4] = new Student("Oleg", "Fenco", 3889000,"C32-Onl", 54, "married");
        student[5] = new Student("Ekaterina", "Bomko", 2237690, "C32-Onl", 32, "divorced");

        for (Student students: student) {
            System.out.println("\n" + students.toString());

        }
    }
}
