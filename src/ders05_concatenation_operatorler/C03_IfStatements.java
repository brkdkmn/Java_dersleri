package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // kullanicidan iki sayi alin
        // eger birinci sayi 100'den buyukse, "ilk sayi 100'den buyuk" yazdirin
        // eger ikinci sayi ciftse "ikinci sayi cift" yazdirin
        // eger ilk sayi, ikinci sayidan buyukse,"ilk sayi daha buyuk" yazdirin


        // kullanicidan iki sayi alin
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki tam sayi giriniz");
         int s1 = scan.nextInt();
         int s2 = scan.nextInt();

        // eger birinci sayi 100'den buyukse, "ilk sayi 100'den buyuk" yazdirin
         if (s1>100){
             System.out.println("ilk sayi 100'den buyuk");
         }

        // eger ikinci sayi ciftse "ikinci sayi cift" yazdirin
         if (s2%2==0){
             System.out.println("ikinci sayi cift");

             // eger ilk sayi, ikinci sayidan buyukse,"ilk sayi daha buyuk" yazdirin
         if (s1>s2) {
             System.out.println("ilk sayi daha buyuk");
         }
         }


        Scanner xyz = new Scanner(System.in);

        System.out.println("Adinizi giriniz");

        String isim = scan.nextLine();

        System.out.println(isim);

        int sayi1 = 57;
        int sayi2 = sayi1;

        double sayi11 = 18.934;

        int sayi22 = (int)sayi11;



        System.out.println(sayi22);

        int num = 11;
        num+=3;

        num+=2;

        num--;

        System.out.println(num);

        int num1 = 12;

        int num2 = 15;

        num1*=2;

        num2/=3;

        System.out.println(num1 + num2);






    }

}
