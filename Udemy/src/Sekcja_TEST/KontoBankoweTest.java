package Sekcja_TEST;

public class KontoBankoweTest {
    private double stanKonta;
    KontoBankoweTest(double stanKonta){
        this.stanKonta= stanKonta;
    }
    double getStanKonta(){
        return this.stanKonta;
    }
    void utworzKonto(final double stopa){
        class Odsetki{
            private double stopaProcentowa;
            Odsetki(double stopaProcentowa){
                this.stopaProcentowa = stopaProcentowa;
                liczOdsetki();
            }
            void liczOdsetki(){
                double odsetki = stanKonta * stopa / 100;
                stanKonta+= odsetki;
                System.out.println(stanKonta);
            }
        }
        Odsetki odsetki = new Odsetki(stopa);
    }
}
