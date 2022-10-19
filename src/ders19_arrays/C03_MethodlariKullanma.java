package ders19_arrays;

import ders18_arrays_diziler.C03_ArrayElementleriniArtirma;
import ders18_arrays_diziler.C04_ArrayElemntleriToplami;
import ders18_arrays_diziler.C05_ArraydeElemanArama;
import ders18_arrays_diziler.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {

        // Verilen bir int array'in elemntlerini 2 artirin

        int [] arr = {2,3,4};
        arr=C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        // arr array'in elemntlerini toplayim sonucu yazdiriniz

        System.out.println(C04_ArrayElemntleriToplami.pozitifElementleriTopla(arr)); // 15

        // arr array'inde 10 element olarak var mi?

        C05_ArraydeElemanArama.elemanAra(arr,10); // Aranan sayi array'da yok

        // Kullanicidan deger alarak bir array olustirun

       int[]yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));

     }
}