package Sekcja_TEST.Rodzina;

public class Dziecko extends Ojciec { //gdy dziedzicze, tworzac obiekt dziecka (niewane czy typu dziecka czy rodzica)-
    // zawsze wywola sie także konstruktor rodzica w pierwszej kolejnosci. Gdy jest w nim instrukcja super mozna wybrac-
    // za pomoca paramrtów który chcemy wywolac

    private String kolorWlosow;

    public Dziecko(){
        System.out.println("konstruktor domyslny klasy dziecko");
    }
    public Dziecko(String kolorWlosow){
        this.kolorWlosow = kolorWlosow;
    }
    public Dziecko(String imie, int wiek, String kolorWlosow){
        super(imie, wiek); //w konstruktorze metoda super musi byc na poczatku, w metodzie juz nie
        //bez niej wywola sie kontruktor domyslny ojca, dzieki instr. super moge wyslac dane do wybranego-
        // konstruktora rodzica aby mnie powtarzac instrukcji ustawinia danych podczas tworznia obiekotw
        this.kolorWlosow = kolorWlosow;
        System.out.println("konstruktor dziecka");
    }

    protected String getKolorWlosow() {
        return kolorWlosow;
    }

    public void mow(){
        System.out.println("dziecko mowi");
        super.mow();
    }
    public void mow2(){
        System.out.println("dziecko mowi2");
    }

}
