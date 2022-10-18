package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Kullanicidan ismini alip buyuk harflerle yazdirin;

        //1. adim scan objesi olusurmak

        Scanner scan = new Scanner(System.in);

        //2. adim  kullaniciya ne sitedigimizi yazdiracagiz

        System.out.println("Lutfen adinizi giriniz");

        //3. adim kullanicidan istedigimiz bilginin turune uygun bir variable olusturup
        //    scanner methodlarindan uygun olanini kullanarak alinan degeri variable'a atayalim.

        String kullaniciAdi = scan.next();

        System.out.println(kullaniciAdi.toUpperCase());




        Scanner kapi = new Scanner(System.in);
        System.out.println("Lutfen daire ismini giriniz");

        String daireIsmi = kapi.next();
        System.out.println(daireIsmi.toUpperCase());


        //Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner test = new Scanner((System.in));
        System.out.println("Lutfen double sayi giriniz");

        double doubleSayi = test.nextDouble();

        System.out.println("Lutfen int sayi giriniz");
        int intSayi = test.nextInt();
        System.out.println("double ve int sayilarinin toplami : " + (doubleSayi+intSayi) +
                "\ndouble ve int sayilarinin carpimi : " + (doubleSayi*intSayi));



    }
}
