package ders13_nestedForLoop_method_olusturma;

public class C06_NestedForloopUcgen {

    public static void main(String[] args) {

        /*

           nested for loop kullanarak sekli hazirlayin

           1
           1 2
           3 6 9
           4 8 12 16
           5 10 15 20 25


         */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(i*j+" ");

            }

            System.out.println(" ");

        }
    }
}
