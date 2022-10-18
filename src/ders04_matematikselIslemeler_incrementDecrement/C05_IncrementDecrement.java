package ders04_matematikselIslemeler_incrementDecrement;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 10;

        // bu sayiyi 3 artiralim ve yazdiralim

        sayi = sayi +3;
        System.out.println(sayi);

        sayi += 3;
        System.out.println(sayi);

        int s = 15;

        // bu sayiyi 1 artirin

        s++;
        System.out.println(s);

        s= s+1;
        System.out.println(s);

        s+=1;
        System.out.println(s);

        ++s;
        System.out.println(s);

        int t = 10;
        //bu sayinin degerini bir eksiltelim

        t = t-1;
        t-=t;
        t--; //post
        --t; //pre decrement
        System.out.println(t);
    }
}
