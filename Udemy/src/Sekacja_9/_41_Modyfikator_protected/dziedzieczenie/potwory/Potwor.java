package Sekacja_9._41_Modyfikator_protected.dziedzieczenie.potwory;

public class Potwor {
    public double predkoscChodzenia;
    public double zywotnosc;
    public double testPublic;
    protected double testProtected;

    public Potwor(){
        System.out.println("Domyslny konstruktor klasy Potwor");
        /*
            BAZOWE ATAKOWANIE POTWORA
         */
    }
    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.zywotnosc = zywotnosc;
        this.predkoscChodzenia = predkoscChodzenia;
    }

    protected void atakuj(){
        System.out.println("to jest metoda atakuj klasy Potwor");
    }
    public void atakuj2(){
        System.out.println("to jest metoda atakuj2 klasy Potwor");
    }
}
