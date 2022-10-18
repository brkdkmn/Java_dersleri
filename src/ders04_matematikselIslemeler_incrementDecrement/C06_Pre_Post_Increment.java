package ders04_matematikselIslemeler_incrementDecrement;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a=10;

        // a variablenin degerini yazdirip,
        // sonra a'nin degerini bir artirin


        System.out.println("a :" +a);
        a++;

        int b= 10;

        // b variable'nin degerini bir artirip,
        // sonra yazdirin
        b++;
        System.out.println("b :" +b);

        int c= 10;

        // c variable'nin degerini bir artirip,
        // sonra yazdirin

        System.out.println("c : " + c++); // 10

        int d = 10;

        // d variable'nin degerini bir artirip,
        // sonra yazdirin

        System.out.println("d : " + ++d); // 11

        /*
         c++ veya ++d 'yi yazdirma isleminde kullanirsaniz
         c++ 'e post increment denir ve o satir icin once islemi yapr sonra artirmayi yapar
         ++d 'ye pre increment denir ve once artirma yapip sonra islemi yapar

         islemin oldugu satirin bir alt satirina gecildiginde c'de, d'de bir artmistir.
         */



    }
}
