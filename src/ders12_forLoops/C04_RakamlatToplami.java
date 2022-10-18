package ders12_forLoops;

public class C04_RakamlatToplami {

    public static void main(String[] args) {

        // kullanicinin verdigi  sayinin rakamlar toplamini bulunuz

        int sayi = 14539;
        int birlerB = 0;
        int rakamlarT = 0;

        for (int i = 1; i <=5 ; i++) {
            birlerB=sayi%10;
            rakamlarT = rakamlarT+birlerB;
            sayi = sayi/10;

        }
        System.out.print(rakamlarT);



       /* int sayi = 45665821;
        int birlerB = 0;
        int rakamlarT = 0;
        String sayiStr = "" + sayi;

        for (int i = 1; i <= sayiStr.length(); i++) {
            birlerB = sayi % 10;
            rakamlarT = rakamlarT + birlerB;
            sayi = sayi / 10;

        }
        System.out.print(rakamlarT);

        */
    }
}



