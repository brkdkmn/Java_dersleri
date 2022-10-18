package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int tamSayi = scan.nextInt();

        System.out.println("girilen sayilarin toplami : " + (ondalikliSayi + tamSayi));
        System.out.println("girilen sayilarin carpimi : " + (ondalikliSayi * tamSayi));

        // KULLANICIDAN BIR INT BIR DE DOUBE SAYI ALARAK
        // BUNLARIN BOLMESINI VE CIKTISINI YAPIN

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayiTm = scann.nextInt();

        System.out.println("lutfen bir ondalikli sayi giriniz");
        double ondalikliSa = scann.nextDouble();

        System.out.println("girilen int ve double sayilarinin bolunmesi : " + (sayiTm/ondalikliSa) +
                "\ngirilen int ve double sayilarinin cikarilmasi : " + (sayiTm-ondalikliSa));


    }
}
