package Sekcja_TEST;

public class KontoBankowe {
    private double stanKonta;

    public KontoBankowe(double stanKonta){
        this.stanKonta = stanKonta;
    }

    double getStanKonta(){
        return this.stanKonta;
    }

    void utworzKonto(final double stopa){ //zmienna "stopa" nie bedzie widoczna dla klasy zagniezdzonej chyba ze dam
        // ją jako final

        class Odsetki{
            private double stopaProcentowa;

            public Odsetki(double stopaProcentowa){
                this.stopaProcentowa = stopaProcentowa;
                this.zmienStanKonta();
            }

            void zmienStanKonta(){
                double odsetki = (stanKonta * stopa) / 100;
                stanKonta += odsetki;
            }
        }
        Odsetki odsetki = new Odsetki(stopa); //musi byc zadeklarowana najpierw klasa w kodzie

    }
}


