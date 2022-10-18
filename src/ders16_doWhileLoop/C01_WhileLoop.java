package ders16_doWhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

        // 10 11 12 sayilarini toplayan bir while loop olusturun

        int sayi = 10;
        int toplam = 0;

        while (sayi<=12){
            toplam+= sayi;
            sayi++;

        }
        System.out.println(toplam);

        // While loop'ta once kontrol sonra islem yapilir


        /*
          While Loop'ta 3  problem olusabilir
          1- once degeri kontrol edip, sonra islem yaptigimizda
             body'de bir kere daha kontrol etmemiz gerekebilir
          2- yapilan islem sayisindan 1 fazla while bitis sarti kontrol edilir.
          3- whilw loop oncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak
             ona yapacagimiz atamayi dikkatli yapmamiz gerekir
             yanlis deger atamasi yapmak,while loop'un calismamasina neden olabilir.
         */

    }
}
