package ders08_ternarySwitch;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {

        // Java
        // Devolepment
        // Kit

        // kullanicidan bir harf alin
        // alinan harf J,D,K'dan biri ise yukaridaki kelimeleri yazdirin,
        // bu harflerden biri degilse "gecersiz harf yazdirin"

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        switch (harf) {
            case 'J' :
            case 'j' :
                System.out.println("JAVA");
                break;
            case 'D' :
            case 'd' :
                System.out.println("DEVOLEPMENT");
                break;
            case 'K' :
                break;
            case 'k' :
                System.out.println("KIT");
                break;
            default:
                System.out.println("gecersiz hart");
        }
    }
}
