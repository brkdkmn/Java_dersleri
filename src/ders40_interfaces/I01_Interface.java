package ders40_interfaces;

public interface I01_Interface {

    // Interface'ler ozel yapi olduklarindan yazilsa da yazilmasa da
    // tum variable'lar public,static,final'dir

    String MESAJ="Hello Interface";
    static int SAYI=10;
    public static boolean GUZEL_MI=true;
    public static final int SAYI2=50;

    // Ayni sekilde tum method'lar public ve abstract'tir
    void method1();
    abstract int method2();
    public abstract String method3();


}

