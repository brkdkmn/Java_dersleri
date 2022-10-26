package ders23_constructors;

import java.util.Scanner;

public class C01_constructor {

    public static void main(String[] args) {

        // Scanner clasindaki method ve variable'lari kullanmak icin scan objesi olustururuz

            Scanner     scan         =  new                               Scanner(System.in);
        // class adi     obje ismi     obj. oluksurmak icin keyword      scanner Constructor'i

        scan.nextInt();

        String  str = new String("Java candir");
        String str2="java ne guzel";

        str.toLowerCase();
    }

    public static void C01_constructor(){
        // method isimleri kucuk harfle baslar,
        // class ismi ile ayni olmamasi tercih edilir
        // return type var bu method'tur,constructor olamaz
    }
}
