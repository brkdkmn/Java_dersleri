package ders30_encapsulation;

public class C01_Encapsulations {

    public static void main(String[] args) {

        AEncapsuleClass pers1 = new AEncapsuleClass();
        //pers1.hastaneAdi = "java hastanesi";

        //private oldugu icin gorulemez

        //pers1.hastaUcreti=1000; private oldugu icin kullanilmaz

       // pers1.hemsireAdresi="Ankara"; // private oldugundan ulasilmaz
       // pers1.hemsireIsmi="Yildiz Yildiz";

        System.out.println(pers1.getHastaneIsmi()); // Yildiz hastanesi

        pers1.setHastaUcreti(500);

        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Ankara");
        System.out.println(pers1.getHemsireIsmi());


    }
}
