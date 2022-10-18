package ders09_string_Manipulations;

public class C06_substring {

    public static void main(String[] args) {

        String str = "Java ogren, isi kap";
        System.out.println(str.substring(3));
        System.out.println(str.substring(0));
        System.out.println(str.length());

        // son karekteri string olarak kaydedin

        String sonHarf;

        sonHarf = str.substring(str.length()-1);
        System.out.println(sonHarf);

        // son indexdeki karekteri upper case olarak yazdirin

        System.out.println(str.substring(str.length()-1).toUpperCase());;
        System.out.println(str.substring(str.length()-3).toUpperCase());//son uc harf
    }
}
