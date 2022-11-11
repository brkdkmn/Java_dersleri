package ders34_overriding_polymorphism;

public class BChild extends AParent {

    public void method1(){
        System.out.println("Child class method1");
    }

    public void method2(int a){
        // overriding olabilmesi icin
        // hem method ismi, hem de method signature ayni olmasi lazim
        System.out.println("Child class method2");
    }

    public  void method2(String isim){
        System.out.println("Child class String parametreli method2");
    }

    @Override
    public void method3() {
        //super.method3();
        //overriding varsa parent ve child class'daki
        //overridden ve overriding methodlardan sadece biri calisir
        //eger ikisini birden calistirmak isterseniz
        //suoer.overriddenMethodIsmi yazilir

        /*
          Overriding method @override notosyonu ile isaretlenebilir
          @Override kullanilmayan overriding isleminde
          parent class'daki overridden method silinirse hic bir sorun olmaz

          ancak @Override kullanilan overriding isleminde
          parent class'daki overridden method silinirse Java CTE verir
          boylece overridden method'un silinmesi engellenir
         */
    }


}

