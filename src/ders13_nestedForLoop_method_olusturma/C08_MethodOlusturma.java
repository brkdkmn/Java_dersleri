package ders13_nestedForLoop_method_olusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {

        /*
          Kullanicidan iki sayi alip bunlarin toplamini yazdiran bir method olusturun
         */

        isteToplaYazdir();

    }

    public static void isteToplaYazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double sayi = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("girilen sayilarin toplami : " +(sayi+sayi2));


    }
}
