package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        /*
         Kullanicidan toplanmak uzere tam sayilar alin
         kullanici 0'a basarsa sayi alma islemini bitirin

         kullanicinin kac sayi girdigini ve
         bu sayilarinin toplaminin kac oldugunu yazdirin
         */

        Scanner scanner  = new Scanner(System.in);
        int girilenSayi = 5; // verilen ilk deger bu soru icin 0 olmamali
                             // cunku 0 loop'u bitirmek icin kullanilacak


        int sayac =0;
        int toplam=0;
        while (girilenSayi!=0){
            System.out.println("Lutfen toplamak icin tamsayi girin"+
                    "\n Bitirmek icin 0'a basin");
            girilenSayi= scanner.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }

        }
        System.out.println("Girilen "+ sayac + " adet sayisinin toplami " + toplam);


    }
}
