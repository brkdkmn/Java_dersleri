package ders13_nestedForLoop_method_olusturma;

public class C07_MethodOlusturma {

    public static void main(String[] args) {

        String str = "Java muhtesemdir";

         String buyukStr= str.toUpperCase();

        System.out.println(str); // Java muhtesemdir
        System.out.println(buyukStr); // JAVA MUHTESEMDİR


        // metnin buyuk harflere vevrilmis hali S ICERIR MI?

        System.out.println(buyukStr.contains("S"));

    }
}
