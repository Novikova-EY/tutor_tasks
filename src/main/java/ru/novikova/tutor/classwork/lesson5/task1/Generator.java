package ru.novikova.tutor.classwork.lesson5.task1;

import java.util.*;
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
        ArrayList<Number> array = new ArrayList<Number>();
        for (int i = 0; i < 1000; i++) {
            array.add(arrayArrayList.get((int) (Math.random() * arrayArrayList.size())));
        }
        long start = System.currentTimeMillis();
        for (Number n : array) {
            calcTimeSimpleFindTreeSet(n);
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("finish = " + finish);

//        calcTimeSimpleFindHashSet(numberToFind);
//        calcTimeSimpleFindTreeSet(numberToFind);
    }

    public static void calcTimeSimpleFindArrayList(Number numberToFind) {
        for (Number n : arrayArrayList) {
            if (n.equals(numberToFind)) {
                return;
            }
        }
    }

    public static void calcTimeBinaryFindArrayList(Number numberToFind) {
        if (Collections.binarySearch(arrayArrayList, numberToFind) >= 0) {
            return;
        }
    }

    public static void calcTimeSimpleFindHashSet(Number numberToFind) {
        for (Number n : arrayArrayList) {
            if (n.equals(numberToFind)) {
                return;
            }
        }
    }

    public static void calcTimeSimpleFindTreeSet(Number numberToFind) {
        for (Number n : arrayArrayList) {
            if (n.equals(numberToFind)) {
                return;
            }
        }
    }

}
