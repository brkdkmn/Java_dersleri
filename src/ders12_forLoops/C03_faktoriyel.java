package ders12_forLoops;

public class C03_faktoriyel {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoriyelini bulalim.

        // 5! = 5*4*3*2*1=120

        int sayi = 10;

        int faktoriyel = 1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyel = faktoriyel*i;
        }
        System.out.print(faktoriyel);

        // 1'den 100'e (sinirlar dahil)kadar olan sayilari toplayin
        System.out.println("");

        int toplam = 0;
        for (int i = 1; i <=100 ; i++) {
            toplam = toplam+i;
        }
        System.out.println(toplam);


    }
}
