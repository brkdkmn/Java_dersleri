package ders14_methodOlusturma;

public class C02_StringConcate {

    // Verilen iki Stringi paremetre olarak kabul edip,
    // bu iki stringi aralarinda bir bosluk olan tek bir String olarak,
    // main method'a donduren bir method olusturun

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("bu da","oldu"));
        System.out.println(birlestirMethodu("Anladiniz", "mi"));

    }

    public static String birlestirMethodu(String str1,String str2){
        return  str1+" "+str2;
    }
}
