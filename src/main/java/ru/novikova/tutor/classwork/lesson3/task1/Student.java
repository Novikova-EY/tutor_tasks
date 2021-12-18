package ru.novikova.tutor.classwork.lesson3.task1;

public class Student {
    private String name;
    private String surname;
    private String course;
    private float reiting;
    private int gate;

    public Student() {
    }

    public Student(String name, String surname, String course, float reiting, int gate) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.reiting = reiting;
        this.gate = gate;
    }

    public Student(String name, int gate) {
        this.name = name;
        this.gate = gate;
    }

    public Student(float reiting, String course) {
        this.reiting = reiting;
        this.course = course;
    }

    public Student(String name, int gate, String course){
        this(name, gate);
    }

    public Student(String name, float reiting, String course) {
        this(reiting, course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getReiting() {
        return reiting;
    }

    public void setReiting(float reiting) {
        this.reiting = reiting;
    }

    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "lesson3.task1.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                ", reiting=" + reiting +
                ", gate=" + gate +
                '}';
    }
}
