package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIteratot {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // Iterator kullanarak listenin elementlerini sondan basa dogru yazdirin
        ListIterator lit1= sayilar.listIterator();
        // Once iterator'i sona gotureli

        while (lit1.hasNext()){
            lit1.next();
        }
        // Simde sondan basa dogru gidelim, giderken elementleri yazdiralim

        while (lit1.hasPrevious()){
            System.out.print(lit1.previous()+ " ");
        }


        // eger iterator'i nerede biraktigimizi hatirlayamazsak
        // iterator.nextIndex() ile hangi index'in oncesinde oldugumuzu gorebiliriz
        System.out.println("");
        System.out.println(lit1.nextIndex());

        // Iterator kullanarak listenin tum elementlerini 5 artirin

        while (lit1.hasNext()){
            lit1.set((Integer)lit1.next()+5);
        }
        System.out.println(sayilar); // [15, 25, 35, 45]

        // iterator kullanarak 40'dan kucuk olan elementleri silin

        while (lit1.hasPrevious()){
            if ((Integer) lit1.previous()<40){
                lit1.remove();
            }
        }
        System.out.println(sayilar); // [45]
    }
}

