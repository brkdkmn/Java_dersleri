package ders23_constructors;

public class HAraba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;
    }

    public HAraba(String mrk,String mdl,int yl){
        // istersek paremetreleri azaltarak da constructor olusturabiliriz
        marka=mrk;
        model=mdl;
        yil=yl;

    }

    public HAraba(String mrk,int yl, int fyt){
        marka = mrk;
        yil=yl;
        fiyat=fyt;
    }

    public HAraba(){
        // gorunur durumdaki paremetresiz constructor default constructor DEGILDIR
        // Default constructor'un body'si de bos olur
        // Ancak paremetresiz constructor'da body'e kod yazilabilir

        // paremetresiz constructor'in body'sinde kod yoksa
        // default constructor ile ayni islemi gorur
        //  ama yine de gorunur durumdaysa default cons. denmez.
    }


    // Biz gozle gorulur herhangi bir constructor olusturdugumuzda
    // Java default constroctor'i siler
    // Budurumda daha once olusturulmus olan objelerin sorun olmamasi icin,
    // class'a paremetresiz bir constroctur eklememiz faydali olur

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }


    public int maxHiz(String yakit){
        int maxHiz=120;
        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }
}
