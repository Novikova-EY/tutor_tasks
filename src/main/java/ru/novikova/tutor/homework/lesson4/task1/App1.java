package ru.novikova.tutor.homework.lesson4.task1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws IOException {

        task11();
    }

    public static void task1() {
        swap(1, 0);
    }

    public static void swap(int x, int y) throws NullPointerException {
        if (x == 0 || y == 0) {
            throw new NullPointerException("Входной параметр равен нулю");
        } else {
            int temp = x;
            x = y;
            y = temp;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }

    public static void task2() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int index = 3;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    System.out.println("Удаление элемента " + e);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task3() {

    }

    public static void task4() {
        try {
            int[] array = new int[5];
            array[6] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверная вставка в массив");
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("\\lesson4\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }

    // не работает filereader
    public static void task5() throws IOException {
        File fileInput = new File("input.txt");
        if (fileInput.exists()) {
            throw new IOException("Такой файл уже существует");
        } else {
            System.out.println("Файл создан");
        }
    }

    public static void task6() {
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            try {
                System.out.println("Введите число");
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат вводимого числового значения");
            }
        }
    }

    public static void task8() {
    }

    public static void task9() {
        double[] array = {1.0, 2.5, -5.0};
        double sum = 0;
        for (double a : array) {
            if (a < 0) {
                throw new ArithmeticException("Значение отрицательное");
            }
            sum += a;
        }
        System.out.println(sum);
    }

    public static void task10() {
    }

    public static void task11() {
        char[] array = {'a', 'b', '1', 'c'};
        char[] invertArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                if (Character.isDigit(array[i])) {
                    throw new IllegalArgumentException();
                }
                invertArray[array.length - i - 1] = array[i];
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: один из элементов массива - цифра");
            }
        }
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            try {
                System.out.println("Введите строку");
                input = scanner.nextLine();
                char[] arr = input.toCharArray();
                for (char c : arr) {
                    if (Character.isDigit(c)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка - строка содержит цифры");
            }
        }
    }

    public static void task13() {
        char[] array = {'a', ' ', '1', 'c'};
        for (char c : array) {
            try {
                if (c == ' ') {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: один из элементов массива - пробел");
            }
        }
    }

    public static void task14() {
    }

    public static void task15() {
    }

    public static void task16() {
    }

    public static void task17() {
    }

    public static void task18() {
    }

    public static void task19() {
    }

    public static void task20() {
    }

    public static void task21() {
    }

    public static void task22() {
    }

    public static void task23() {
    }

    public static void task24() {
    }
}
