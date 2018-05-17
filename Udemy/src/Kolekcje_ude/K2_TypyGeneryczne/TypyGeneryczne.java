package Kolekcje_ude.K2_TypyGeneryczne;

import java.util.ArrayList;

public class TypyGeneryczne {

    public static void main(String[] args) {
        //uogolnianie typow
//        ArrayList a = new ArrayList();// nie ustalilem typu wiec jest jako obiektowy
//        a.add(new String("lalala"));
//        a.add(new Integer(3));
//
//        for(int i = 0; i < a.size(); i++){
//            System.out.println((String)a.get(i));
                //bedzie blad poniewaz dodalem element Integer
//        }
        ArrayList<String> a = new ArrayList();// ustalilem typ jako String, w dokimentacji za <E> - elements
        // podstawielm String
        a.add("lalala");
        a.add(new String("dedede"));

        System.out.println("------1------");
        for(String string : a){
            System.out.println(string);
        }

        System.out.println("------2------");
        Zwykla<String,Integer> nazwaZmiennej = new Zwykla();
        //tworze instancje klasy z wybranymi typami generycznym (String oraz Integer)
        // musza byc 2 poniewaz tak deklaruje klasa
        nazwaZmiennej.nadajWartosc("cos");
        nazwaZmiennej.nadajWartoscObu("cos",12);
        System.out.println(nazwaZmiennej.zwroc());

        Zwykla inst = new Zwykla();
        //nie musze deklarowac typu generecznyego tworząc instancje tej klasy

    }
}
class Zwykla <COKOLWIEK,COKOLWIEK2>{
    //tworze klase z typem generycznym/uogolnionym
    //moze on przyjac dowolna zmienna obiektowa

    COKOLWIEK nazwaZmienejTypuCokolwiek;
    COKOLWIEK2 nazwaZmienejTypuCokolwiek2;

    public void nadajWartosc(COKOLWIEK wartosc){
        this.nazwaZmienejTypuCokolwiek = wartosc;
    }
    public void nadajWartoscObu(COKOLWIEK wartosc, COKOLWIEK2 wartosc2){
        nadajWartosc(wartosc);
        this.nazwaZmienejTypuCokolwiek2 = wartosc2;
    }

    public COKOLWIEK zwroc(){
        return this.nazwaZmienejTypuCokolwiek;
    }


}
