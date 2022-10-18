package ders16_doWhileLoop;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // 10 11 12 sayilarini toplayan bir dowhile loop olusturun

        int sayi = 10;
        int toplam = 0;

        do {
            toplam+=sayi;
            sayi++;
        }while (sayi<=12);

        System.out.println(toplam);

        /*
          Do while loop'un 2 avantaji vardir
          1- Loop body'si en az bir kere calisir
            (while loop'ta baslangic degeri uygun degilse,loop body'si hic calismayabilir.)
          2- While bitis kontrolu loop kadar calisir
             (while loop'ta bir kere fazla calisirdi.)
         */
    }
}
