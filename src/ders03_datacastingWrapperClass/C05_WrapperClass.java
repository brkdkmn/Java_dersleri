package ders03_datacastingWrapperClass;

public class C05_WrapperClass {

    public static void main(String[] args) {

        // 1- Data Casting : Java’da uygun data turleri arasinda gecis mumkundur. Hem primitive data turleri icin hem de non primitive data turleri icin data casting mumkundur.
       //  2- Her data turu birbirine cast edilemez. Ornegin boolean’I String’e veya char’I boolean’a ceviremeyiz. Ancak sayi degeri iceren byte, short, int, long, float ve double gibi benzer data turleri birbirine cevrilebilir.
        // 3- Eger daha dar kapsamli bir data turundeki deger, genis kapsamli data turundeki variable’a atanirsa java bunu otomatik olarak yapar. (Auto widening)
         // 4- Eger genis data turundeki bir deger, dar data turundeki bir variable’a atanirsa, java bu casting’I otomatik yapmaz, sorumlulugu bizim almamizi ister. Sorumllugu almak icin degerin onune ( donusturulecek data turu) yazilir.
        // Ancak explicit narrowing yapildiginda deger kayiplari veya deger baskalasimi olabilir.
        // 5- char data turu matematiksel islemlerde ASCII tablosundaki degeri ile isleme girer. Eger sayisal bir ifadenin char olarak yazilmasini istersek onune (char) yazarak explicit data casting yapariz
        // 6- Wrapper Class : Non-primitive data turlerinde oldugu gibi primitive data turlerinin de hazir method’lari olmasi icin Java Wrapper class’lari olusturmustur. Wrapper class’lar primitive’ler ile ayni degerleri kullanir ama hazir method’lari da vardir.


        int sayi = 10;

        String str = "Java Cok Guzel";


          //  primitive data turleri sadece deger barindirlar, hazir metodlari yoktur

          //  java'ya yapilan talepler sonucunda java primitive data turleri ile
          // bazi hazir metodlarin kullanilabilmesi icin WRAPPER CLAS'lar olusturmustur

          // wrapper claslar primitive data turlerindeki degerleri alirlar
         // ancak metodlari da vardir.


        char krk = 'b';
        Character krkWrapper = 'a';
        System.out.println(Character.isLetter( '5'));
        System.out.println(Character.isDigit('6'));

        String str1 = "123";
        String str2 = "12";

        // str1 str2 'nin degerlerini matematiksel olarak toplayin

        System.out.println(str1 + str2);

        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));

        // Integer.parseInteger(str) icine yazilan str rakamlardan olusursa str'i int'e cevirir
        // ancak bir karekter bile rakam degilse hata verir.

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);

        short s1 = 20;
        int s2 = s1;


       // Short shr1 = 20;   // cevirilmez

       // Integer shr2 = (Integer) shr1;





    }
}
