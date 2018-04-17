package Sekcja_TEST_sprawdznie.Rodzina;

public class Corka_T extends Ojciec_T{
    private String lalki;

    public Corka_T(){
        System.out.println("konstr dom Corka");
    }
    public Corka_T(String imie, int wiek, String lalki){
        super(imie, wiek);
        this.lalki = lalki;
        System.out.println("konstr niedom corka");
    }
    public void bawSie(){
        System.out.println("Corka sie bawi");
    }

    public void setLalki(String lalki) {
        this.lalki = lalki;
    }
    public String getLalki() {
        return lalki;
    }
}
