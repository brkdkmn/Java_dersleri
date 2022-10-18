package ders15_Overloading_whileLoop;

public class C02_Overloading {

    public static void main(String[] args) {

        carpim(3.5,6); // method call sirasinda method parentezine yazilanlara argument denir
        carpim(8,6,3);
        carpim(4,5,8.9,60.3);
        carpim(5,6.3); // casting var



    }
    // Bir class'ta ayni isim ve ayni signature'a sahip iki method olmaz
    /*
       method overloading olan class'lar da java hangi methodun calisacagina su sekilde cevap verir:

       1- once nethod isine bakar
       2- argument sayisi ile paremetre sayisina bakar
       3- argument ve parametre uyumuna bakar
       4- minumum castinge bakar
     */

    public static void carpim(int sayi,int sayi2){ // carpim int int

        System.out.println("Iki integer sayinin carpimi : " +sayi*sayi2);
    }

    public static void carpim(int sayi3,int sayi4,int sayi5){ // carpim int int int

        System.out.println("uc integer sayinin carpimi : " +sayi3*sayi4*sayi5);
    }

    public static void carpim(double sayi,int sayi2){ // carpim double int

        System.out.println("double -  integer sayinin carpimi : " +sayi*sayi2);
    }

    public static void carpim(int sayi,double sayi2){ // carpim int double

        System.out.println("integer - double sayinin carpimi : " +sayi*sayi2);
    }

    public static void carpim(double sayi,double sayi2){ // carpim double

        System.out.println("Iki double sayinin carpimi : " +sayi*sayi2);
    }
    public static void carpim(int sayi,int sayi2,double sayi3,double sayi4){

        System.out.println("Iki integer - iki double sayinin carpimi : " +sayi*sayi2*sayi3*sayi4);
    }
}
