package ders09_string_Manipulations;

public class C02_Equals {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

        String str3 = new String("Ali");
        String str4 = "Ali";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
       // System.out.println(str1==str4); // sonra anlatilacak


        // == stringleri karsilastirirken bekledigimiz sonuclari vermeyebilir.
        // Stringler'de metinlerin ayni olup olmadigini karsilastirmak icin
        // == yerine equals() kullanilir

        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));



    }
}
