package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse

          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin
         */

        Scanner scanner  = new Scanner(System.in);
        double girilenSayi = 0;
        double toplam = 0;
        int sayac = 0;

        while (toplam<500){
            System.out.println("Toplanmak icin sayi giriniz");

            girilenSayi = scanner.nextDouble();
            toplam+= girilenSayi;
            sayac++;
        }
        System.out.println("Girilen " + sayac + " sayinin toplami " + toplam + " oldu. Bu kadar yeter");
    }
}
