package ders14_methodOlusturma;

public class C05_SubstringOlustur {

    /*
       Soru 1- Kullanicidan input olarak verilen bir String alin
       baslangic ve bitis indexlerine gore baslangic index’i dahil,
       bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

     */

    public static void main(String[] args) {

        String input = "Java ne kadar guzel";
        int basIndex = 5;
        int bitIndex = 7;

        kendiSubstringMethodumuz(input,basIndex,bitIndex);
        kendiSubstringMethodumuz("Java",1,3);
        kendiSubstringMethodumuz("Deneme",6,3);
        kendiSubstringMethodumuz("Java",6,8);

    }

    public static void kendiSubstringMethodumuz(String input,int basIndex,int bitIndex){


        if (basIndex>bitIndex){
            System.out.println("baslangic indexi, bitis indexinden buyuk olamaz");
        } else if (bitIndex>input.length()) {
            System.out.println("bitis indexi stringin sinirlari disinda");
        }else {

            for (int i = basIndex; i < bitIndex ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }

    }


}
