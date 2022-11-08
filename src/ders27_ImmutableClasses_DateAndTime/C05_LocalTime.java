package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {

    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat); // 19:21:22.333388100

        LocalTime saat2=LocalTime.of(5,10,20);

        System.out.println(saat.compareTo(saat2)); // 1

        System.out.println(saat.getSecond()); // 52

    }
}
