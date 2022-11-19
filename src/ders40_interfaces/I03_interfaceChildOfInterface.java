package ders40_interfaces;

public interface I03_interfaceChildOfInterface extends I01_Interface {

    // Eger bir interface'i baska bir interface'in child'i yapmak isterseniz
    // extens keyword kullanilir

    // Bir interface concrete class'i INHERIT EDEMEZ

    void method1();
    // Interface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // ikisinin de bodys'si olmadigindan bu islemin bir anlami yoktur

    int method4();
    boolean method5();
}
