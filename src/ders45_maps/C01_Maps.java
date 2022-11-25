package ders45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {

    public static void main(String[] args) {

        // Verilen bir cumlede kullanilan herbir harfi
        // ve o harfin kullanim miktarini
        // A=5 , b=3 ... gibi yazdirin

        String str="Javayi balonu patlatmadan bitirelim";
        // j=1 , a=7 , v=1 , y=1....

        String[] harflerArr=str.split("");
       // System.out.println(Arrays.toString(harflerArr));
        //[J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String,Integer> kullanimMiktarlariMap=new TreeMap<>();
        int sayac=1;
        // 1-Tum harfleri sirasi ile ele alacagiz

        for (int i = 0; i < harflerArr.length ; i++) {

            // 2-Ele aldigimiz harfin daha once map'a eklenip eklenmedigini kontrol edelim
            if (kullanimMiktarlariMap.containsKey(harflerArr[i])) {
                continue;
            }else {
                // kod buraya geldiyse o harf henuz map'a eklenmemistir
                // o zamn bu harfin kullanim miktarini bulmaliyiz
                for (int j = i+1; j < harflerArr.length ; j++) {
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;
                    }
                }
                // sayma islemi bitti , Key ve Value'yu map'e ekleyelim
                kullanimMiktarlariMap.put(harflerArr[i],sayac);
                sayac=1;
            }
        }
        System.out.println(kullanimMiktarlariMap);
    }
}
