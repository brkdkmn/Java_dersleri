package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayindexOutofBoundException {

    public static void main(String[] args) {

        // kullanicidan bir index isteyin
        // verilen bir array'den kullanicinin girdigi index'deki elementi yazdirin

        int[]arr={2,3,6,5,9,10,25,};

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir index giriniz");
        int index= scan.nextInt();
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException hata) {
            System.out.println(hata.getMessage()); // Index 15 out of bounds for length 7
            hata.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 7
            //	at ders35_exceptions.C03_ArrayindexOutofBoundException.main(C03_ArrayindexOutofBoundException.java:18)
            // javanin yazdigi tum hata mesajini verir ama  kodlar calismaya devam eder

            // catch blogunda hicbir kod olmasa da kodlarimiz normal calismaya devam eder
            // catch blogun'da kullaniciya yazdiracagim mesaj
            // tamamen kod yaznin insiyatifindedir
            // exception class'indan hazir hata mesajlari da yazdirabilir
            // kendi istedigi kodlari da calistirabilir
            // hic bir sey yazmaya da bilir.

        }

    }
}
