package Sekacja_9._42_Abstrakcyjne_klasy_i_metody.dziedzicznie;


import Sekacja_9._42_Abstrakcyjne_klasy_i_metody.dzidziczenie.potwory.Potwor;
import Sekacja_9._42_Abstrakcyjne_klasy_i_metody.dzidziczenie.potwory.Szkielet;

public class Dziedziczenie {
    public static void main(String[] args) {
        //Potwor p = new Potwor(); //nie jestem w stanie stworzyc instancji klady abstakcyjnej

        //ale mozemy za to uzyc tego jako szablonu
        Potwor p1 = new Szkielet();

        //abstrakcyjne metody w klasie bazowej sa WYMOGIEM implementacji w klasach dziedzieczacych
        //abstrakcyjna metoda nie moze miec ciala funkcji
        //metody abstrakcyjne uzywane sa tylko w klasach abstrakcyjnych
    }
}
