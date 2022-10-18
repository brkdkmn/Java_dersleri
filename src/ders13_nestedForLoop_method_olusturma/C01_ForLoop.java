package ders13_nestedForLoop_method_olusturma;

public class C01_ForLoop {

    public static void main(String[] args) {

       // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String input = "Java ne kadar guzel";

        for (int i = input.length() -1; i >=0 ; i--) {
            System.out.println(input.charAt(i));

        }

    }


}
