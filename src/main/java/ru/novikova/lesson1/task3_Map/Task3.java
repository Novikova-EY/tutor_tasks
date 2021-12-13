package ru.novikova.lesson1.task3_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя абонента или его телефонный номер. Для просмотра всего справочника " +
                    "абонентов введите LIST");
            String newInput = scanner.nextLine();

            if (newInput.startsWith("LIST")) {
                list(phoneBook);
            } else {
                input(phoneBook, newInput);
            }
        }
    }

    private static void list(HashMap<String, String> phoneBook) {
        if (!phoneBook.isEmpty()) {
            for (Map.Entry entry : phoneBook.entrySet()) {
                System.out.println(entry);
            }
        } else {
            System.out.println("Телефонный справочник пуст");
        }
    }

    private static void listExisting(HashMap<String, String> phoneBook, String newInput) {
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(newInput)) {
                System.out.println("Такая запись уже существует " + entry);
            }
        }
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(newInput)) {
                System.out.println("Такая запись уже существует " + entry);
            }
        }
    }

    private static boolean checkPhone(String newInput) {
        String regex = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(newInput);
        return (m.matches());
    }

    private static boolean checkName(String newInput) {
        String regex = "\\w+||\\W+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(newInput);
        return (m.matches());
    }

    private static void input(HashMap<String, String> phoneBook, String newInput) {
        if (checkPhone(newInput)) {
            if (!phoneBook.containsKey(newInput)) {
                System.out.println("Данный пользователь не зарегистрирован. Укажите его имя для внесения " +
                        "в справочник");
                Scanner scannerName = new Scanner(System.in);
                String newInputName = scannerName.nextLine();
                if (checkName(newInputName)) {
                    phoneBook.put(newInput, newInputName);
                    System.out.println("Телефонная запись была успешно добавлена");
                } else {
                    System.out.println("Телефонная запись не добавлена. Неккоректный ввод имени");
                }
            } else {
                listExisting(phoneBook, newInput);
            }
        } else if (checkName(newInput)) {
            if (!phoneBook.containsValue(newInput)) {
                System.out.println("Данный пользователь не зарегистрирован. Укажите его номер телефона для внесения " +
                        "в справочник");
                Scanner scannerPhone = new Scanner(System.in);
                String newInputPhone = scannerPhone.nextLine();
                if (checkPhone(newInputPhone)) {
                    phoneBook.put(newInputPhone, newInput);
                    System.out.println("Телефонная запись была успешно добавлена");
                } else {
                    System.out.println("Телефонная запись не добавлена. Неккоректный ввод номера телефона");
                }
            } else {
                listExisting(phoneBook, newInput);
            }
        }
    }
}
