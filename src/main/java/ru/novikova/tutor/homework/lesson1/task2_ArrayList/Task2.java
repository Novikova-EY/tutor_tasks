package ru.novikova.tutor.homework.lesson1.task2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> emailBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        emailBookReadMessage(emailBook, scanner);
    }

    private static void emailBookReadMessage(ArrayList<String> emailBook, Scanner scanner) {
        while (true) {
            System.out.println("Введите желаемое действие: LIST - печать справочника e-mail, ADD - добавить новый e-mail");
            String input = scanner.nextLine();
            String inputMessage = input.trim().toLowerCase();
            String[] inputText = inputMessage.split(" ");
            if (inputText[0].equalsIgnoreCase("LIST")) {
                list(emailBook);
            } else if (inputText[0].equalsIgnoreCase("ADD")) {
                if (inputText.length == 1) {
                    System.out.println("Команда введена не верно");
                    continue;
                } else {
                    add(emailBook, inputText[1]);
                }
            }
        }
    }

    private static void list(ArrayList<String> emailBook) {
        if (!emailBook.isEmpty()) {
            System.out.println("Справочник e-mail:");
            for (int i = 0; i < emailBook.size(); i++) {
                System.out.println(emailBook.get(i));
            }
        }
        else {
            System.out.println("Справочник e-mail пуст");
        }
    }

    private static void add(ArrayList<String> emailBook, String email) {
        String[] emailLogin = email.split("@");
        if (emailLogin.length == 2 && emailLogin[0].length() != 0) {
            String[] emailDomen = emailLogin[1].split("\\.");
            if (emailDomen.length == 2 && emailDomen[0].length() != 0) {
                for (String emailEntry : emailBook) {
                    if (emailEntry.equalsIgnoreCase(email)) {
                        System.out.println("Такой e-mail уже есть в справочнике");
                        return;
                    }
                }
                emailBook.add(email);
                System.out.println("E-mail: " + email + " успешно добавлен с справочник");
                return;
            }
        }
        System.out.println("Неверный формат вводимого e-mail");
    }
}
