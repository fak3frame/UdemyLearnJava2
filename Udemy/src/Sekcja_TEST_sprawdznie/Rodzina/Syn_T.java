package Sekcja_TEST_sprawdznie.Rodzina;

public class Syn_T extends Ojciec_T{
    private String samochody;

    public Syn_T(){
        System.out.println("konstr dom syn");
    }
    public Syn_T(String imie, int wiek, String samochody){
        super(imie, wiek);
        this.samochody = samochody;
        System.out.println("konstr niedom syn");
    }
    public void bawSie(){
        System.out.println("Syn sie bawi");
    }

    public void setSamochody(String samochody) {
        this.samochody = samochody;
    }
    public String getSamochody() {
        return samochody;
    }

    @Override
    public String toString() {
        return "toString syna: "+ getSamochody() + ". " + super.toString();
    }
}
