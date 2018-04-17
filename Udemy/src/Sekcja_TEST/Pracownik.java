package Sekcja_TEST;

public class Pracownik {
    String imie;
    Adres adres;
    Pracownik(String imie, Adres adres){
        this.adres = adres;
        this.imie = imie;
    }
    public String toString(){
        return this.imie + " " + adres.ulica + " " + adres.numerDomu;
    }
}
