package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {

    public static void main(String[] args) {
        // verilen bir int array'da en kucuk ve en buyuk sayilari yazdiran bir method olusturun

        int [] arr = {3,8,1,5,2,9};
        enBuyukEnKucukElemntYazdir(arr);
    }
    public static void enBuyukEnKucukElemntYazdir(int[] arr){ // yazdiracaksa void

        Arrays.sort(arr);
        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);

    }
}
