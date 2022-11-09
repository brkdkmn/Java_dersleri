package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{

    Corolla(int pc){
        super(5);
        System.out.println("Parametreli Corolla Constructor");
    }
    Corolla(){

    }
    Corolla(String str){
        this();
        System.out.println("String Parametreli Corolla Cons.");
    }

    public static void main(String[] args) {


        Corolla corolla1=new Corolla();
        // Parametresiz Araba Constructor
        //Parametresiz Toyota Costructor

        Corolla coralla2=new Corolla(3);
        //Parametresiz Araba Constructor
        //Parametreli Toyota Constructor
        //Parametreli Corolla Constructor

        Corolla corolla3=new Corolla("ilker");
        //Parametresiz Araba Constructor
        //Parametresiz Toyota Costructor
        //String Parametreli Corolla Cons.
    }
}
