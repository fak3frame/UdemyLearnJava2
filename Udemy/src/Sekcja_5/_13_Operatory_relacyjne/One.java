package Sekcja_5._13_Operatory_relacyjne;

public class One {
    public static void main(String[] args) {
        /*
            OPERATOR RELACYJNY (PORÓWNANIA)

            == - porównanie
            != - porówanie czy są różne od siebie

         */

        //zmienna boolean przechowuje tylko wartosc true albo false

        boolean isTrue = 4 == 4;
        System.out.println(isTrue);
        isTrue = 5 == 4;
        System.out.println(isTrue);

        if(4 == 8)
            System.out.println("Prawda ==");
        else
            System.out.println("Nieprawda ==");

        if(4!=5)
            System.out.println("Prawda !=");

        System.out.println("Czy 5 jest wieksze od 6??");
        System.out.println(5>7);
    }
}
