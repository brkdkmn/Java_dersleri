package ders09_string_Manipulations;

public class C05_length {

    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());
        System.out.println(str.charAt(33));
        System.out.println(str.charAt(str.length()-1));// son karekteri elde etmek icin kullanilir
        System.out.println(str.charAt(str.length()-2));
        System.out.println(str.charAt(str.length()-3));

    }
}
