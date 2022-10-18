package ders06_ifElse_Statements;

public class C10_IfElseIfStatements {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        // yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        // olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet = 'H';
        int yas = 60;

        if (cinsiyet== 'E' && yas>=65){
            System.out.println("emekli olabilir");

        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("emekli olmak icin " +(65-yas)+ " yil daha calismalisin");

        }else if (cinsiyet=='K' && yas>=60) {
            System.out.println("emekli olabilir");

        } else if (cinsiyet=='K' && yas<65) {
            System.out.println("emekli olmak icin " +(65-yas)+ " yil daha calismalisin");

        }
        else{
            System.out.println("gecersiz giris");
        }


    }

}
