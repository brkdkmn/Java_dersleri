package ders07_nestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun
        //  Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla
       // alirsa %15, yoksa %10 indirim yapin

        int urunAdeti = 30;
        boolean kartVarMi = false;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        if (kartVarMi && urunAdeti>=10){
            toplamFiyat =urunAdeti*listeFiyati*+(0.8);
            System.out.println("%20 indirimli toplam fiyat: " + toplamFiyat);
        } else if (kartVarMi && urunAdeti<10 && urunAdeti>0) {
            toplamFiyat =urunAdeti*listeFiyati*+(0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            
        } else if (!kartVarMi  && urunAdeti>=10) {
            toplamFiyat =urunAdeti*listeFiyati*+(0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            
        } else if (!kartVarMi && urunAdeti>0) {
            toplamFiyat =urunAdeti*listeFiyati*+(0.9);
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
        }else{
            System.out.println("gecersiz kardes");

        }


    }
}
