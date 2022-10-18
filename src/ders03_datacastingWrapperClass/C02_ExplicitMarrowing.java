package ders03_datacastingWrapperClass;

public class C02_ExplicitMarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        /*
            genis data turundeki bir degeri dar data turundeki bir variable atamak isterseniz
            java sorumlulugu almanizi ister.

            bu sorumlulugu almak icin cast edecegimiz degerin icine parantez () icerisinde
            cast etmek istedigimiz data turu yazdirilir

            ancak bu durumda data kayiplari (doubledan int'e gecerken) virgulden sonrasi silinir

            veya baskalasim olabilir.(int'i byte cevirirsek) tekrra tekrar basa doner
         */

        short sh = (short) sayi;
        System.out.println(sh);

        double dbl = 23.5;
        int say = (int) dbl;

        System.out.println(say); // 23 yazar virgulden sonrasini atar (tamsayiya cevirir.)

        say = 129;
        byte byt = (byte) say;
        System.out.println(byt);
    }
}
