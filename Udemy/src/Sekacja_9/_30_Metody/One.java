package Sekacja_9._30_Metody;

public class One {
    public static void main(String[] args) {
        /*
            Metoda/funkcja - zespół zadań
            Wszytkie funkcje wewnatrz klas to metody dlatego
            w javie nie ma funkcji, sa tylko metody
         */
        Test a = new Test();
        a.wypisz();
        a.wypisz2("Kamil");
        int wynik = a.dodaj(10,20);
        System.out.println(wynik);
        System.out.println(a.dzielenie(10,0));
        System.out.println(a.dzielenie(10,2));
    }
}

class Test{
    void wypisz(){ // motoda powinna miec nazwę samoopisująca
        System.out.println("TEST");
    }
    void wypisz2(String imie){
        System.out.println(imie);
    }

    int dodaj(int a, int b){
        return a+b;
    }
    double dzielenie(double a, double b){
        if(b == 0){
            System.out.println("dzielisz przez 0!");
            return 0; // wychodzi z metody
        }
        return a/b;
    }
}
