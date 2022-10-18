package ders17_scope;

public class C04_ClassVariables {

    public static void main(String[] args) {
        // C03 deki hastane ismini yazdirmak istesek

        System.out.println(C03_ObjectVariables.hastaneIsmi); // Yildiz hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

        /*
         kod takibi main metod'dan baslar
         */

    }
    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;


    }


    /*
      Java Runtime programdir
      calismaya basladiginda variable'lara atanan degerleri isler
      calistigi muddetce yapilan degisikleri kaydeder
      ama calismasi bittiginde degisen degerler resetlenir.
     */
}
