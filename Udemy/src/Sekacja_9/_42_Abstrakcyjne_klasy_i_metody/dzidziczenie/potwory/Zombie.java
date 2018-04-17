package Sekacja_9._42_Abstrakcyjne_klasy_i_metody.dzidziczenie.potwory;

public class Zombie extends Potwor{
    public int sila;

    public Zombie(){

    }
    public Zombie(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
    }

    @Override
    protected void opis() {

    }

    @Override
    protected void opis2() {

    }

    public Zombie(double predkoscChodzenia, double zywotnosc, int sila){
        super(predkoscChodzenia, zywotnosc);
        this.sila = sila;
    }

}
