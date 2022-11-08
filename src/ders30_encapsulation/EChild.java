package ders30_encapsulation;

public class EChild extends DParent {
    /*
      Java'daki inheritance'nin insanlardan en buyuk farki :
      insanlarda parent child edinebilir ama child parent'ini secemez
      Java'da is tam tersidir
      - siz bir class olusturdugunuzda daha once olusturdugunuz class'lardan tum ozelliklerini
        inherit etmek istediginiz class'i PARENT EDINIRSINIZ.

        BIr class baska nir classi inherit etmek istediginde
        extends keyword ile bunu deklare eder
     */

    public static void main(String[] args) {

        EChild child1 = new EChild();

        child1.yas =30;
        child1.isim="Omer";
        child1.isEnough=false;




    }
}
