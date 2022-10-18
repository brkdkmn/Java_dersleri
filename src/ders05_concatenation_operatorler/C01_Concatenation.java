package ders05_concatenation_operatorler;

public class C01_Concatenation {

    public static void main(String[] args) {

        // sadece asagida verilen veriableri kullanarak istenen degerleri yazdiralim

        String s1 = "Java";
        String s2 = "Guzeldir";
        String s3 = ""; //hiclik
        String s4 = " "; //space,bosluk


        int sayi1 = 4;
        int sayi2 = 3;

        //Java Guzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));

        //Java Guzeldir 12

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));

        // 7Java Guzeldir

        System.out.println((sayi1+sayi2)+s1+s4+s2);

        // 34 Java

        System.out.println(s3+sayi2+sayi1+s4+s1);

        // Java7 Guzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+s3+sayi1+sayi2);
    }
}
