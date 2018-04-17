package Sekacja_9._39_Dziedziczenie.dziedziczenie.potwory;

public class Zombie extends Potwor {
    public int sila;

    public Zombie(){
        System.out.println("Domyslny konstruktor z klasy Zombie");
    }
    public Zombie(double predkoscChodznia, double zywotnosc ){
        super(predkoscChodznia, zywotnosc);
    }
    public Zombie(double predkoscChodzenia, double zywotnosc, int sila){
        super(predkoscChodzenia, zywotnosc);
        this.sila = sila;
    }

}
