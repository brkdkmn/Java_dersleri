package ders18_arrays;

import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.

        int [] kullaniciArrayi=arrayOlustur();
    }

    public static int[] arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz");

        int length = scan.nextInt();

        int[] kullaniciarrayi = new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("Array'a eklenecek bir sayi giriniz");
            kullaniciarrayi[i]= scan.nextInt();
        }
        return kullaniciarrayi;
    }
}
