package ders40_interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {

    // Bir class'i bir interface'in Child'i yapmak icin implements kullanilir

    public static void main(String[] args) {

        System.out.println(MESAJ); // Hello Interface
        //sayi=25; yazili olmasa da Interface icerisinde
        //           oldugunda finaldir ve atama yapilmaz
        System.out.println(SAYI); // 10
        System.out.println(GUZEL_MI); // true
        System.out.println(SAYI2); // 50

        System.out.println(Integer.MAX_VALUE);
        // Normalde variable isimleri kucuk harfle baslar
        // ve camelCase kullanir
        // Ancak java da ortak kabul olarak
        // static ve final olarak isaretlenen variable isimleri
        // tamamen buyuk harfle yazilir

        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
