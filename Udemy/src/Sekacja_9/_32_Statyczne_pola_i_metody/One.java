package Sekacja_9._32_Statyczne_pola_i_metody;

public class One {
    public static void main(String[] args) {
        /*
            aby nie tworzyc instancji klasy Matematyka moge uzyc statycznej metody
            wystarczy dodac nazwe klasy i po . nazwe metody
            statycznosc oznacza ze cos istnieje zawsze, dlatego nie mozemy sie odwolac
            do metody/pola niestatycznego i potrzebne nam sa do tego instacje
         */

        double wynik = Matematyka.dodaj(10,15.3);
        System.out.println(wynik);

        //tak samo z polami/wlasciwosciami klas

        System.out.println(Matematyka.PI);

        Klient a = new Klient("Arkadiusz");
        Klient b = new Klient("Kamil");
        Klient c = new Klient("Janusz");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);


    }
}

class Matematyka{

    static final double PI = 3.14;

    static double dodaj(double a, double b){
        return a+b;
    }
}

class Klient{
    String imie;
    int id = 0;
    static int nextId = 0; // potrzebne aby stworzyc numeracje obiektów
    //po tworzeniu nowego obiektu wszystkie pola sa ustawiana na wartosci domyslne za wyjatkiem pól statycznych
    Klient(String imie){
        this.imie = imie;
        nextId++;
        id = nextId;

    }
}
