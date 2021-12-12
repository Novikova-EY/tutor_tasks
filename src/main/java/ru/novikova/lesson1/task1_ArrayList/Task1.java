package ru.novikova.lesson1.task1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        ArrayList<String> planner = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите желаемое действие: LIST - список заданий; ADD - добавить задание; DELETE - удалить задание");
            String textInput = scanner.nextLine();
            String textUpperCase = textInput.toUpperCase();
            if (textUpperCase.startsWith("LIST") ||
                    textInput.startsWith("ADD") ||
                    textInput.startsWith("EDIT") ||
                    textInput.startsWith("DELETE")) {
                plannerWorker(planner, textInput);
            }
        }
    }

    private static void plannerWorker(ArrayList<String> planner, String textInput) {
        String[] words = textInput.split(" ");

        String task = null;
        int numberOfTask = 0;

        if (task.equalsIgnoreCase("LIST")) {
            list(planner);
        } else {
            StringBuilder taskBuilder = new StringBuilder();
            if (isNumber(words[1])) {
                numberOfTask = Integer.parseInt(words[1]);
                for (int i = 2; i < words.length; i++) {
                    taskBuilder.append(words[i]).append(" ");
                }
                task = taskBuilder.toString();
            } else {
                numberOfTask = planner.size() + 1;
                task = words[1];
            }
        }

        if (task.equalsIgnoreCase("ADD")) {
            add(planner, task, numberOfTask);
        }

        if (task.equalsIgnoreCase("EDIT")) {
            edit(planner, task, numberOfTask);
        }

        if (task.equalsIgnoreCase("DELETE")) {
            delete(planner, numberOfTask);
        }
    }

    private static void list(ArrayList<String> planner) {
        if (!planner.isEmpty()) {
            int countEmpty = 0;
            for (int i = 0; i < planner.size(); i++) {
                if (planner.get(i).equals("---")) {
                    countEmpty++;
                }
            }
            if (!(countEmpty == planner.size())) {
                System.out.println("Текущее состояние списка дел:");
                for (int i = 0; i < planner.size(); i++) {
                    System.out.println((i + 1) + " - " + planner.get(i));
                }
            } else {
                System.out.println("Текущий список дел пуст");
            }
        } else {
            System.out.println("Текущий список дел пуст");
        }
    }

    private static void add(ArrayList<String> planner, String task, int numberOfTask) {
        if (numberOfTask > planner.size()) {
            for (int i = planner.size() + 1; i < numberOfTask; i++) {
                planner.add("---");
            }
        }
        planner.add(numberOfTask - 1, task);
        System.out.println("Задание " + numberOfTask + " успешно добавлено");
    }


    private static void edit(ArrayList<String> planner, String task, int numberOfTask) {
        if (planner.get(numberOfTask) == "---") {
            planner.set(numberOfTask - 1, task);
            System.out.println("Задание " + numberOfTask + " успешно скорректировано");
        } else {
            System.out.println("В это время уже запланирована задача, ее требуется заменить? 1 - да, 0 - нет");
            Scanner scannerChoice = new Scanner(System.in);
            int choice;
            do {
                choice = scannerChoice.nextInt();
            } while (choice == 0 || choice == 1);
            if (choice == 1) {
                planner.set(numberOfTask, task);
                System.out.println("Задание " + numberOfTask + " успешно скорректировано");
            }
        }
    }

    private static void delete(ArrayList<String> planner, int numberOfTask) {
        if (numberOfTask - 1 > planner.size()) {
            System.out.println("Такого задания запланировано не было");
            return;
        } else {
            planner.remove(numberOfTask - 1);
            System.out.println("Задание " + numberOfTask + " успешно удалено");
        }
    }

    private static boolean isNumber(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
