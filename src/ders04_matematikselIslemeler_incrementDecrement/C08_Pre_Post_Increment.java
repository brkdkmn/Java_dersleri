package ders04_matematikselIslemeler_incrementDecrement;

public class C08_Pre_Post_Increment {

    public static void main(String[] args) {

        int x = 3;

        int y = 2 * ++x; //x=4 oldu


        int z = 5 + y--; // y= 8  islemi yap  sonra azalt y=7 oldu
                         // z=13

        System.out.println(x+y+z);


    }
}
