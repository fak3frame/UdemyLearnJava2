package Sekacja_9._35_Referencja_vs_zmiana;

public class One {
    public static void main(String[] args) {

        // REFEENCJA PRZECHOWUJE ADRES
        //typ klasowy/referencyjny przechowuje adres


        int a = 53; //przypisuje jej wartosc

        Test x = new Test(); //pod x nie znajduje sie wartosc tylko adres
        //jest to zmienna referencyjna czyli odwoluje sie do adresu

        int b = a;
        b = 30;
        System.out.println(a);

        Test y = x; //wskazuje nowej instancji y adres instancji x przez co wszystkie zmiany
        //dokonane beda automatycznie na obu instancjach
        //nie tworze nowego miejsca w pamieci na kolejny obiekt (Test y = new Test();)
        //na tym polega roznica przypsania wartosci od referencji
        y.a = 40; //zmienam wartosc pola obiektu y
        System.out.println(x.a); //wartosc pola obiektu x takze zostala zmieniona

        ///////////////// INNE ZACHOWANIE STRINGA !

        String imie = "bogdan";
        String imie2 = imie; //automatycznie rezerwuje pamiec
        //String imie2 = new String(imie)

        imie2 = "dupa";

        System.out.println(imie2);

    }
}

class Test{
    int a = 20;
}
