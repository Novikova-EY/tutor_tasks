package ru.novikova.tutor.classwork.lesson3.task1;

public class App1 {
    public static void main(String[] args) {
        Student student1 = new Student("Name1", "Surname1", "course1", 5.1f, 5);
        Student student2 = new Student("Name2", "Surname2", "course2", 5.2f, 2);
        Student student3 = new Student("Name3", "Surname3", "course3", 5.3f, 1);
        Student[] students = new Student[]{student1, student2, student3};

        Student max = new Student();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGate() > max.getGate()) {
                max = students[i];
            }
        }

        System.out.println(max.toString());

    }
}
