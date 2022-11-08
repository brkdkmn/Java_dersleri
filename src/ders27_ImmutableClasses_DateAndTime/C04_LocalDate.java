package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih); // 2022-10-29

        System.out.println(tarih.minusDays(100)); // 2022-07-21
        System.out.println(tarih.minusDays(5).minusDays(3)); // 2022-10-21

        System.out.println(tarih.plusMonths(7) // 2023-06-20
                .plusWeeks(2)
                .plusDays(8));

        System.out.println(tarih.getMonthValue()); // 10
        System.out.println(tarih.getMonth()); // OCTOBER
        System.out.println(tarih.getDayOfWeek()); // SATURDAY
        System.out.println(tarih.getDayOfYear()); // 302
        System.out.println(tarih.getChronology()); // ISO

        System.out.println(tarih.isLeapYear()); // false
        System.out.println(tarih.withYear(1994).isLeapYear()); // true

        System.out.println(tarih.withMonth(8)); // 2022-08-29

        System.out.println(tarih.lengthOfYear()); // 365
        System.out.println(tarih.withYear(2020).lengthOfYear()); // 366
        System.out.println(tarih.withYear(1988).withMonth(1).withDayOfMonth(8).getDayOfWeek()); // FRIDAY

        LocalDate date1=LocalDate.of(2011,11,11);
        LocalDate date2=LocalDate.of(2010,10,10);

        System.out.println(date1.isBefore(date2)); // false
        System.out.println(date2.isAfter(date1)); // false
    }
}
