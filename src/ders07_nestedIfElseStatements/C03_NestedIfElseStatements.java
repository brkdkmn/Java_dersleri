package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {


        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        // yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        // olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet= 'E';
        int yas = 66;



        // nestef if - else seklide kullanim icin once ana degiskeni secip
        // ona gore yapiyi olusturalim
        // cinsiyet ana degisken olsun

        if (cinsiyet == 'k' || cinsiyet == 'K'){
            // Giris yapilan deger bir kadina ait demektir
            if (yas<15){
                System.out.println("hatli yas girisi");
            } else if (yas<60) {
                System.out.println("emekli olamazin, daha " + (60-yas) + " yil  calismalisin");
            }
            else {
                System.out.println("emekli olabilirsin");
            }


        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            // GIRISYAPILAN DEGER BIR ERKEGE AIT DEMEKTIR
            if (yas<15){
                System.out.println("hatli yas girisi");
            } else if (yas<60) {
                System.out.println("emekli olamazin, daha " + (60-yas) + " yil  calismalisin");
            }
            else {
                System.out.println("emekli olabilirsin");
            }


        }
        else{
            System.out.println("yanlis cinsiyet girisi yapildi");
        }


    }
}
