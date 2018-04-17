package Sekacja_9._39_Dziedziczenie.dziedziczenie2;

import Sekacja_9._39_Dziedziczenie.dziedziczenie.potwory.Potwor;
import Sekacja_9._39_Dziedziczenie.dziedziczenie.potwory.Szkielet;
import Sekacja_9._39_Dziedziczenie.dziedziczenie.potwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {
        //Potwor -> zombie, szkielet
        //Potwor -> super klasa / rodzic / bazowa / nadrzedna
        //Zombie/szkielet -> subklasa / dzieci / klasa pochodna / potomna

        Potwor p = new Potwor(10,100);
        System.out.println("predkoscChodznia Potwora: "+p.predkoscChodzenia);
        System.out.println("zywotnosc Potwora: "+p.predkoscChodzenia);
        System.out.println("////");
        Szkielet s = new Szkielet(20,50, "Luk"); //Najpier wywola konstruktor klasu nadrzednej a potem podklasy
        System.out.println("predkoscChodzenia szkieleta: "+s.predkoscChodzenia);
        System.out.println("zywotnosc szkieleta: "+s.zywotnosc);
        System.out.println("typBroni szkieleta: "+s.typBroni);

        System.out.println("////");
        Zombie z = new Zombie(10,80, 200);
        System.out.println("predkoscChodzenia Zombie: "+z.predkoscChodzenia);
        System.out.println("zywotnosc Zombie: "+z.predkoscChodzenia);
        System.out.println("sila Zombie: "+z.sila);

    }
}
