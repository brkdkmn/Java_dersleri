package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota{

    DCamry(String pc){
        super("Deniz");
        System.out.println("String parametreli Camry");

    }
    DCamry(){

    }

    public static void main(String[] args) {
        // Eger kullanilan argumente uygun bir constructor
        // parent class'ta yoksa CTE olur

        DCamry camry1=new DCamry();
        //Parametresiz Araba Constructor
        //Parametresiz Toyota Costructor

        DCamry camry2=new DCamry("Kaan");
        //Parametreli Araba Constructor
        //String Parametreli Toyota Const.
        //String Mehmet
        //String parametreli Camry

    }
}
