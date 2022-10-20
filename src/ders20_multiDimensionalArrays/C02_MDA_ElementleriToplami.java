package ders20_multiDimensionalArrays;

public class C02_MDA_ElementleriToplami {

    public static void main(String[] args) {

        int [] arr = {3,5,7,8}; // 23
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        System.out.println("Tek katli array elemntler toplami : " + toplam);


        int[][] arr1 = {{1,2},{3,4,5},{7}};

        toplam=0;

        for (int i = 0; i <arr1.length ; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

            toplam+= arr1[i][j];

            }

        }
        System.out.println("2 katli array elemntler toplami : "+ toplam);
    }
}
