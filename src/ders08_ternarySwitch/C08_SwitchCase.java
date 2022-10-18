package ders08_ternarySwitch;

import java.util.Scanner;

public class C08_SwitchCase {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        int ayNumarasi = 50;

        switch (ayNumarasi){

            case 12:
            case 1:
            case 2 :
                System.out.println("kis");
            break;
            case 3:
            case 4:
            case 5 :

                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8 :
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11 :
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("bunlardan hicbiri");

        }
    }
}
