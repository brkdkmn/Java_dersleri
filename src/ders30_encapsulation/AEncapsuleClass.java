package ders30_encapsulation;

public class AEncapsuleClass {

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    public void setHastaneIsmi(String hastaneIsmi) {
        this.hastaneIsmi = hastaneIsmi;
    }

    public int getHastaUcreti() {
        return hastaUcreti;
    }

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }
    private String hastaneIsmi="Yildiz Hastanesi";
    // Hastane ismi gorulebilsin ama degistirilmesin
    // getter method'u lazim
    private  int hastaUcreti;


    // Hasta ucretleri de giris yapilabilsin ama
    // ucreti sigortadan alinacagi icin
    // personel hasta  ucretlerini goremesin
    // setter method'u lazim
    private String hemsireIsmi;
    private String hemsireAdresi;

    // bu instance variable'lere herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir
    // bu variable'leri public yapmak yerine
    // private yapip, getter ve setter olusturmak da
    // ayni islevi gorur

    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }



}
