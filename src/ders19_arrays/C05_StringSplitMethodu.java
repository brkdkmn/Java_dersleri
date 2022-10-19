package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {

    public static void main(String[] args) {

        String str = "Java gercekten cok cok guzelmis";
        // verilen stringte kac tane e harfi olugunu bulunuz

        String [] eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi)); // [Java g, rc, kt, n cok cok guz, lmis]
        System.out.println(eArrayi.length); // 5

        System.out.println("Metindeki e sayisi : " + (eArrayi.length-1));

        // 2. yontem
        // String'i "" ile split yaparak karekterlerine ayiralim

        String[] tumKarekterlerArr= str.split("");
        System.out.println(Arrays.toString(tumKarekterlerArr));
        // [J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l, m, i, s]

        int sayac= 0;
        // bir loop ile tum karekterleri kontrol ederim

        for (int i = 0; i < tumKarekterlerArr.length ; i++) {

            if (tumKarekterlerArr[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("Metindeki e sayisi : " + sayac); // 4

    }
}
