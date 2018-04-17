package Kolekcje_ude;

import java.util.Objects;

class Element{
    int wartosc;
    String napis;
    public Element(int wartosc, String napis){
        this.wartosc = wartosc;
        this.napis = napis;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return wartosc == element.wartosc &&
                Objects.equals(napis, element.napis);
    }

    @Override
    public int hashCode() {

        return Objects.hash(wartosc, napis);
    }
}

public class HashCode {
    public static void main(String[] args) {
        Element a = new Element(5, "costam");
        Element b = new Element(5, "costamx");

        System.out.println("-----1-------");
        System.out.println(a == b); // wypisze false, sprzwdza adresy
        //gdybym dal Element b = a pokazaloby true bo tem sam adres

        System.out.println("-----2-------");
        System.out.println(a.equals(b)); //musze stworzyc deklaracje metody w klasie obiektow

        System.out.println("-----3-------");
        //hashcode ma unikalna wartosc
        //np a.hashCode() =/= b.hashCode() i nalezy to zmienic w meodzie klasy obiektow
        //po stworzeniu metody sa juz rowne
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



    }
}
