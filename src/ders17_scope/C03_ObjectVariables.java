package ders17_scope;

public class C03_ObjectVariables {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static int hastaSayisi = 23453;
    static String bashekimIsmi;
    String personelIsmi="isim girilmedi";
    String personelTel;
    int personelYasi;


    /*
      Class level variable'lerin scope'u tum class'dir
      Static kelimesi ile isaretlenen variablle'lara
      class icerisinde heryerden ulasilabildigi icin diger adi class variables'dir

      static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
      instance variable'lara objelere bagli olduklarindan bu variable'larin diger adi object variables'dir
     */

    public static void main(String[] args) {


    }
}
