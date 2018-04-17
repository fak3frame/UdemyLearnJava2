package Kolekcje_ude.K5_ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
/*
ArrayList - szybki dostep, elemnty sa jeden po drugim
Jesli ustale z gory pojemnosc i dodam o jeden wiecej bedzie musiala
usuanac wszystkie poprzednie i stworzyn nowa rezerwacje w pamieci na nowa
tablice o jeden element wiecej - jest to wolna Tablica przy dodawaniu lub usuwaniu elem.
Uzywamy jej jesli chcemy miec szybki dostep do elementow a nie dodawac i usuwac elem.

LinkedList - wolne pobieranie wartosc/przeszukiwanie
szybkie dodawanie lub usuwanie elementow
Jesli dodam jeden element to pierwszy bedzie wskazywal na 2
jesli dodam element miedzy nich to 1 bedzie wskazywal na nowy
a drugi na nowy (jesli mamy powiazanie wsteczne)

 */

class ListaPolaczona{
    int wartosc;
    ListaPolaczona nastepna;
    ListaPolaczona poprzedni;
}

public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList listaTablicowa = new ArrayList(6);
        listaTablicowa.add(new Object());
        LinkedList listaPolaczonaX;
        //obie sa kolekcajmi (pojemnikami)

        ListaPolaczona listaPolaczona = new ListaPolaczona();
        listaPolaczona.wartosc = 10;
        listaPolaczona.nastepna = new ListaPolaczona();
        listaPolaczona.nastepna.wartosc = 20;
        listaPolaczona.nastepna.nastepna = new ListaPolaczona();
        listaPolaczona.nastepna.nastepna.wartosc = 30;
        //kolejny obiekt polaczony jest z poprzenim

        //listaPolaczona.nastepna.nastepna.nastepna.nastepna.nastepna.wartosc = 90;
        //blad - nie ma polaczenia




        System.out.println(listaPolaczona.wartosc);
        System.out.println(listaPolaczona.nastepna.wartosc);
        System.out.println(listaPolaczona.nastepna.nastepna.wartosc);
        //System.out.println(listaPolaczona.nastepna.nastepna.nastepna.nastepna.nastepna.nastepna.wartosc);
    }
}
