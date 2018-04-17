package Oskar_1;

public class Butelka {
    private final int pojemnosc = 10;
    private int ilosc;
//    public Butelka (){
//        System.out.println("konst domyslny");
//    }
    public Butelka (int ilosc){
        this.ilosc = ilosc;
        //konstruktor
    }
    public int getIlosc(){
        return this.ilosc;
    }
    public void setIlosc (int ilosc){
        this.ilosc=ilosc;
    }
}
