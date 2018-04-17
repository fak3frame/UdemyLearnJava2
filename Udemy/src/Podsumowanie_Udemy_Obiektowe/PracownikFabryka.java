package Podsumowanie_Udemy_Obiektowe;

import Podsumowanie_Udemy_Obiektowe.Firma.Adres;
import Podsumowanie_Udemy_Obiektowe.Firma.Pracownicy.Programista;
import Podsumowanie_Udemy_Obiektowe.Firma.Pracownicy.Sekretarka;
import Podsumowanie_Udemy_Obiektowe.Firma.Pracownik;
import Podsumowanie_Udemy_Obiektowe.Firma.ZlaKlasa;

import java.util.Arrays;

public class PracownikFabryka {
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[4];
        pracownicy[0] = new Programista("Adam", "Nowak", "etat",
                25, 2000, new Adres("Czarna", 20), 5);
        pracownicy[1] = new Programista("Paweł", "Burak", "etat",
                25, 2000, new Adres("Fioletowa", 23), 1);
        pracownicy[2] = new Programista("Rafał", "Wiosna", "staz",
                25, 2000, new Adres("Czerwona", 5), 12);
        pracownicy[3] = new Sekretarka("Tomek", "Cwikla", "staz",
                28, 1500, new Adres("Niebieska", 10), 2);
        System.out.println(pracownicy[0]);
        System.out.println();
        System.out.println(pracownicy[1]);
        System.out.println();
        try{
            pracownicy[0].pracuj(pracownicy[0], 1);
            pracownicy[1].pracuj(pracownicy[1], 5);
        }
        catch (ZlaKlasa ex){
            System.out.println("mam wyjatek");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println();
            System.out.println("Przepracowane godziny pracownika 1: "+((Programista)pracownicy[0]).getPrzepracowaneGodziny());
            System.out.println("Przepracowane godziny pracownika 2: "+((Programista)pracownicy[1]).getPrzepracowaneGodziny());
        }
        System.out.println();
        if(pracownicy[0].equals(pracownicy[1])){
            System.out.println("Tyle samo przepracowanych godzin u pracownika 1 i 2");
        }
        Arrays.sort(pracownicy);
        for (Pracownik x : pracownicy){
            if(x instanceof Programista)
                System.out.println(((Programista)x).getPrzepracowaneGodziny());
            else if(x instanceof Sekretarka)
                System.out.println(((Sekretarka)x).getPrzepracowaneGodziny());
        }
    }
}
