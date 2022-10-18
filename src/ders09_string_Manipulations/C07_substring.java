package ders09_string_Manipulations;

public class C07_substring {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";


        System.out.println(str.substring(5,10));

        // 5 .index dahil ,10 index haric yazdirir.

        System.out.println(str.substring(9,17)); // gectikce
        System.out.println(str.substring(3,7)); //a gu

        String isim  = "HASANCAN";

        // Verilen ismi ilk harfi buyuk geriye kalanlar kucuk harf olarak kaydedin

        System.out.println(isim.substring(0,1).toUpperCase()+ // ILK HARFI ALIP BUYUK YAPTIK
                isim.substring(1).toLowerCase()); //1.INDEX VE SONRASINI ALIP KUCUK HARF YAZDIK


        // SADECE 3.  indexteki HARFI YAZDIRIN A

        System.out.println(isim.substring(3,4));
        // System.out.println(isim.charAt(3));
        System.out.println("zor sorunun cevabi : :) "+ isim.substring(2,2)); // "" hiclik yazdirir

      //  System.out.println(isim.substring(5,2)); // GERI GITMEZ HATA VERIRIR


    }
}
