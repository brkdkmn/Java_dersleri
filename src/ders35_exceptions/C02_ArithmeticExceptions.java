package ders35_exceptions;

public class C02_ArithmeticExceptions {

    public static void main(String[] args) {

        // Verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        int sayi=20;
        int sayi2=0;

        try {
            // riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi/sayi2);
            System.out.println("Bakalim bu satir calisacak mi?");

        } catch (ArithmeticException e) {
            //  catch (ArithmeticExceptione) ongordugumuz risk
            System.out.println("sayi sifira bolunemez");
            // catch(0'dan sonraki{ } catch blogu nedir
            // beklenen risk gerceklesirse calisacak kodlar

        }

        /*
          Bazi excetion'lar if else ile handle edilebilir
          ancak tum exception'lar icin if else yeterli olmaz
         */
    }
}
