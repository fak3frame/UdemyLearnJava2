package Sekcja_4._11_Rzutowanie;

public class One {
    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 12, d = 15;

        System.out.println(a/(double)b);

        int wynik = a / b;
        double wynik2 = c / d;

        System.out.println(wynik);
        System.out.println(wynik2);

        int wynik3 = a / (int)d;
        double wynik4 = a / d; //poprawne bo wynik double
        System.out.println(1/5); //pokaze 0 bo nie dalem zmiennej double
        System.out.println(1.0/5); //pokaze poprawnie bo 1 zmienna jest double
    }
}
