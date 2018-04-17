package Sekcja_4._10_Jak_poprawnie_nazywac_zmienne;

public class One {
    public static void main(String[] args) {
        //wielkosc liter ma znacznie
        //zmienne powinny byc zaczynane mala litera
        //nie wolno zaczynac nazwy zmiennej od liczby
        //jesli tworzysz zmienne finalne piszesz duza litera i mozna space zastapic _

        String imie = "Kamil";
        String nazwisko = "Zajac";

        String daneOsobowe = imie + " " + nazwisko;
        System.out.println(daneOsobowe);
    }
}
