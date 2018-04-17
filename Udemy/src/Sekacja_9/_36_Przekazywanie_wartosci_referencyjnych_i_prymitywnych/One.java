package Sekacja_9._36_Przekazywanie_wartosci_referencyjnych_i_prymitywnych;

public class One {
    public static void main(String[] args) {

        int a = 5;
        Test x = new Test();
        x.zmienWartosc(a);//wysylam wartosc 5
        System.out.println(a);
        a = x.zmienWartosc2(a);
        System.out.println(a);

        ////////////

        Foo foo = new Foo();

        x.zmienZawartosc(foo); //wysylam adres, zmienna refrerencyjna czyli obiekt
        System.out.println(foo.y);

    }
}

class Test{
    void zmienWartosc(int zm){//tworze zmienna tymczasowa, kopie
        zm += 2;
    }//zm przestaje istniec

    int zmienWartosc2(int zm){
        zm += 2;
        return zm;
    }

    void zmienZawartosc(Foo zm){ //zm przyjmuje kopie adresu foo ktory zostal wyslany
        //string to prymitywny
        zm.y = zm.y + 40;
    }
}

class Foo{
    int y = 20;
    String imie = "bogdan";
}