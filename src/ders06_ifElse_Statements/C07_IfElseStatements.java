package ders06_ifElse_Statements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //             olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char krktr = scan.next().charAt(0);

        if (krktr>= 'a' && krktr<='z'){
            // kucuk harf girildi demketir.
            System.out.println((char)(krktr -32));
        }
        else {
            // kucuk harf degildir demektir
            System.out.println(krktr);
        }

        //String str = "Hello World";
        //System.out.println(str.charAt(str.length()-1));
        //System.out.println(str.charAt(4));
        //System.out.println(str.length());
        //System.out.println(str.charAt(0));

       // String str = "Java ah java";
      // System.out.println(str.contains("x"));
       // System.out.println(str.contains("ja"));

       // String str1 = "Ali";

       // String str2 = "ali";

       // System.out.println(str1.equals(str2));
       // System.out.println(str2.equals(str1));
       // System.out.println(str1.equalsIgnoreCase(str2));
       // System.out.println(str2.equalsIgnoreCase(str1));

       //String str = "seyhan yavuz";
        //System.out.println(str.replace("s", "S").str.replace("y", "Y"));
        //System.out.println(str.replace('s', 'S').str.replace('y', 'Y'));
        //System.out.println(str.replaceAll("s", "S").str.replaceAll("y", "Y"));
       // System.out.println(str.replaceAll('s', 'S').str.replaceAll('y', 'Y'));

        String str = "Java kolaydir";
        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("dir"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("Java kolaydir"));

        String b = "Ali  12  ?_";
        System.out.println(b.replaceAll("\\d", "*"));
        System.out.println(b.replaceAll("\\D", "*"));
        System.out.println(b.replaceAll("\\S", "*"));
        System.out.println(b.replaceAll("\\w", "*"));


    }
}
