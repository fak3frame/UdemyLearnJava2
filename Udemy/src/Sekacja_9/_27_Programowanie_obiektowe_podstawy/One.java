package Sekacja_9._27_Programowanie_obiektowe_podstawy;

public class One {

    void test(){
        System.out.println("metoda");
    }

    static void testStatic(){
        System.out.println("metoda");
    }

    public static void main(String[] args) {
        /*
            Obiekty - to pojemniki do przechowywania zmiennych i funkcji tematycznie
            ze sobą powiązanych do dalszego łatwiejszego ponownego użycia
            Klasy - foremki do tworzenia egzemplarzy obiektów

            Do opisania obiektu:
            Properties - właściwości/pola

            Metody - funkcje (np dla monitora - obiektu, może byc to właczenie, wyświetlenie)

            Jesli tworze obiekt jakiejs klasy to moge odwolywac sie tylko do jej metod
         */

        //test(); // nie zadziala bo z metody statycznej nie moge odwolac sie metody niestatycznej
        testStatic();

        Monitor abc = new Monitor();
        abc.szerokosc = 123;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 124;

        System.out.println(abc.szerokosc);
        System.out.println(abc2.szerokosc);

        abc.wlacz();
        abc.wylacz();



    }
}

class Monitor{
    int szerokosc;
    int wysokosc;

    void wlacz(){
        System.out.println("wlaczam monitor");
    }
    void wylacz(){
        System.out.println("wylaczam monitor");
    }
}
