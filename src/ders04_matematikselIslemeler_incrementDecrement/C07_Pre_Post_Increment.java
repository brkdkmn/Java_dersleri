package ders04_matematikselIslemeler_incrementDecrement;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {

        int a = 10;

        int b = a++; //once islem sonra artir

        int c = ++b; // once artir sonra islem

        System.out.println("a : " + a + " , b : " + b + " ,c : " + c );

        a = 20;


        b = ++a;

        c= a++;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);

        a = 30;

        System.out.println(a++); // once yazdirdim sonuc konsolda 30 gorulur  sonraislem 31 oldu
        System.out.println(--a); //
        System.out.println(a--); //
        System.out.println(a);
    }
}
