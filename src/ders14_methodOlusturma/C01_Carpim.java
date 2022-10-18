package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip carpimlarini main method'a donduren bir mehod olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println(carpimMethodu(sayi, sayi2));
        double sonuc = carpimMethodu(2.8,3.4);
    }

     public static double carpimMethodu(double sayi,double sayi2){
         System.out.println("carpim methodu calsiti");

        return sayi*sayi2;


     }




}
