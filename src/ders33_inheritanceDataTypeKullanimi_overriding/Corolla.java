package ders33_inheritanceDataTypeKullanimi_overriding;

// variable olusturarak degerlerini bulma

public class Corolla extends BToyota {

    String model="Corolla";
    String uretimYeri="Türkiye";
    int yil=2023;

    public static void main(String[] args) {
        /*
           bir obje olustururken
           data turu ve constructor ayni class'dan ise
           bir variable'in degerini bulmak icin o clasa gideriz
           o class'da yoksa sirasi ile parent class'lara bakilir
           ilk bulunan kullanilir
         */

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.uretimYeri); // Türkiye
        System.out.println(corolla1.yil); // 2023
        System.out.println(corolla1.marka); // Binek araçların markası olur
        System.out.println(corolla1.motor); // Tum Araclar  Motor Kullanır
        System.out.println(corolla1.plaka); // Tum Aracların Plakası Olur
        System.out.println(corolla1.yakit); // Toyota cevreci yakit kullanir

        BToyota corolla2=new Corolla(); // obje corolla, data turu BToyota ve datadan bakariz
        /*
           Obje olustururken
           data turu ve constructorlar farkli ise
           variable'in degerini bulmak icin
           data turu olan class'a gidilir
           varsa kullanir,yoksa o class'in parent'lerina bakilir
           bulamazsa CTE verir
         */

        System.out.println(corolla2.model); //Binek araçların modeli olur
       // System.out.println(corolla2.uretimYeri); // CTE
        System.out.println(corolla2.yil); // 1900
        System.out.println(corolla2.marka); // Binek araçların markası olur
        System.out.println(corolla2.motor); // Tum Araclar  Motor Kullanır
        System.out.println(corolla2.plaka); // Tum Aracların Plakası Olur
        System.out.println(corolla2.yakit); // Toyota cevreci yakit kullanir

        Araba corolla3=new Corolla(); // objeyi corolla'dan olusturduk dataya Araba'dab sectik
       // System.out.println(corolla3.uretimYeri); // CTE
       // System.out.println(corolla3.model); // CTE
       // System.out.println(corolla3.yil); // CTE
       // System.out.println(corolla3.marka); // CTE
        System.out.println(corolla3.motor); // Tum Araclar  Motor Kullanır
        System.out.println(corolla3.plaka); // Tum Aracların Plakası Olur
        System.out.println(corolla3.yakit); // Araclar Farklı Yakıtlar Kullanır

        BToyota toyata1=new BToyota();
        System.out.println(toyata1.marka); // Binek araçların markası olur
        System.out.println(toyata1.model); // Binek araçların modeli olur
        System.out.println(toyata1.motor); // Tum Araclar  Motor Kullanır
        System.out.println(toyata1.plaka); // Tum Aracların Plakası Olur
        System.out.println(toyata1.yakit); // Toyota cevreci yakit kullanir
        System.out.println(toyata1.yil); //1900

        Araba toyota2=new BToyota(); // aramaya data turunden baslanir herzaman yani Araba'dan
        //System.out.println(toyota2.marka); // CTE
       // System.out.println(toyota2.model); // CTE
        System.out.println(toyota2.motor); // Araba
        System.out.println(toyota2.plaka); // Araba
        System.out.println(toyota2.yakit); // Araba
       // System.out.println(toyota2.yil); // CTE

        Araba araba=new Araba();
        System.out.println(araba.motor); // Araba
        System.out.println(araba.plaka); // Araba
        System.out.println(araba.yakit); // Araba


    }

}
