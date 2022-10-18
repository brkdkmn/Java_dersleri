package ders10_stringManipulation;

public class C09_lastindexSoru {

    public static void main(String[] args) {

        /*
          Kullanicidan bir cumle ve bir metin alin
          cumlede metnin durumuna gore
            1- cumle metni icermiyor
            2- cumle metni sadece 1 kere iceriyor
            3- cumle metni birden fazla iceriyor
            seceneklerinden uygun olani yazdirin
      */

        String cumle = "Java cok guzeldir cok.";
        String metin = "cok";

        int ilkindex = cumle.lastIndexOf(metin);
        int sonindex = cumle.lastIndexOf(metin);

        if (ilkindex==(-1)){
            System.out.println("cumle metni icermiyor");
        } else if (ilkindex==sonindex) {
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else{
            System.out.println("cumle metni birden fazla iceriyor");
        }
    }
}
