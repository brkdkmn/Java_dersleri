package ders26_passByvalue_immutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str = "Java Candir";

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDİR

        /*
            immutable claslar'dan olusturulan bir objenin degeri DEGISTIRILEMEZ.
            eger atama yapilirsa java degerini degistirmez
            bunun yerine yeni  bir obje olusturur ve
            bu yeni objeye yeni atadiginiz degeri atar

            eski obje bosa cikar ve garbage collector tarafindan silinmeyi bekler
         */
    }
}
