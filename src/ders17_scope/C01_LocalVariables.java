package ders17_scope;

public class C01_LocalVariables {

    public static void main(String[] args) {

        // Bir method'un icerisinde olusturulan variablelerin scope'u
        // icinde olusturulduklari methot'dur.
        // o methodun disindan ulasilamzlar.

        int sayi =10;
        String isim = "Ramazan";

        //System.out.println(dogruMu);

        for (int i = 0; i < 10; i++) {
            String adres = "Ankara";

            // bir loop icerisinde olusturulan variabler sadece o loop icerisinde gecerlidir

        }
       // System.out.println(adres);

        double pi;

       // System.out.println(pi);

        // local variabiller deger atamadan olusturulabilinir
        // ancak KULLANILMAZ kullanmadan once deger atanmis OLMALI

    }

    public static void method(){

         //System.out.println(isim);
        //isim = "Tugay";

    boolean dogruMu = true;
    }
}
