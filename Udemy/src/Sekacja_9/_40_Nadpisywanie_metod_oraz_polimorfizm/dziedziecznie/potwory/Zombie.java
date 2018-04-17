package Sekacja_9._40_Nadpisywanie_metod_oraz_polimorfizm.dziedziecznie.potwory;

public class Zombie extends Potwor {
    public int sila;

    public Zombie(){

    }
    public Zombie(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
    }
    public Zombie(double predkoscChodzenia, double zywotnosc, int sila){
        super(predkoscChodzenia, zywotnosc);
        this.sila = sila;
    }
}
