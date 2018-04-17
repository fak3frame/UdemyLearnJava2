package Sekacja_9._28_Konstruktory;

public class One {
    public static void main(String[] args) {

        Punkt pTEST; //rezerwuje miejsce dla obiektu pTEST ale niw wywoluje konstruktora
        pTEST = new Punkt(); // wywolanie konstruktora
        Punkt p = new Punkt(); //tworze obiekt i rezerwuje dla niego pamiec
        Punkt p2 = new Punkt(10, 15);


        //nie powinno sie tak przesylac wartosci
        p.x = 10;
        p.y = 15;

        System.out.println("p.x = "+p.x);
        System.out.println("p.y = "+p.y);

        System.out.println();

        System.out.println("p2.x = "+p2.x);
        System.out.println("p2.x = "+p2.y);
    }
}

class Punkt{
    Punkt(){ //kontruktor domyslny bezparametrowy
        System.out.println("Wywolano konstruktor domyslny");
    }
    Punkt(int pierwszy, int drugi){
        x = pierwszy;
        y = drugi;
        System.out.println("wywolano konstruktor 2 param.");
    }
    int x;
    int y;
}
