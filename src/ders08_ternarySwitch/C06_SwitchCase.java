package ders08_ternarySwitch;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /// kullanicinin girdigi gun nunarasinin
        // gun isimini yazdirin

        int gunNo = 2;

       // if (gunNo == 1) {
           // System.out.println("pazartesi");
       // } else if (gunNo == 2) {
           // System.out.println("sali");
       // } else if (gunNo == 3) {
           // System.out.println("carsamba");
       // } else if (gunNo == 4) {
           // System.out.println("persembe");
       // } else if (gunNo == 5) {
            //System.out.println("cuma");
       // } else if (gunNo == 6) {
           // System.out.println("cumartesi");
       // } else if (gunNo == 7) {
           // System.out.println("pazar");
      //  }else
           // System.out.println("gecersiz gun numarasi");



        switch (gunNo){
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz gun no");
        }

    }

}
