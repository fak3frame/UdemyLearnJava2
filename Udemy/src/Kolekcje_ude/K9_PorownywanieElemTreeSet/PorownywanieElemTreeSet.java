package Kolekcje_ude.K9_PorownywanieElemTreeSet;

import java.util.*;

class Element3 implements Comparable{
    int wartosc;
    String opis;
    public Element3(int wartosc){
        this.wartosc = wartosc;
    }

    public Element3(int wartosc, String opis){
        this(wartosc);
        this.opis = opis;
    }

    public String pobierzOpis(){
        return opis;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this.getClass() != obj.getClass() || obj == null) return false;
        return this.wartosc == ((Element3)obj).wartosc;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wartosc);
    }

    @Override
    public int compareTo(Object o) {
        return wartosc - ((Element3)o).wartosc;
    }
}

public class PorownywanieElemTreeSet {
    public static void main(String[] args) {

        //Tworze treeSet ktory automatycznie sortuje elementy na podstawie typu
        // klasy. w tej klasie uzywa deklaracji metody compareTo do sortownia
        // (klasa musi rozszerzac interface Comprarable)

        //HashSet nie sortuje

        Set<Element3> set = new TreeSet<Element3>(new Comparator<Element3>() {
            @Override
            public int compare(Element3 o1, Element3 o2) {
                String opisO1 = o1.pobierzOpis();//przypisuje wartosci z obiektow do zmiennych tmp.
                String opisO2 = o2.pobierzOpis();
                return opisO1.compareTo(opisO2);//wywoluje gotowa metode dla Stringow
            }
        });

        //Wykorzystalem sortowanie za pomoca klasy anonimowej w ktorej deklaruje sortowanie
        //wybralem sortowanie za pomoca drugiej wartosci String i POMINIE sortowanie
        // za pomoca metody compareTo z klasy Element3

        set.add(new Element3(534236467, "opis"));
        set.add(new Element3(6334, "aopis"));
        set.add(new Element3(523623, "zopis"));

        Iterator<Element3> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().wartosc);
        }

        System.out.println("--------2-------");
        System.out.println("wielkosc zbioru: " + set.size());





    }
}
