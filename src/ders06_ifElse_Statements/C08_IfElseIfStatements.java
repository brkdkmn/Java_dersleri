package ders06_ifElse_Statements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {


       /*
          double not = 65.5;
        if (not>=85){
            System.out.println("AA");
        }
        else if (not>=65){
            System.out.println("BB");

        } else if (not>=50) {
            System.out.println("CC");

        }
        else {
            System.out.println("DD");
        }
        */

        // kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // kenar uzunluklari 0 veya negatifse gecersiz kenar uzunlugu yazdirin
        // ucgen eskenar ise" Eskenar ucgen" yazdirin degilse "Eskenar degil" yzdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();

        if (knr1<=0 || knr2<=0 || knr3<=0){
            System.out.println("gecersiz kenar uzunlugu");
        } else if (knr1==knr2 && knr2==knr3) {
            System.out.println("eskenar ucgen");

        }else {
            System.out.println("eskenar ucgen degildir");
        }
    }

}
