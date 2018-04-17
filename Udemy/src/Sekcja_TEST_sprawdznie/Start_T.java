package Sekcja_TEST_sprawdznie;

import Sekcja_TEST_sprawdznie.Rodzina.Ojciec_T;
import Sekcja_TEST_sprawdznie.Rodzina.Corka_T;
import Sekcja_TEST_sprawdznie.Rodzina.Syn_T;

public class Start_T {
    public static void main(String[] args) {
        Ojciec_T[] tabD = new Ojciec_T[5];
        tabD[0] = new Syn_T("Tomek", 10, "audi");
        tabD[1] = new Corka_T("Agata", 9, "barbie");
        tabD[2] = new Syn_T("Pszemek", 10, "bmw");
        System.out.println();
        Ojciec_T.dajObiekt(tabD);
        System.out.println();
        System.out.println(tabD[0]);
        System.out.println("WARUNEK 1");
        if(tabD[0].equals(tabD[1])){
            System.out.println("rowne1");
        }
        System.out.println("WARUNEK 2");
        if(tabD[0].equals(tabD[2])){
            System.out.println("rowne2");
        }
        System.out.println("WARUNEK 3");
        if(tabD[2].equals(tabD[3])){

        }
        System.out.println("WARUNEK 4");
        if(tabD[0].equals(tabD[0])){
            System.out.println("rowne4");
        }

        System.out.println("WYSWIETLENIE OBIEKTU 1");
        System.out.println(tabD[0]);
    }
}
