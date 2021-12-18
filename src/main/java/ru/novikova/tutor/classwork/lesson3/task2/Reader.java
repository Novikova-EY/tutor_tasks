package ru.novikova.tutor.classwork.lesson3.task2;

public class Reader {
    private String name;
    private int number;
    private String faculty;
    private String phone;

    public void takeBook(int count) {
        System.out.println(this.name + " взял " + count + " книги");
    }

    public void takeBook(String ... name) {
        System.out.println(this.name + " взял книги ");
        for (String n : name) {
            System.out.print(name);
        }
    }

//    public String takeBook(String name, Book ... books) {
//        System.out.println(name + " взял книги ");
//        for (Book b : books) {
//            System.out.print(b);
//        }
//    }

    public void returnBook() {

    }
}
