package ru.novikova.lesson1.task3_Map;

import java.util.*;
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

    private static String formattedPhone(String newInput) {
        String phone = newInput.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int a = 0;
        if (phone.startsWith("8")) {
            a = 1;
        } else if (phone.startsWith("+7")) {
            a = 2;
        }
        stringBuilder.append("8");

        for (int i = a; i < phone.length(); i++) {
            if (!((phone.charAt(i) == '(') || (phone.charAt(i) == ')') || (phone.charAt(i) == '-'))) {
                stringBuilder.append(phone.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private static String formattedName(String newInput) {
        return newInput.trim().toUpperCase();
    }

    private static boolean checkName(String newInput) {
        String regex = "\\w+||\\W+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(newInput);
        return (m.matches());
    }

    private static void input(HashMap<String, String> phoneBook, String newInput) {
        if (checkPhone(newInput)) {
            String phone = formattedPhone(newInput);
            if (!phoneBook.containsKey(phone)) {
                System.out.println("Данный пользователь не зарегистрирован. Укажите его имя для внесения " +
                        "в справочник");
                Scanner scannerName = new Scanner(System.in);
                String newInputName = scannerName.nextLine();
                if (checkName(newInputName)) {
                    phoneBook.put(phone, newInputName);
                    System.out.println("Телефонная запись была успешно добавлена");
                } else {
                    System.out.println("Телефонная запись не добавлена. Неккоректный ввод имени");
                }
            } else {
                listExisting(phoneBook, phone);
            }
        } else if (checkName(newInput)) {
            String name = formattedName(newInput);
            if (!phoneBook.containsValue(name)) {
                System.out.println("Данный пользователь не зарегистрирован. Укажите его номер телефона для внесения " +
                        "в справочник");
                Scanner scannerPhone = new Scanner(System.in);
                String newInputPhone = scannerPhone.nextLine();
                String phone = formattedPhone(newInputPhone);
                if (checkPhone(phone)) {
                    phoneBook.put(phone, name);
                    System.out.println("Телефонная запись была успешно добавлена");
                } else {
                    System.out.println("Телефонная запись не добавлена. Неккоректный ввод номера телефона");
                }
            } else {
                listExisting(phoneBook, name);
            }
        }
    }
}
