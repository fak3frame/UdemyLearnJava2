package Sekcja_7._19_Tablice_jednowymiarowe;

public class One {
    public static void main(String[] args) {

        /*
            -------------
            tab[0] tab[1] tab[2] tab[3] tab[4]

            -------------
         */

        int[] tab;
        tab = new int[5];

        int[] tab2 = new int[5];

        tab[0] = 20;
        tab[1] = 21;
        tab[2] = 40;
        tab[3] = 34;
        tab[4] = 46;

        System.out.println(tab[0]);

        int[] tab3 = {4,2,5,7,2};
        System.out.println(tab3.length);
        System.out.println(tab3[tab3.length-1]); // ODWOLANIE DO OSTATNIEGO ELEM. TABLICY
    }
}
