package ders18_arrays_diziler;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String [] arr={"Ali","Ulus","Nesrin","Burak"};

        // Bu array'in tum elementlerini aralarin da bir bosluk birakarak yazdiralim.

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        // Bu array'i array olarak yazdiralim
        System.out.println(arr); // @566776ad

        // array bir obje / non-primitive data turu oldugundan java referansini yazdirir
        // Array'y array olarak yazdirmak isterseniz Arrays class'indan yardim almaliyiz

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin, Burak]
    }
}
