package ders24_constructors;

public class ArabaRunner {

    public static void main(String[] args) {

        Araba arb1 = new Araba();

        arb1.marka = "Citroen";
        arb1.model = "C3";
        arb1.yakit= "Benzin";
        arb1.yil =2000;
        arb1.fiyat=25000;
        System.out.println(arb1);

        Araba arb2 = new Araba("Volvo","CX60");
        System.out.println(arb2);

        Araba arb3 = new Araba("Hyundai","i10",10000);
        System.out.println(arb3);

        Araba arb4 = new Araba("Renault","Megane","Dizel");
        System.out.println(arb4);

        Araba arb5 = new Araba("Porche","cayan","benzin",1999,15000);
        System.out.println(arb5);

    }


}
