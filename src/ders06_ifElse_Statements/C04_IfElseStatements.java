package ders06_ifElse_Statements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf lup olmadigini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char krktr = scan.next().charAt(0);

        if (krktr >= 'A' && krktr<= 'Z'){
            System.out.println("buyuk harf");
        }
        else {
            System.out.println("buyuk harf degil");
        }
    }
}
