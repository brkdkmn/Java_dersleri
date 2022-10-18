package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoopSoru {

    public static void main(String[] args) {
        /*
          Soru : Kullanicidan Kullanicidan sifre isteyin
                 asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
                 kullanicinin yeni sifre girmesi isteyin
                 Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
                  gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
                 sartlar :
                  - sifrenin ilk karakteri kucuk harf olmali
                  - sifrenin son karakteri sayi olmali
                  - sifre en az sekiz karekterli olmali
         */

        Scanner scan = new Scanner(System.in);
        boolean sifregecerliMi=false;
        String sifre = "";
        int bayrak = 0;


        while (sifregecerliMi!=true){
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();



            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("Sifrenin ilk karekteri kucuk harf olmali");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("Sifrenin son karekteri sayi olmali");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karekterli olmali");
                bayrak++;
            }
            if (bayrak==0){
                sifregecerliMi = true;
                System.out.println("SIFRENIZ basari ile kaydedildi");
            }

        }
    }
}
