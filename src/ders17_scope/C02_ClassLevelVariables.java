package ders17_scope;

public class C02_ClassLevelVariables {
    // scope : nerden ulasabiliyruz nerden ulasamiyoruz
    // class level variablelar method'larin disinda olustirulur
    // genel kullanim en uste olusturulmalaridir

    static String hastaneIsmi = "Yildiz Hastanesi";
    static int hastaSayisi = 2435;
    static String bashekimIsmi;
    String personelIsmi="isim girilmedi";
    String personelTel;
    int personelYasi;

    public static void main(String[] args) {
        System.out.println(hastaneIsmi); // Yildiz Hastanesi
        System.out.println(bashekimIsmi); // null

        //System.out.println(personelIsmi); // static olmadigi icin main method'tan kullanilmaz
        /*
           Clas lesel variabler'a deger atamasi yapilmamis olursa
           java bu variablera data turune gore default olarak tanimlanan degerleri atar.
           Default degerler:
           sayisal variable'lar : 0
            boolean : false
            char : ''
            objeler(String dahil) : null
         */

    }

    public static void method1(){

        System.out.println(hastaSayisi);
        hastaSayisi++;
       // System.out.println(personelIsmi);

    }

    public void method2(){
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        System.out.println(personelIsmi); // isim girilmedi
        System.out.println(personelYasi); // 0

    }
}
