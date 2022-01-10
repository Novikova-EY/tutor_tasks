package ru.novikova.tutor.homework.lesson5.structure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {

    private File fileAirCompanies = new File("src/main/java/ru/novikova/tutor/homework/lesson5/structure/AirCompanies.txt");
    private Date date;
    private String flightNumber;
    private Aircraft aircraft;

    public Flight() throws IOException {
        this.date = dateGenerator();
        this.flightNumber = flightNumberGenerator();
        this.aircraft = new Aircraft();
    }

    public String flightNumberGenerator() throws IOException {
        return letterGenerator() + (int)((Math.random() * 9000) + 100);
    }

    public Date dateGenerator() throws IOException {
        date = new Date();
        Random random = new Random();
        return new Date(date.getTime() + random.nextInt(2 * 172800000) - 172800000);
    }

    private String letterGenerator() throws IOException {
        ArrayList<String> airCompanyNames = new ArrayList<>();
        ArrayList<String> shortAirCompanyNames = new ArrayList<>();

        FileReader fr = new FileReader(fileAirCompanies);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        airCompanyNames.add(line);
        while (line != null) {
            line = reader.readLine();
            airCompanyNames.add(line);
        }

        for (String company : airCompanyNames) {//company = British Airways
            if (company != null) {
                String[] names = company.trim().split("\\s"); // names = [British, Airways]
                StringBuilder sb = new StringBuilder();
                for (String name : names) { // name = British
                    sb.append(name.toUpperCase().charAt(0));
                }
                String shortname = sb.toString();
                if (shortname.length() == 1) {
                    shortAirCompanyNames.add(shortname + "A");
                } else if (shortname.length() > 2) {
                    shortAirCompanyNames.add(sb.substring(0, 1));
                } else {
                    shortAirCompanyNames.add(shortname);
                }
            }
        }
        return shortAirCompanyNames.get((int) (Math.random() * shortAirCompanyNames.size()));
    }

    @Override
    public String toString() {
        return flightNumber + " " + date + "\n";
    }
}

