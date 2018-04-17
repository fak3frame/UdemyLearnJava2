package Sekacja_9._40_Nadpisywanie_metod_oraz_polimorfizm.dziedziecznie.potwory;

public class Szkielet extends Potwor{
    String typBroni;

    public Szkielet(){
        System.out.println("Domyslny konstruktor klasy Szkielet");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni){
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
    }

    @Override
    public void atakuj() { //nadpisuje metode, konstruktor wywolany zostanie z obu klas
        System.out.println("to jest metoda atakuj klasy Szkielet");
        super.atakuj();
    }
    public void atakuj2(){
        System.out.println("to jest metoda atakuj2 klasy Szkielet");
    }
}
