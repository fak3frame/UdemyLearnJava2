package Sekacja_9._39_Dziedziczenie.dziedziczenie.potwory;

public class Potwor {
    public double predkoscChodzenia = 10;
    public double zywotnosc;

    public Potwor(){
        System.out.println("Domyslny konstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyslny konstruktor z klasy potwor");
    }

    public void atakuj(){

        System.out.println("To jest metoda atakuj z klasu Potowr");
    }


}
