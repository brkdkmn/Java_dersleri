package ders10_stringManipulation;

public class C02_contains {

    public static void main(String[] args) {

        //  contains() var yada yok  true ya da false

        String str = "Java ile kodlama cok zevklidir";

        //CharSequence: char dizisi

        System.out.println(str.contains("Java")); //true
        System.out.println(str.contains("kodlsmsk"));//false
        System.out.println(str.contains("zevklidir")); //true
        System.out.println(str.contains("klidir")); //true
        System.out.println(str.contains("k")); //true
        System.out.println(str.contains("java")); //false

        String str2 = "Java";
        System.out.println(str.contains(str2)); // true

        String str3 = "234 Ali Can";
        System.out.println(str2.contains(str3));
       // System.out.println(str3.contains(3)); int kabul etmez

    }
}