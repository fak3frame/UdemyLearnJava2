package Sekacja_9._40_Nadpisywanie_metod_oraz_polimorfizm.dziedziczenie;


import Sekacja_9._40_Nadpisywanie_metod_oraz_polimorfizm.dziedziecznie.potwory.Potwor;
import Sekacja_9._40_Nadpisywanie_metod_oraz_polimorfizm.dziedziecznie.potwory.Szkielet;
import Sekacja_9._40_Nadpisywanie_metod_oraz_polimorfizm.dziedziecznie.potwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {
        Potwor p = new Potwor();
        p.atakuj();
        System.out.println("1////");

        Szkielet s = new Szkielet();
        s.atakuj();//nadpisuje metode i wywoluje tylko z klasy dziecka, konstruktor wywolany zostanie z obu klas
        //mozna uzyc konstrukcji super aby wykonano DODATKOWO instukcje z tej samej metody klasy nadrzednej

        System.out.println("2////");

        Potwor p1 = new Szkielet(); //polimorfizm, wywola 2 konstruktory
        p1.atakuj2();
        //W tym przypadku wywola sie metoda atakuj klasy Szkielet poniwaz jest nadpisywana przez klase szkielet
        //standardowo wykonalaby sie ta z potwora ze wzgledu na typ obiektu

        System.out.println("3////");

        Potwor p2 = new Zombie(); //w polimorfizmie przy pomocy jednej nazwy jestesmy w stanie odwolac sie do wielu
    }

    //wykorzystanie polimorfizmu:

    void metoda(Potwor potwor){ // moge przeslac teraz i szkieleta i zmobie

    }
}
