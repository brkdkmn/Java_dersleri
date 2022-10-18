package ders09_string_Manipulations;

import java.util.Locale;

public class C01_toUpperCase {

    // 1-String manipulation: String'leri method'lar kullanarak degistirme ,istenen sekle sokma.
    // 1-toLowerCase() ve to UpperCase(): metni istedigimiz buyuk harf veya kucuk harfe cevirir.
    // 2-buyuk kucuk harf degisimi yaparken locale bir dil ozelligini kullanmak istersek,
    //   parametre olarak istedigimiz Locale dili yazabiliriz
    // 3-charAt(istenen index): istedigimiz indexte'ki karekteri char data turunde bize dondurur.
    //   Index bulunamazsa stringindexoutOFBoundsException verir.
    // 4-length(karekter sayisini verir,length ile son index arasinda 1 sayi fark vardir.Yani
    //   sonindex=length()-1
    // 5-charAt()'unda sondan 3.cu karekter istenirse charAt(str.length()-3 ile bulunur.
    // 6-equals():Stringleri karsilasrtirmak icin == yerine kullanilir.
    //   Eger metinler birebr ayni ise equals() bize true dondurur,
    //   ancak case farkliligi veya yazimda farklilik varsa false dondurur.
    // 7-equalsignorecase(): equals()'dan farki buyuk - kucuk harf duyarliligi yoktur.
    //   Metinler ayni olmak sartiyla buyuk - kucuk harf farkliligi olsa da true dondurur.
    //   ama metinde farklilik varsa false dondurur.
    // 8-str.substring(tekindex): girilen index'ten sona kadar tum metni verir.
    // sr.substring(ilkindex,sonindex): ilk index inclusive,son index exclusive olarak aradaki metni verir.

    public static void main(String[] args) {

        String str = "Java Mutluluktur";
        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase();

        str = "ince mehmet";
        str = str.toUpperCase();
        System.out.println(str);

        //str = str.toLowerCase();
        //System.out.println(str);

        System.out.println(str.toLowerCase(Locale.GERMANY));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));
    }
}
