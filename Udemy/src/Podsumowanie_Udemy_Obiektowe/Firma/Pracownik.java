package Podsumowanie_Udemy_Obiektowe.Firma;

import Podsumowanie_Udemy_Obiektowe.Firma.Pracownicy.Programista;
import Podsumowanie_Udemy_Obiektowe.Firma.Pracownicy.Sekretarka;

public abstract class Pracownik implements Praca, Comparable {
    private String imie, nazwisko, stanowisko;
    private int wiek, zarobkiMiesieczne;
    private Adres adres;

    //Akcesory
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public int getWiek() {
        return wiek;
    }
    public int getZarobkiMiesieczne() {
        return zarobkiMiesieczne;
    }
    public Adres getAdres() {
        return adres;
    }
    //Mutatory
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void setZarobkiMiesieczne(int zarobkiMiesieczne) {
        this.zarobkiMiesieczne = zarobkiMiesieczne;
    }
    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    //konstruktor
    public Pracownik(String imie, String nazwisko, String stanowisko, int wiek, int zarobkiMiesieczne, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
        this.zarobkiMiesieczne = zarobkiMiesieczne;
        this.adres = adres;
    }

    @Override
    public void pracuj(Pracownik pracownik, int ilosc) throws ZlaKlasa {
        System.out.println(pracownik.getClass() + " pracuje " + ilosc + " h");
        if (pracownik instanceof Programista) {
            Programista p = (Programista) pracownik;
            p.setPrzepracowaneGodziny(p.getPrzepracowaneGodziny() + ilosc);
        } else if (pracownik instanceof Sekretarka) {
            Sekretarka s = (Sekretarka) pracownik;
            s.setPrzepracowaneGodziny(s.getPrzepracowaneGodziny() + ilosc);
        } else
            throw new ZlaKlasa("Zła klasa");
    }

    public abstract void wykonajZadanie();

    @Override
    public String toString() {
        return "Imie: " + this.imie + "\n" +
                "Nazwisko: " + this.nazwisko + "\n" +
                "Stanowisko: " + this.stanowisko + "\n" +
                "Wiek: " + this.nazwisko + "\n" +
                "Zarobki Miesieczne: " + this.zarobkiMiesieczne + "\n" +
                "Adres: " + adres.getUlica() + " " + adres.getNrDomu();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this == obj) {
            return true;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            return ((Programista) this).getPrzepracowaneGodziny() == ((Programista) obj).getPrzepracowaneGodziny();
        }
    }

    public int compareTo(Object o) {
        if (this instanceof Programista) {
            Programista tmp1 = (Programista) this;
            if (o instanceof Programista) {
                Programista tmp2 = (Programista) o;
                if (tmp1.getPrzepracowaneGodziny() > tmp2.getPrzepracowaneGodziny())
                    return 1;
                else if (tmp1.getPrzepracowaneGodziny() < tmp2.getPrzepracowaneGodziny())
                    return -1;
                else
                    return 0;
            }
            else if (o instanceof Sekretarka) {
                Sekretarka tmp2 = (Sekretarka) o;
                if (tmp1.getPrzepracowaneGodziny() > tmp2.getPrzepracowaneGodziny())
                    return 1;
                else if (tmp1.getPrzepracowaneGodziny() < tmp2.getPrzepracowaneGodziny())
                    return -1;
                else
                    return 0;
            }
        }
        else if (this instanceof Sekretarka) {
            Sekretarka tmp1 = (Sekretarka) this;
            if (o instanceof Programista) {
                Programista tmp2 = (Programista) o;
                if (tmp1.getPrzepracowaneGodziny() > tmp2.getPrzepracowaneGodziny())
                    return 1;
                else if (tmp1.getPrzepracowaneGodziny() < tmp2.getPrzepracowaneGodziny())
                    return -1;
                else
                    return 0;
            }
            else if (o instanceof Sekretarka) {
                Sekretarka tmp2 = (Sekretarka) o;
                if (tmp1.getPrzepracowaneGodziny() > tmp2.getPrzepracowaneGodziny())
                    return 1;
                else if (tmp1.getPrzepracowaneGodziny() < tmp2.getPrzepracowaneGodziny())
                    return -1;
                else
                    return 0;
            }
        }
        return 0;
    }

}
