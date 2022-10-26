package ders23_constructors;

public class DAraba {

    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // biz'de bu class araba objeleri icin bir depo olarak dizayn edelim

    // Her class olusturuldugunda java o class'dan obje olusturabilmesi icin
    // default bir constructor olusturur.
    // bu defaul constructor gorunmez,
    // default constroctor paremetsizdir ve standart obje olusturur.

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }


    public int maxHiz(String yakit){
       int maxHiz=120;
        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }
}
