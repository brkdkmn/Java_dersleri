package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        //  kullanici kac girerse girsin
        // konsolda -128 ile +128 arasinda bir sonuc yazdiracak
        // kod yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        byte donusenSayi = (byte) girilenSayi;

        System.out.println("Girdiginiz : " + girilenSayi + "'n donusmus hali : " + donusenSayi);
    }
}
