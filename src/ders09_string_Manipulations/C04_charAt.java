package ders09_string_Manipulations;

public class C04_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(7));

        System.out.println(str.charAt(10));// bana sonuncu karekteri yazdirin
        /*
           bir metindeki karekter sayisi ile son indekx  arasinda bir fark vardir
           bu metin icin karkter sayisi 11
           ama son index 10 dur
         */

        System.out.println(str.charAt(11)); // hata


    }
}
