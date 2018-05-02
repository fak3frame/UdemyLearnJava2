package Kolekcje_ude.K1_Kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Kolekcje {
    public static void main(String[] args) {
        //kolekcja jest to pojemnik do przechowywyania czegokolwiek
        Collection a;
        ArrayList b;
        /*
        Arraylist rozszerza kolekcje
        wszystkie elementy sa ustalone w kolejnosci, jest jeden po drugim
        sa polaczone wiezia, kazdy element ma adres
        FF12    FF13    FF14
        get(0)  get(1)  get(2)
        */
        ArrayList mojaLista = new ArrayList(); //tworze liste bez okreslenia typu
        // przez co moge dodac wszystko
        mojaLista.add("soc");
        mojaLista.add("soc2");
        mojaLista.add(2);
        mojaLista.add(new String("napis"));
        mojaLista.add(0,15); //przesunie elementy
        mojaLista.add(new Integer(10));
        System.out.println("------1--------");
        System.out.println(mojaLista); //wypisze elem. w []

        System.out.println("------2--------");
        System.out.println(mojaLista.get(0));

        System.out.println("------3--------");
        for (int i = 0; i < mojaLista.size(); i++){
            System.out.println(i+" : "+mojaLista.get(i));
        }


        ArrayList <String> mojaListaString = new ArrayList<>(3);
        //okrslam wstepne pojemnosc 3, jesli dodam 4 element, lista zostanie przeprojektowana
        // na nowo - opracja ta wymaga czasu

        System.out.println("------4--------");
        System.out.println(mojaListaString.size()); //metoda pokazuje ilosc wypelnionych elem
        //aktulnie 0

        //mojaListaString.add(2);//blad - zly typ
        mojaListaString.add("costam");
        //mojaListaString.add(new Integer(20)); //blad - zly typ
        mojaListaString.add("napis1");
        mojaListaString.add("napis2");
        mojaListaString.add(new String("napis3"));

        System.out.println("------5--------");
        System.out.println(mojaListaString.size());

        System.out.println("------6--------");
        int i = 0;
        for(String x : mojaListaString){
            System.out.println(i + " : " + x);
            i++;
        }


        /*
        ----------------------
        Zbiór jest grupa w ktorej nie jest ustalona kolejnosc
        A = {1,1,1,1}
        B = {1}
        A = B nie interesuje mnie kolejnosc i czy sie powtarza

        A = {2,4,6}
        B = {4,2,6}
        A = B
        ---------------
        Mapa sluzy do laczenia 2 wartosci np z elem. z 1 kolekcji do elementu z 2 kolekcji
        KEY = VALUE
        lista wartosci - zbior
        ID 1 - "kamil"
        ID 2 - "tomek"
        */
        Map c;
    }
}
