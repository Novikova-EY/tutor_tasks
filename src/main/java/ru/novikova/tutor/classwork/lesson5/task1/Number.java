package ru.novikova.tutor.classwork.lesson5.task1;

import java.util.Objects;

public class Number implements Comparable<Number>{
    private String first;
    private String numberOfCar;
    private String second;
    private String region;

    public Number(String first, String number, String second, String region) {
        this.first = first;
        this.numberOfCar = number;
        this.second = second;
        this.region = region;
    }

    public Number() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return first + numberOfCar + second + region;
    }

    @Override
    public int compareTo(Number o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return first.equals(number.first) && numberOfCar.equals(number.numberOfCar) && second.equals(number.second) && region.equals(number.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, numberOfCar, second, region);
    }
}
