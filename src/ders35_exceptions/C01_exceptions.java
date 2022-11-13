package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exceptions {

    public static void main(String[] args) {

        //Kullanicidan bir tamsayi alin
        //ve sayinin karesiniyazdirin
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyin bit method olusturun

        sayiAlKaresiniYazdir();


    }

    public static void sayiAlKaresiniYazdir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");


        try {
            int girilenSayi = scan.nextInt();
            /*
              Eger ondalikli sayi girilirse 26. satir exception verecek ve
              catch bloguna kadar olan diger kodlar calismayacak
              catch blogu hata yakalandiginda ne yapmasini istedigimizi soyledigimiz bolumdur.

              bu soruda istenen exception olustugunda yeniden deger istenmesi
              biz de exception olustugunda yeniden method'u calistirdik

              hata olmazsa catch blogu devreye girer
             */
            System.out.println("Girdiginiz sayinin karesi  : ");
            System.out.println(girilenSayi*girilenSayi);
        } catch (InputMismatchException e) {
            System.out.println("Sana tamsayi degeri gir dedik :)");
            sayiAlKaresiniYazdir();

        }


    }
}
