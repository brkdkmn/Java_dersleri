package ders09_string_Manipulations;

public class C03_EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Burak";
        String str2 = "burak";
        String str3 = "BURAK";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equalsIgnoreCase("Burak ")); //false

        //equalsignorecase ayni metnin buyuk kucuk harf kullanilarak olusturulan
        // farkli yazimlarini birbirine esit olarak kabul eder.
        // Yani equalignorecase icin ali, Ali, ALI, AlI, alI BIRBIRINE ESITTIR
        // AMA kelimede farklilik varsa bunlari tolere etmez
        // a li ile ali birbirine esit dgildir
        // ali ile ALI. birbirine esit dgildir


    }
}
