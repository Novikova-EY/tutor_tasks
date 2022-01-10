package ru.novikova.tutor.classwork.lesson5.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Generator {
    private static String[] arrayLetter = new String[26];

    private static ArrayList<Number> arrayArrayList = new ArrayList<>();
    private static HashSet<Number> arrayHashSet = new HashSet<>();
    private static TreeSet<Number> arrayTreeSet = new TreeSet<>();

    public static void main(String[] args) {
        generation();

        Number numberToFind = new Number("A", "111", "BC", "01");
        simpleFind(numberToFind);

//        arrayArrayList.stream().limit(1000).collect(Collectors.toList()).forEach(x -> System.out.println(x));

//        arrayArrayList.sort(new Comparator<Number>() {
//            @Override
//            public int compare(Number o1, Number o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(arrayArrayList.size() / 100);
    }

    public static void generation() {
        arrayLetter();

        int firstIndex = 0;
        int secondIndex = 1;
        int thirdIndex = 2;

        boolean run = true;
        while (run) {
            if (firstIndex == 25 && secondIndex == 24 && thirdIndex == 23) {
                run = false;
            }
            for (int i = 111; i < 999; i = i + 111) {
                for (int j = 1; j < 10; j++) {
                    Number number = new Number();
                    number.setFirst(arrayLetter[firstIndex]);
                    number.setNumberOfCar(i + "");
                    number.setSecond(arrayLetter[secondIndex] + arrayLetter[thirdIndex]);
                    if (j < 10) {
                        number.setRegion("0" + j);
                    } else {
                        number.setRegion(j + "");
                    }
                    arrayArrayList.add(number);
                    arrayHashSet.add(number);
                    arrayTreeSet.add(number);
                }
            }
            thirdIndex++;
            if (thirdIndex == 25) {
                secondIndex++;
                thirdIndex = 0;
            }
            if (secondIndex == 25) {
                firstIndex++;
                secondIndex = 0;
                thirdIndex = 0;
            }
        }
    }

    public static void arrayLetter() {
        for (int i = 65; i < 91; i++) {
            arrayLetter[i - 65] = String.valueOf((char) i);
        }
    }

    public static void simpleFind(Number numberToFind) {
        calcTimeSimpleFindArrayList(numberToFind);
        calcTimeSimpleFindHashSet(numberToFind);
        calcTimeSimpleFindTreeSet(numberToFind);
    }

    public static void calcTimeSimpleFindArrayList(Number numberToFind) {
        long start = System.currentTimeMillis();
        for (Number n : arrayArrayList) {
            if (n.equals(numberToFind)) {
                long finish = System.currentTimeMillis() - start;
                System.out.println("ArrayList: номер найден, поиск занял " + finish + " мс");
                break;
            }
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("ArrayList: номер не найден, поиск занял " + finish + " мс");
    }

    public static void calcTimeSimpleFindHashSet(Number numberToFind) {
        long start = System.currentTimeMillis();
        if (arrayHashSet.contains(numberToFind)) {
            long finish = System.currentTimeMillis() - start;
            System.out.println("HashSet: номер найден, поиск занял " + finish + " мс");
            return;
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("HashSet: номер не найден, поиск занял " + finish + " мс");
    }

    public static void calcTimeSimpleFindTreeSet(Number numberToFind) {
        long start = System.currentTimeMillis();
        if (arrayHashSet.contains(numberToFind)) {
            long finish = System.currentTimeMillis() - start;
            System.out.println("HashSet: номер найден, поиск занял " + finish + " мс");
            return;
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("TreeSet: номер не найден, поиск занял " + finish + " мс");
    }

}
