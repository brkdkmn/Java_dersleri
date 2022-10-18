package ders06_ifElse_Statements;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {

       // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
       // “Eskenar ucgen” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();

        if (knr1 == knr2 && knr2==knr3){
            System.out.println("eskenar ucgen");

        }
        else {
            System.out.println("eskenar ucgen degildir");
        }


    }
}
