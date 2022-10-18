package ders11_stringManipulation;

public class C03_replaceAll {

    public static void main(String[] args) {

        String str = "J1ava2 G9uzel5dir8";

        // str'deki sayilari silin metni Java Guzeldir haline donusturelim

        // str.replaceAll() sadece bir harf veya char sequence'i degil
        // genelleme ile soyleyebilecegimiz ortak ozellikteki tum karekterleri degistirir

        System.out.println(str.replaceAll("\\d","")); // digits (rakamlari) siler
        System.out.println(str.replaceAll("\\D",""));  //12958 DIGIT OLMAYAN HERSEYI SILER

        String s = "birinci urun fiyati : 1250";
        String s2 = "ikinci urun fiyati : 1500 tl";
        // iki urun fiyatini toplayin

        s = s2.replaceAll("\\D",""); //1250
        s2 = s.replaceAll("\\D",""); //1500

        System.out.println(Integer.parseInt(s)+Integer.parseInt(s2));


    }
}
