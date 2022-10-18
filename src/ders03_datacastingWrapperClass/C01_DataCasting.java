package ders03_datacastingWrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {

        // Bazi data turleri asla birbirlerine cast edilemez

        // String str = 20;

        // boolean mutluNo = "true";

        // int a = true;

        double s = 20;

        int sayi = 15;

        long ln = sayi; // esitligin sol tarafi long, sag tarafi yani deger int
                        // java itiraz etmedi

        short m = 12;
        int d = m;

        long lng = m; // dar data turunden bir degeri
                      //  genis data turundeki variable atama yaparsaniz java bunu otomatik  olarak yapar


        /*
            ama tersini yapmak isterseniz
            yani buyuk data turundeki bir degeri
            kucuk data turundeki variable atamak isterseniz java kabul etmez
         */

        double dbl = 20;
        // sayi = dbl;

        // short abc = dbl;



    }
}
