package ders13_nestedForLoop_method_olusturma;

public class C03_NestedForloop {

    public static void main(String[] args) {

        // 1- 4 arasindaki sayilar icin carpim tablosu olusturalim

        // dis dongu satirlari kontrol eder

        for (int i = 1; i <=4 ; i++) {

            // ic dongu her satirda olan donguleri kontrol eder

            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j+" ");

            }
            // ic dongu bittiginde javayi alt satira indirmeliyiz

            System.out.println("");

        }
    }
}
