package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {

    public static void main(String[] args) {

        int [] arr = {1,8,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8)); // 6
        System.out.println(Arrays.binarySearch(arr, 5)); // -2
        System.out.println(Arrays.binarySearch(arr, 7)); // 5

        /*
          Binary search methodu'nun dogru sonuclar vermesi icin
          oncelikle sort method'u kullanilmalidir.

          sort() kullanmadan yapilan aramanin sonucu belli olmaz
          dogru veya yanlis sonuc verebilir
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8]
        System.out.println(Arrays.binarySearch(arr,8)); // 6
        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr, 7)); // 5
        System.out.println(Arrays.binarySearch(arr,1)); // 1
        System.out.println(Arrays.binarySearch(arr,0)); // -1

        // array'da olmayan bir elamani aratirsak
        // Java once o sayi array'da olsa nerede olurdu onu bulur sonra buldugu
        // bu SIRA'yi - isareti ile verir
        System.out.println(Arrays.binarySearch(arr,11)); // -9
        System.out.println(Arrays.binarySearch(arr,-3)); // -1
        System.out.println(Arrays.binarySearch(arr, 4)); // -5
        System.out.println(Arrays.binarySearch(arr, 70)); // -9
    }
}
