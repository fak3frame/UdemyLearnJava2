package Podsumowanie_Udemy_Obiektowe.Firma.Pracownicy;

import Podsumowanie_Udemy_Obiektowe.Firma.Adres;
import Podsumowanie_Udemy_Obiektowe.Firma.Pracownik;

public class Programista extends Pracownik{
    private int przepracowaneGodziny;
    public Programista(String imie, String nazwisko, String stanowisko, int wiek, int zarobkiMiesieczne, Adres adres, int przepracowaneGodziny){
        super(imie, nazwisko, stanowisko, wiek, zarobkiMiesieczne, adres);
        this.przepracowaneGodziny = przepracowaneGodziny;
    }

    public int getPrzepracowaneGodziny() {
        return przepracowaneGodziny;
    }
    public void setPrzepracowaneGodziny(int przepracowaneGodziny) {
        this.przepracowaneGodziny = przepracowaneGodziny;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Przepracowane godziny: "  + this.przepracowaneGodziny;
    }

    public void wykonajZadanie(){

    }
}
