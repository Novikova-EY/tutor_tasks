package ru.novikova.tutor.classwork.lesson3.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        System.out.println(date);
//        Long time = date.getTime();
//        System.out.println(time);
//
//        Date date1 = new Date(0);
//        System.out.println(date1);
//        time = time + (1000L * 60 * 60 * 24 * 30);
//        Date date2 = new Date(time);
//        System.out.println(date2);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_MONTH, 30);
//        Date date3 = calendar.getTime();
//        System.out.println(date3);

        String dateRandom = "17.12.2021";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dd = simpleDateFormat.parse(dateRandom);
        System.out.println(dd);
    }
}
