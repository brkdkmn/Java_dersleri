package ders06_ifElse_Statements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // Kullanici o veya 0 yazdiginda Ocak olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay isminin ilk harfini girin");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf== 'o' || ilkHarf=='0'){
            System.out.println("Ocak");

        }
        if (ilkHarf== 's' || ilkHarf=='S'){
            System.out.println("Subat");

        }
        if (ilkHarf== 'm' || ilkHarf=='M'){
            System.out.println("mart veya mayis");

        }
        if (ilkHarf== 'n' || ilkHarf=='N'){
            System.out.println("nisan");

        }
        if (ilkHarf== 'h' || ilkHarf=='H'){
            System.out.println("haziran");

        }
        if (ilkHarf== 't' || ilkHarf=='T'){
            System.out.println("temmuz");

        }
        if (ilkHarf== 'a' || ilkHarf=='A'){
            System.out.println("agustos veya aralik");

        }
        if (ilkHarf== 'e' || ilkHarf=='E'){
            System.out.println("Eylul, Ekim");

        }
        if (ilkHarf== 'k' || ilkHarf=='K'){
            System.out.println("Kasim");

        }

        // Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner soru = new Scanner(System.in);

        int sayi = soru.nextInt();
        if (sayi%5==0){
            System.out.println("sayi 5;in tam katidir");
        }


    }
}
