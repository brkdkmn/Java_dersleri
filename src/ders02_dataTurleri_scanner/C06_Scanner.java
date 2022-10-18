package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen diktortgenin iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasinda entere basin");

        double kenar1  = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("diktortgenin alan : " + (kenar1*kenar2));



    }
}
