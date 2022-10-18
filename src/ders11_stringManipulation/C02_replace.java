package ders11_stringManipulation;

public class C02_replace {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace("c", "k"));  // Java kandir
        System.out.println(str.replace('r','R')); // Java candiR
        System.out.println(str.replace('a','A')); //JAvA CAndir
        System.out.println(str.replace(' ','-')); // Java-candir
        System.out.println(str.replace("candir" ,"cok guzeldir")); //Java cok guzeldir
        System.out.println(str.replace(" ","")); //Javacandir

        // Strindeki tum a'lari silin

        System.out.println(str.replace("a",""));// Jv cndir

        // Java yerine hava, candir yerine cok guzel yazdirin

        System.out.println(str.replace("Java","hava").
                replace("candir","cok guzeldir"));

        System.out.println(str.replaceFirst("","_")); //_Java candir
        System.out.println(str.replace("","_")); // _J_a_v_a _c_a_n_d_r_

        // sadece 1.a'yi A yapin
        System.out.println(str.replaceFirst("a","A"));
    }
}
