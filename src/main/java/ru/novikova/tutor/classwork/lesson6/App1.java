package ru.novikova.tutor.classwork.lesson6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App1 {
    static List<Employee> employees = List.of(
            new Employee(1, "Name1", "Surname1", 10000, Roles.ENGENEER),
            new Employee(2, "Name2", "Surname2", 20000, Roles.ENGENEER),
            new Employee(3, "Name4", "Surname3", 30000, Roles.ENGENEER),
            new Employee(4, "Name4", "Surname4", 40000, Roles.DIRECTOR),
            new Employee(5, "Name5", "Surname5", 60000, Roles.ENGENEER),
            new Employee(6, "Name6", "Surname6", 60000, Roles.DIRECTOR),
            new Employee(7, "Name7", "Surname8", 70000, Roles.ENGENEER),
            new Employee(8, "Name8", "Surname8", 80000, Roles.DIRECTOR),
            new Employee(9, "Name9", "Surname9", 90000, Roles.DIRECTOR),
            new Employee(10, "Name10", "Surname10", 100000, Roles.DIRECTOR));

    public static void main(String[] args) {
//        IntStream stream = IntStream.of(1, 2, 3, 5, 7, 6, 9);
//        System.out.println("stream.average() = " + stream.average());
//
//        int[] arrayInt = {1, 5, 8, 6, 7, 6, 5, 5, 1, 0};
//        System.out.println("Arrays.stream(arrayInt).summaryStatistics() = " + Arrays.stream(arrayInt).summaryStatistics());
//
//        IntStream stream2 = IntStream.range(5, 100);
//        stream2.forEach(x -> System.out.println(x));
//
//        DoubleStream stream3 = DoubleStream.of(1.01, 2.2, 3.3, 5.5, 7.7, 6.6, 9.9);

//        Stream<Employee> streamEmployeesParallel = employees.parallelStream();

//        Stream<Employee> streamEmployees = employees.stream();
//
//        System.out.println("streamEmployees.count() = " + streamEmployees.count());
//        employees.forEach(x -> System.out.println(x));
//        employees.stream().forEach(x -> System.out.println(x));
//        streamEmployees.forEach(x -> System.out.println(x));

//        streamEmployeesParallel.forEachOrdered(x -> System.out.println(x));

//        employees.stream().filter(x -> x.getId() > 5).forEach(x -> System.out.println(x));
//        employees.stream().filter(x -> x.getId() > 5 && x.getRole() == Roles.DIRECTOR).count();

//        Set<Employee> set = employees.stream().collect(Collectors.toSet());
//
//        employees.stream()
//                .collect(Collectors.toMap(x -> x.getId(), x -> x.getName() + " " + x.getSurname() + " " +  x.getRole() + " " +  x.getSalary()))
//                        .entrySet().stream().forEach(x -> System.out.println(x));
//        System.out.println(mapEmployee);

//        int[] arrayInt = {1, 5, 8, 3, 2};
//        IntStream is = Arrays.stream(arrayInt);
//        is.sorted().forEach(x -> System.out.println(x));

//        employees.stream().sorted((x, y) -> x.getSalary() - y.getSalary()).forEach(x -> System.out.println(x));
//        employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName)).forEach(x -> System.out.println(x));

//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o2.getSalary() != o1.getSalary()) {
//                    return o2.getSalary() - o1.getSalary();
//                } else {
//                    return o2.getName().compareTo(o1.getName());
//                }
//            }
//        });

//        employees.stream().filter(x -> x.getId() > 2 && x.getId() < 8 && x.getSalary() > 30000)
//                .sorted((x, y ) -> x.getSurname().compareTo(y.getSurname())).forEach(x -> System.out.println(x));

//        employees.stream().skip(5).forEach(x -> System.out.println(x));
//        System.out.println();
//        employees.stream().limit(5).forEach(x -> System.out.println(x));


        employees.stream().peek(x -> x.setName("Name4")).forEach(x -> System.out.println(x));


    }
}
