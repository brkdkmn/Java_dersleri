package ders04_matematikselIslemeler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println(sayi1/sayi2);

        double ondalklSonuc = (double)(sayi1/sayi2);
        System.out.println(ondalklSonuc);

        double dogruSonuc = (double)sayi1/sayi2; // double / int genis olana gore sonuc verir.Yani double verir.
        System.out.println(dogruSonuc);


    }
}
