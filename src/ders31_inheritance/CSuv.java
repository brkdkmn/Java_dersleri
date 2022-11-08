package ders31_inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {

        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka); // Binek araclarin markasi vardir
        System.out.println(suv1.model); // Binek araclarin modeli olur
        System.out.println(suv1.motor); // Tum araclar motor kullanir
        System.out.println(suv1.plaka); // Tum araclarin plakasi olur
        System.out.println(suv1.yakit); // Araclar farkli yakitlar kullanir
        System.out.println(suv1.yil); // 1900
        suv1.hiz("benzin"); // Binek araclarin hizi modele gore degisir
        suv1.teker(); // Binek araclarin dort(4) tekeri olur

        CSuv suv2 = new CSuv();
        suv2.marka = "toyota";
        suv2.model = "RAV4";
        suv2.motor = "1.6";
        suv2.plaka = "06 Java 06";
        suv2.yakit = "hibrit";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit); // once kendi clasina bakar yoksa parent'e gider

    }
    public void hiz(String yakit){

        if(yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'ler max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'ler max 250 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'ler max 200 km hiz yapar");
        }else {
            System.out.println("yakit belli degil,max hiz soyleyemem");
        }

    }
}
