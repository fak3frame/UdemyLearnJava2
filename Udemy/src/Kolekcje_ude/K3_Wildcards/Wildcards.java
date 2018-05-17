package Kolekcje_ude.K3_Wildcards;

import java.util.ArrayList;

class SuperClass{
    //superklasa/klasa nadrzedna/ nadklasa

    public static void tester(ArrayList lista){
        //przyjmie wszystko (dowolne obiekty, zmienne String itp)
    }

    public static void tester2(ArrayList<Object> lista){
        //przyjmie tylko ArrayList z obiektami ale typu ogolnego (nie z konkretnych klas jak np
        // SubClass ktora nie jest powiazana z klasa Object
        //wymuszam przyjmowanie obiektow
    }

    public static void testerWildcards(ArrayList<?> lista){
        //przyjmie wszystko
    }

    public static void testerWIldcards2(ArrayList<? extends SuperClass> lista){
        //przyjmie tylko obiekty z rodziny SuperClass
    }
}

class SubClass extends SuperClass{
    //subklasa/klasa podrzedna/ podklasa
}

public class Wildcards {

    public static void main(String[] args) {
        //wildcards - znak wielozznacznosci
        //bounded wildcards - ograniczony znak wiloznacznosci

        ArrayList<String> listaStringow = new ArrayList<String>();
        //Podkladam za <E> String we wszystkich dekklaracjach/definicjach metod
        //czyli jest to lista Stringow
        //moge tez wpisac List<String> listaStringow = new List<String>();


        //-----------------------

        ArrayList<SuperClass> listaClass = new ArrayList<SuperClass>();
        //tworze liste w ktorej moge przechowywac tylko obiekty z rodziny SuperClass
        listaClass.add(new SuperClass());
        listaClass.add(new SubClass());//moge dodac takze podklase poniewaz dziedziczy

        SuperClass.tester(listaStringow); //zadziala bo przyjmuje liste dowolnego typu
        SuperClass.tester(listaClass);

        ArrayList<Object> o = new ArrayList();
        SuperClass.tester2(o);
        //SuperClass.tester2(listaStringow);//nie zadziala bo metoda przyjmuje tablice z obiektami
        //SuperClass.tester2(listaClass);
        //nie zadziala takze poniewaz lista listaClass nie jest powiazana z klasa Object (nie rozszerza jej)

        ArrayList<String> listaS = new ArrayList<String>();
        ArrayList<Object> listaO = new ArrayList<Object>();// - moge tutaj dodac wszystko (integer/string)

        SuperClass.testerWildcards(listaStringow); //przyjmuje wszystko
        SuperClass.testerWildcards(listaClass);
        SuperClass.testerWildcards(o);
        //zadzialaja obie bo metoda testerWildcards przyjmuje ArrayList dowolnego typu
        //z obiketami mojej klasy lub typu String/Integer lub klasy Object

        ArrayList<SubClass> listaSubClass = new ArrayList<SubClass>();

        SuperClass.testerWIldcards2(listaClass);
        SuperClass.testerWIldcards2(listaSubClass);
        //SuperClass.testerWIldcards2(listaStringow);
        //nie zadziala bo przyjmuje tylko elementy tablicy obiektow superklasy lub klas dziedziczacych
        //(ArrayList<? extends SuperClass> lista)

        //? - znak wieloznacznosci Wildcards
        //? extends jakasKlasa - znak wieloznacznosci ograniczony jakasKlasa - bounded Wildcards
    }
}
