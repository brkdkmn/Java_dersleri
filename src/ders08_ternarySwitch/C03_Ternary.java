package ders08_ternarySwitch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a = 5;
        // ternary operatoru tek basina kullanilmaz.Ternary bize bir sonuc uretir.
        // Bu sonucu ya direkt yazdirmali veya bir variable'a atamaliyiz

      String sonuc =  a%2 ==0 ?"cift sayi" : "tek sayi";

      // Ternary'in sonucunu bir variable'ye atayacaksak
        // true ve false durumlarinda uretilecek sonucun ayni  data  turune olmasi gerekir,
        // aksi halde CTE olusur ama ternary'i sout icinde kullanirsak
        // sonuclarin data turunun ayni olmasi sart olmaz

      String sonuc2 = a>10 ? "buyuk sayi" : ""+ 2*a; // CTE vermemesi icin Stringe cevirdik

        System.out.println( a>10 ? "buyuk sayi" :  2*a);

        double b = 26.5;
        System.out.println(b<45 ? "buyuk sayi" : "olmadi");
    }
}
