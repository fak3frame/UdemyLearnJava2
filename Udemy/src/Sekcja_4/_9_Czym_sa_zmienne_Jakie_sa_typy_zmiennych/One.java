package Sekcja_4._9_Czym_sa_zmienne_Jakie_sa_typy_zmiennych;

public class One {
    public static void main(String[] args) {
        //--9-- CZYM SĄ ZMIENNE? JAKIE SĄ TYPY ZMIENNYCH?

        //zmienne rezerwowane są w pamięci ram

        int a;
        int b = 10; //inicjalizacja wartości
        a = 15;
        String c = "tekst"; //typ obiektowy/klasowy
        String c2 = "tekst 2";
        long d = 20L;  //trzeba na koncu wpisac L;
        char e = 'X';

        System.out.println(c+" "+c2);
        System.out.println(a+b); // suma
        System.out.println(a+""+b);

        float f = 4.56f; //trzeba na koncu wpisac f;
        double g = 2.34;

        System.out.println(a+f); //wyswietli i przekonwertuje do ogolnego typu (double)

        /*
            Typy całkowite:
            byte - 8 bitów - od -128 do 127
            short - 16 bitów - od -32,768
            int - 32 bity - od -2^31
            long - 64 bity - od -2^63

            Znakowe;
            char - 2 bajtowy
            String - ciąg znaków

            Zmiennoprzecinkowe
            float - 32 bity
            double - 64 bity
         */
    }
}
