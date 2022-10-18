package ders11_stringManipulation;

public class C01_nullPointer {

    public static void main(String[] args) {

        String str1 = "";
        // str1'e deger atanmistir.
        System.out.println(str1); // hiclik yazdirir.
        System.out.println(str1.concat("java")); // java

        String str2;
        // str2 olusturuldu ama deger atanmadi
        //System.out.println(str2); // stringManipulation ( deger atanmadigi  icin str2  yazdirilmaz

        str2 = "Java candir kardes";
        System.out.println(str2);

        String str3 = null;
        //str3'e deger atanmamistir.
        // null pointer ile deger atamadigimizin farkinda oldugumuzu soyluyoruz
        System.out.println(str3); // null isaretlendirdigii yazdirir
        //System.out.println(str3.concat("java candir"));

        System.out.println(str3 + "Java"); // nullJava




    }
}
