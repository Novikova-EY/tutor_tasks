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
                checkPhone(phoneBook, newInput);
                checkName(phoneBook, newInput);
            }
        }
    }

    private static void list(HashMap<String, String> phoneBook) {
        if (!phoneBook.isEmpty()) {
            for(Map.Entry entry : phoneBook.entrySet()) {
                System.out.println(entry);
            }
        } else {
            System.out.println("Телефонный справочник пуст");
        }
    }

    private static void checkPhone(HashMap<String, String> phoneBook, String newInput) {
        String regex = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(newInput);
        String phone = newInput;

        if (m.matches()) {
            if (!phoneBook.containsKey(phone)) {
                Scanner scannerName = new Scanner(System.in);
                System.out.println("Данный пользователь не зарегистрирован. Укажите его имя для внесения " +
                        "в справочник");
                String newInputName = scannerName.nextLine();
                phoneBook.put(phone, newInputName);
                System.out.println("Телефонная запись была успешно добавлена");
            } else {
                System.out.println("Существующая телефонная запись: Имя - " + phoneBook.get(phone));
            }
        }
    }

    private static void checkName(HashMap<String, String> phoneBook, String newInput) {
        String regex = "\\w+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(newInput);
        String name = newInput;

        if (m.matches()) {
            if (!phoneBook.containsValue(name)) {
                Scanner scannerPhone = new Scanner(System.in);
                System.out.println("Данный пользователь не зарегистрирован. Укажите его номер телефона для внесения " +
                        "в справочник");
                String newInputPhone = scannerPhone.nextLine();
                phoneBook.put(newInputPhone, name);
                System.out.println("Телефонная запись была успешно добавлена");
            } else {
                System.out.println("Существующая телефонная запись: Имя - " + phoneBook.get(name));
            }
        }
    }
}
