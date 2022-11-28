package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        // C key olarak degerini 3 artir

        if (mp1.containsKey("c")){

            mp1.put("C", mp1.get("C")+3);
        }
        System.out.println(mp1); // {A=5, B=3, C=7}

        // B key olarak varsa degerini 2 ile carp

        mp1.computeIfPresent("B",(k,v)->2*v);
        System.out.println(mp1);

        // Map 'de D yoksa value'su 11 olacak sekilde ekleyelim

        if (!mp1.containsKey("D")){

            mp1.put("D",11);
        }
        System.out.println(mp1); //{A=5, B=3, C=7, D=11}
    }
}
