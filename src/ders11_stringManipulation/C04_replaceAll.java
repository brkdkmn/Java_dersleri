package ders11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {

        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karekterleri temizleyen bir kod yazin
        // NOT: space silinmemeli

        String input = "Ja5+v_a cok 1*guzel";


        input = input.replaceAll("\\d",""); // Ja+va cok *guzel
        input = input.replace(" ","5");
        input = input.replaceAll("\\W",""); // Java5cok5guzel
        input = input.replace("5"," "); // Java cok guzel
        input = input.replace("_","");
        input = input.replaceAll("\\s+", " ");
        System.out.println(input);


    }
}
