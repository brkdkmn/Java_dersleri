package ders39_abstractClass;

public abstract class BHonda extends Araba{

    // Abstract bir class'i parent edindigimizde;
    // iki alternatifimiz olur:
    // 1-Parenet'imiz olan abstract class'taki abstract method;lari override etmek
    // 2-Proje yapimiz gerektiriyorsa bu class'i da abstract yapmak

    public void marka(){
        System.out.println("Marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vtec teknolojisi kullanmali");
    }
}
