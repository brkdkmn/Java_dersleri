package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {
        // C03 class'indaki instance variable'lara nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz
        C03_ObjectVariables pers1= new C03_ObjectVariables();
        System.out.println(pers1.personelIsmi); // Isim girilmedi
        System.out.println(pers1.personelYasi); // 0
        pers1.personelIsmi="Suleyman";
        pers1.personelYasi=35;
        pers1.personelTel="555.3456754";
        System.out.println(pers1.personelIsmi); // Suleyman
        System.out.println(pers1.personelIsmi); // 35
        C03_ObjectVariables pers2= new C03_ObjectVariables();
        pers2.personelIsmi="Latife";
        pers2.personelYasi=32;
        pers2.personelTel="555 4322321";
        System.out.println(pers1.personelIsmi); // Suleyman
        System.out.println(pers2.personelIsmi); // Latife
        C03_ObjectVariables pers3= new C03_ObjectVariables();
        pers3.personelIsmi="Heysem";
        pers3.personelYasi=30;
        pers3.personelTel="312 2134567";
        System.out.println(pers1.personelYasi); // 35
        System.out.println(pers2.personelYasi); // 32
        System.out.println(pers3.personelYasi); // 30
    }
}
