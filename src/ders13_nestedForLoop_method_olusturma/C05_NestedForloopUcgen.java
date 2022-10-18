package ders13_nestedForLoop_method_olusturma;

public class C05_NestedForloopUcgen {

    public static void main(String[] args) {

        /*
           // nestedfor loop kullanarak asagidaki sekli hazirlayiniz

           1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5
         */

        for (int i = 1; i <=5; i++) {

            for (int j = 1; 1 <=i ; j++) {

                System.out.print(j+" ");

            }
            System.out.println("");

        }


    }
}
