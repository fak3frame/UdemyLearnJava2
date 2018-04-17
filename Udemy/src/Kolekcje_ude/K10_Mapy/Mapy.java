package Kolekcje_ude;


import org.w3c.dom.events.Event;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/*
klucz - wartosc
klucz jest niepowtarzalny
klucz






 */
public class Mapy {
    public static void main(String[] args) {
        /*
        Map<Integer, String> mapa = new HashMap();//moze byc TreeMap dla uporzadkowanych

        Pracownik[] pracownicy = {
                new Pracownik("Tomek"),//1
                new Pracownik("Kamil"),//2
                new Pracownik("Janusz"),//3
                new Pracownik("Bogdan"),//4
                new Pracownik("Tomek"),//5
                new Pracownik("Kamil"),//6
                new Pracownik("Janusz"),//7
                new Pracownik("Bogdan"),//8
        };
        for(Pracownik pracownik : pracownicy){
            mapa.put(pracownik.getID(), pracownik.getImie());
        }
        mapa.remove(3);
        mapa.put(3,"Pawel");//uzupelni bo usunalem 3
        mapa.put(4,"bolek");//podmieni
        System.out.println(mapa);
        */

        System.out.println("------2----------");
        Map<Integer, Pracownik> mapa2 = new TreeMap(); //dzieki temu ze jako 2 parametr wykorzystalem klase
        // bede mogl wykorzystac w 1 elemencie mapy wiele wartosci jak imie,nazwisko
        // musze zdefiniowac toString
        Pracownik[] pracownicy2 = {
                new Pracownik("Andrzej"),//1
                new Pracownik("Pawel"),//2
                new Pracownik("Tomek"),//3
                new Pracownik("Kamil"),//4
                new Pracownik("Jakub"),//5

        };
        for(Pracownik pracownik : pracownicy2){
            mapa2.put(pracownik.getID(), pracownik);
        }
        mapa2.remove(3);
        mapa2.put(3,new Pracownik("Martyna"));//uzupelni bo usunalem 3
        mapa2.put(4,new Pracownik("Kinga"));//podmieni
        System.out.println(mapa2);

        System.out.println("------3----------");
        for(Map.Entry<Integer, Pracownik> wpis : mapa2.entrySet()){
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("imie pracownika: "+wpis.getValue().getImie());
        }

        System.out.println("------4----------");
        Map<Integer, Pracownik> subMapa = ((TreeMap<Integer, Pracownik>) mapa2).subMap(0,3);
        //podzbior ktory deklaruje zakres
        for(Map.Entry<Integer, Pracownik> wpis : subMapa.entrySet()){
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("imie pracownika: "+wpis.getValue().getImie());
        }

        System.out.println("------5----------");
        Map<Date, Event> exampleMap;

    }
}

class Pracownik{
    public Pracownik(){
        i++;
        ID = i;
    }
    public Pracownik(String imie){
        this();//wywoluje konstruktor wyzej
        this.imie = imie;
    }
    public int getID(){
        return ID;
    }
    public String getImie(){
        return imie;
    }

    @Override
    public String toString() {
        return imie;
    }

    String imie;
    private int ID;
    public static int i = 0;
}
