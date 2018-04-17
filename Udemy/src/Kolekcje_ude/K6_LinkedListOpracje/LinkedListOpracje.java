package Kolekcje_ude.K6_LinkedListOpracje;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOpracje {
    public static void main(String[] args) {
        LinkedList<String> listaPowiazana = new LinkedList<String>();
        listaPowiazana.add("cos1");
        listaPowiazana.add("cos2");
        listaPowiazana.add("cos3");
        listaPowiazana.add("cos4");

        System.out.println("------1------");
        for (int i = 0; i < listaPowiazana.size(); i++){
            System.out.println(listaPowiazana.get(i));
            //przeszuka cala liste w poszukiwaniu kazdego elementu i
            //szukajac np i=2 czyli 3 elementu zaczyna szukanie od 0
            // przez co duzym - jest dostep do elementow w tym typie list (wolny)
            // ale latwo jest dodac elementy
        }

        System.out.println("------2------");
        System.out.println(listaPowiazana.get(2)); //bedzie szukac od 0 elementu wybranego elem.

        System.out.println("------3------");
        LinkedListOpracje.wypiszElementyListy(listaPowiazana);

        System.out.println("------4------");
        ListIterator<String> iter2 = listaPowiazana.listIterator((listaPowiazana.size()));//iterator bedzie na koncu
        //dzieki ListIterator mam nie tylko opcje next/remove ale i add oraz set
        while (iter2.hasPrevious()) {
            System.out.println(iter2.previous()); //wyswietlenie elem. od konca
        }
        System.out.println("------5------");
        Iterator<String> iter = listaPowiazana.iterator();
        iter.next();
        iter.remove(); //usunie POPRZEDNIKA !
        LinkedListOpracje.wypiszElementyListy(listaPowiazana);

    }
    //moge pomoc sobie pomoc metoda
    public static void wypiszElementyListy(LinkedList<?> lista){
        //wykorzystam iterator - urzadzneie ktore bedzie skakac pomiedzy elementami
        Iterator iteratorListy = lista.iterator(); //zapisuje do mojej zmiennej wartosc iteratora
        //lista.iterator() ta metoda zwroci nam iterator (standardowo jest to obiekt)
        //moge dac Iterator<String> iteratorListy wiec iterator bedzie stringiem
        //iterator na poczatku najduje sie przed 0 elementem
        while(iteratorListy.hasNext()) //zabezpiecznie przed koncem listy + wypisze kazdy element
            System.out.println(iteratorListy.next()); //zwroci najpierw 0 element
            //po wywolaniu metody .next() na iteratorze przeskoczy do kolejnej pozycji
    }
}
