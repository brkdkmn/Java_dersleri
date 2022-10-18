package ders12_forLoops;

public class C05_DikkatEdilecekler {

    public static void main(String[] args) {
        /* sonsuz loop

        for (int i = 1; i >-10 ; i++) {
            System.out.println(i+" ");

        }

         */

         // ilk deger icin bitis sarti true olmuyorsa
        // for bodys'i devreye girmez

        for (int i = 0; i >10 ; i++) {
            System.out.println(i+" ");

        }

        // bir lopp'u sonunu beklemeden bitirmek istersek

        // kullanicinin verdigi bir sayininin asal sayi olup olmadigini bulun

        int sayi = 4523645;
        boolean bayrak = false;
        // asal sayi =  1 ve kendisi disinda hicbir sayiya bolunmeyen

        for (int i = 2; i <=sayi-1 ; i++) { //1 ve kensisi haric demek

            if (sayi%i==0){

                bayrak = true;
                break;

            }
        }

        System.out.println(bayrak);

        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }
    }
}
