package ders40_interfaces;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface,I06_Interface {

    /*
     - bir class sadece bir class'a extend edilebilir
       ancak birden fazla interface'e implements edilebilir
      - concrete child class implement ettigi
        tum interface'lerdeki abstract methodlari override etmek zorunda olup
        iki interface'deki tum methodlari override etmek gerekir
      - iki interface de ayni isimde ve ayni return tupe'a sahip
        method'lardan hangisini override ettigi onemli degildir
      - Ancak isimler ayni return type'lar farkli oldugunda
        iki interface'i birden implement etmemiz mumkun olmayacaktir
        Bu durumda;
        - ya child class'dan bu iki interface'i implements etmekten vazgecmeliyiz
        - veya sisteme mudahale imkaniniz varsa bu conlict'i cozmelisiniz
      - Child class'dan parent interface'lerdeki variable'lari kullanmak istersek
        - ayni isimde iki interface'de de variable varsa
          interfaceIsmi.variableIsmi seklinde tercih etmeliyiz
          bir tane varsa sadece variableIsmi yazmak yeterli olacaktir(as.yaptik)
     */
    public static void main(String[] args) {
        System.out.println(I06_Interface.MESAJ);
        System.out.println(I05_Interface.SAYI);
        System.out.println(SAYI2);
    }
    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
