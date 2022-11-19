package ders37_exceptions;

public class C02_ClassCastExceptions {

    public static void main(String[] args) {

        short sayi1=23;
        int sayi2=sayi1;

        Short sayi3=24;
        //Integer sayi4=sayi3;  Integer ve Short arasinda parent-child iliskisi olmadigindan
        // birbirne atama yapamazsiniz


        // Aralarinda parent-child iliskisi olan class'lardan olusan objeler icin
        // auto-widening veya explicit-norrowing mumkundur
        Object obj=sayi3;
        System.out.println("Short'tan obje'ye cast edince : "+obj);

        Integer sayi5=(Integer) obj;

        System.out.println("Short datayi obje uzerinden Integer'a cevirince : " + sayi5);
        //ClassCastException
    }
}
