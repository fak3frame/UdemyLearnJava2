package Sekacja_9._42_Abstrakcyjne_klasy_i_metody.dzidziczenie.potwory;

public abstract class Potwor { //nie moge tworzyc obiektow klasy abstrakcyjnek
    public double predkoscChodzenia;
    public double zywotnosc;

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

    void atakuj(){
        System.out.println("to jest metoda atakuj klasy Potwor");
    }
    protected void atakuj2(){
        System.out.println("to jest metoda atakuj2 klasy Potwor");
    }

    protected abstract void opis(); //WYMÓG w klasach dziedziczących

    protected abstract void opis2();
}
