package ders08_ternarySwitch;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1 = 12;
        int kenar2 = 12;
        int kenar3 = 12;
        System.out.println(kenar1 == kenar2 && kenar2 == kenar3 ? "Eşkenar Üçgen" : "Eşkenar üçgen değil");

        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        int say1 = 50;
        int say2 = 85;

        System.out.println(say1 > say2 ? say2 : say1);
    }
}
