package ru.novikova.tutor.classwork.lesson3.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App3 {
    public static void main(String[] args) throws ParseException {

//        CardAccount cardAccount = new CardAccount(1000);
//        cardAccount.putSum(10);
//        System.out.println(cardAccount.getSum());
//        cardAccount.putSum(10);
//        System.out.println(cardAccount.getSum());
//        cardAccount.putSum(10);
//        System.out.println(cardAccount.getSum());
//        cardAccount.putSum(10);
//        System.out.println(cardAccount.getSum());
//
//        cardAccount.takeSum(500);
//        System.out.println(cardAccount.getSum());

        DepositAccount depositAccount = new DepositAccount(1000);
        String dateRandom = "17.12.2021";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dd = simpleDateFormat.parse(dateRandom);
        depositAccount.putSum(dd, 100);
        System.out.println(depositAccount.getSum());

        String dateToTake = "11.12.2022";
        Date dtt = simpleDateFormat.parse(dateToTake);
        depositAccount.takeSum(dtt, 100);
        System.out.println(depositAccount.getSum());


    }
}
