package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_PeriodOf {

    public static void main(String[] args) {

        // dogumunuzdan bugune  ne kadar zaman gecti?

        LocalDate bugun= LocalDate.now();
        LocalDate dogumgunu = LocalDate.of(1988,01,8);

        Period gecenSure=Period.between(dogumgunu,bugun);
        System.out.println(gecenSure);  // P34Y9M21D

        System.out.println(gecenSure.getYears()); // 34
        System.out.println(gecenSure.minusMonths(8)); // P34Y1M21D

    }
}
