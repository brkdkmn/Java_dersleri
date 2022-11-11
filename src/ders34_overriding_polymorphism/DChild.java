package ders34_overriding_polymorphism;

public class DChild extends CParent{

    // Overriding Kurallari
    // 1- access modifer method signatur'a dahil olmadigindan
    //    overridden ve overriding access modifier'lar farkli olabilir
    //    child parent'i sinirlandirmaz
    //    yani overridding method'un access modifier'i ayni veya  daha kapsamli olmalidir
    //    private -- default -- protected -- public

    public void method1(){

    }

    // 2- private ve static methodlar override edilemez
    //    ayni isimde method olusturunca Java CTE vermez
    //    ancak override isareti cikmaz ve
    //    @override notosyonu kullanilmak istenirse CTE olur
    //    yani java bunlari farkli class'lardaki farkli method'lar olarak kabul eder


    protected static void method2(){
    }

    private void method3(){

    }
    // 3- return type method signature'ina dahil olmadigindan farkli secilebilir
    //    return type void veya primitive ise ayni olmak zorundadir
    //    eger return type'lar non-primitive ise
    //    child class'daki return type, parent class'daki return type'i ile ayni veya child'i olmalidir
    public void method4(){

    }
    public String method5(){
        return "";
    }

}
