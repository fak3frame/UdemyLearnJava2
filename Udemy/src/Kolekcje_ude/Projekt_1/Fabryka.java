package Kolekcje_ude.Projekt_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Fabryka {
    public static void main(String[] args) {

        /*---KOLOKCJE---
        Collection -> List/Set(zbior)/Queue(kolejka)

        Lista ma polaczone elementy jeden po drugim, kolejnosc ma znacznie,
         latwy dostep, wolne przy dodawniu elem. moga zweierac kilka razy
         ten sam obiekt
         dzielimy je na ArrayList i LinkedList
         ArrayList implementacja tablicowa, uzywane gdy chcemy miec latwy dostep do elem.
          warto zadeklawac rozmiar przy tworzniu
          Operacje: add(obj),remove(obj),remove(int), size(), get(int)
         LinkedList implementacja wiązana, dobra do usuwania/dodawania elem.

        Zbior(Set) elementy nie powtarzaja sie, latwe dodawanie, kolejnosc nie ma znaczenia
         aby sprawdzic czy element jest juz w zbiorze mozna uzyc metody hashCode oraz equals
         zbiory dzilimy na HashSet, TreeSet oraz LinkedHashSet
         HashSet - podstawowa, zapewnia unikalnosc elem, nie mamay gwarancji kolejnosci,
          wewnetrznie wykorzystywana jest tablica mieszajaca przez co konieszna jest poprawna
          implementacja metod hashCode() oraz equals()
         TreeSet gwarantuje nam uporządkowanie wstawianych elementów zgodnie z naturalnym porządkiem,
          ktory jest wyznaczany jest poprzez implementację interfejsu Comparable lub zastosowanie
          odpowiedniego Comparatora
         LinkedHashSet posiada tablicę mieszającą jak i dodatkową listę podwójnie wiązaną, dzięki czemu
          oprócz unikalności elementów zagwarantowana jest także kolejność elementów zgodna z tą w
          jakiej były one dodawane

        Map <V,K> - nie rozszerza kolekcji, sluzy do laczneia kolekcji
        */

        System.out.println("---KOLEKCJE---");
        System.out.println();
        System.out.println("-Listy-");
        List<String> listaStringow1 = new ArrayList<>(3);
        //deklaruje list->arrayList aby moc zmienic listeStringow1 na np. LinkedList
        listaStringow1.add("costam1");
        listaStringow1.add(new String("costam2"));
        listaStringow1.add("costam2");
        String elem1 = listaStringow1.get(0);

        ArrayList<String> listaStringow2 = new ArrayList<>();

        System.out.println("---1---");
        System.out.println(listaStringow1.contains("costam1"));
        //zwraca flage czy lista zawiera podany element

        listaStringow2.addAll(listaStringow1); //kopiuje liste1 do listy2

        System.out.println("---2---");
        System.out.println(listaStringow2.isEmpty());
        //zwraca flage czy lista jest pusta

        System.out.println("---3---");
        for (String x : listaStringow2){
            System.out.println(x);
        }

        System.out.println("---4---");
        System.out.println(listaStringow2.size());
        //zwraca ilosc elementow w liscie

        System.out.println("---5---");
        System.out.println(listaStringow1.indexOf("costam1"));
        //zwraca pozycje elementu

        System.out.println("---6---");
        System.out.println(listaStringow1.lastIndexOf("costam2"));
        //zwraca pozycje ostatniego wystapienia podanego elementu

        System.out.println("---7---");
        System.out.println(listaStringow2.get(0));
        //zwraca element o podanym indeksie

        //---------------------------------------------------------------
        System.out.println();
        System.out.println("-Zbiory-");
        Set<String> names = new TreeSet<>();
        names.add("Kasia");
        names.add("Ania");
        names.add("Ania");
        names.add("Wojtek");
        names.add("Zuza");
        names.add("Zuza");
        int setSize = names.size();

        System.out.println("---1---");
        System.out.println("Number of names: " + setSize);
        //usunie powtarzajace sie

        System.out.println("---2---");
        boolean isThereAnia = names.contains("Ania");
        //sprawdzam czy w zbiorze jest podany obiekt
        System.out.println("Is Ania in this set? " + isThereAnia);

        System.out.println("---3---");
        for(String name: names) {
            System.out.println(name);
        }


    }
}
class zmienneGeneryczna <ZG1, ZG2>{
    //insatncja klasy posiada 2 zmienne generyczne mogace przyjac dowolny typ
    ZG1 zmiennaGeneryczna1;
    ZG2 zmiennaGeneryczna2;
    public void nadajWartoscZmiennymGenerycznym(ZG1 zg1, ZG2 zg2){
        this.zmiennaGeneryczna1 = zg1;
        this.zmiennaGeneryczna2 = zg2;
    }
    public ZG1 zwrocZmiennaGeneryczna1(){
        return zmiennaGeneryczna1;
    }
    public ZG2 zwrocZmiennaGeneryczna2(){
        return zmiennaGeneryczna2;
    }

}
