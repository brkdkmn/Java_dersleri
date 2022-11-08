package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman); // 2022-10-29T19:32:30.351403400

        System.out.println(zaman.getDayOfWeek()); // SATURDAY

        System.out.println(zaman.plusMonths(5)); // 2023-03-29T19:33:34.797329800
    }
}
