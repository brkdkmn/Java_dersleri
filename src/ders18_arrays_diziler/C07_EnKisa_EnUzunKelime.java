package ders18_arrays_diziler;

public class C07_EnKisa_EnUzunKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr = {"Hasan","Adem","Kaan","Omer Oguz"};

        enUzunEnKIsaisimleriYazdir(arr);
    }

    public static void enUzunEnKIsaisimleriYazdir(String[] arr){
        String enuzunKelime = arr[0];
        String enkisaKelime = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>enuzunKelime.length()){
                enuzunKelime=arr[i];
            }

            if (arr[i].length()<=enkisaKelime.length()){  // esitlik olursa 2. alir(Kaan)
                enkisaKelime=arr[i];
            }

        }

        System.out.println("En uzun isim : " + enuzunKelime);
        System.out.println("En kisa isim : " + enkisaKelime);


    }
}
