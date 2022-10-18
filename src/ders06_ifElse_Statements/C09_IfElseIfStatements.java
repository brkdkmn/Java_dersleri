package ders06_ifElse_Statements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        // sayi negatifse "gecersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamkli ise "iki basamakli sayi"
        // bunun disindaki sayilar icin "buyuk sayi" yazdirsin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
         int sayi = scan.nextInt();
         if (sayi<0){
             System.out.println("gecersiz sayi");
         } else if (sayi<10) {
             System.out.println("rakam");
         } else if (sayi<100) {
             System.out.println("iki basamakli sayi");
         }
         else{
             System.out.println("buyuk sayi");
         }
    }
}
