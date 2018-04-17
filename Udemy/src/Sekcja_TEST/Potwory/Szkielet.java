package Sekcja_TEST.Potwory;

import Sekcja_TEST.Baza_potwory.Potwor;

public class Szkielet extends Potwor {

    private int szybkosc;

    public Szkielet(){
        System.out.println("konstruktor domyslny klasy Szkielet");
    }
    public Szkielet(int szybkosc, int hp){
        super(hp);
        this.szybkosc = szybkosc;
    }

    public void setSzybkosc(int szybkosc) {
        this.szybkosc = szybkosc;
    }
    public int getSzybkosc(){
        return szybkosc;
    }

    public void atakuj(){
        System.out.println("Szkielet atakuje");
        System.out.println("jego zycie to: "+getHp());
        System.out.println("jego szybkosc to: "+getSzybkosc());
    }
    public void strzelaj(){//metoda tylko u dziecka(podklasie)
        System.out.println("szkielet strzela");
    }

    @Override
    public String toString(){
        return super.toString() + " szybkosc: " + this.szybkosc;
    }
}
