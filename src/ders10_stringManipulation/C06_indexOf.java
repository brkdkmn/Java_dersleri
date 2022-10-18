package ders10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); //9 ilk a'nin index'ini dondurur

        System.out.println(str.indexOf('c'));  //8

        System.out.println(str.indexOf("hersey")); // 15

        System.out.println(str.indexOf("i",4));

        // 13 indexteki e den bir sonraki e' nin indekini bukualim

        System.out.println(str.indexOf("e",14));

        // cumledeki 2. c'nin index'ini yazdirin

        int ilkcindex = str.indexOf("c"); // 8

        System.out.println(str.indexOf("c",ilkcindex+1));

        System.out.println(str.indexOf("ali")); // index olarak int dondurmesi lazim.ve olmayan hersey -1 doner


    }
}
