package Kolekcje_ude;

import java.util.ArrayList;

public class TypyGeneryczne {

    public static void main(String[] args) {
        //uogolnianie typow
//        ArrayList a = new ArrayList();// nie istalilem typu wiec jest jako obiektowy
//        a.add(new String("lalala"));
//        a.add(new Integer(3));
//
//        for(int i = 0; i < a.size(); i++){
//            System.out.println((String)a.get(i));
//        }
        ArrayList<String> a = new ArrayList();// nie istalilem typu wiec jest jako obiektowy
        a.add(new String("lalala"));
        a.add(new String("dedede"));

        for(String string : a){
            System.out.println(string);
        }

        Zwykla<String> nazwaZmiennej = new Zwykla();
        nazwaZmiennej.nadajWartosc("cos");
        System.out.println(nazwaZmiennej.zwroc());

    }
}
class Zwykla <COKOLWIEK>{

    COKOLWIEK nazwaZmienejTypuCokolwiek;

    public void nadajWartosc(COKOLWIEK wartosc){
        this.nazwaZmienejTypuCokolwiek = wartosc;
    }
    public COKOLWIEK zwroc(){
        return this.nazwaZmienejTypuCokolwiek;
    }


}
