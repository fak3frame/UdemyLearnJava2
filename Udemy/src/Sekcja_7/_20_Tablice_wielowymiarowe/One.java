package Sekcja_7._20_Tablice_wielowymiarowe;

public class One {
    public static void main(String[] args) {
        /*
        ----------------------------------------
        tab[0][0] tab[0][1] tab[0][2] tab[0][3]
        ----------------------------------------
        tab[1][0] tab[1][1] tab[1][2] tab[1][3]
        ----------------------------------------
        tab[2][0] tab[2][1] tab[2][2] tab[2][3]
        ----------------------------------------
        tab[3][0] tab[3][1] tab[3][2] tab[3][3]
        -----------------------------------------
        */

        int[][] tab = new int [4][4];
        tab[0][0] = 25;
        tab[3][2] = 30;

        int[][] tab2 = {
                {4,5,6},
                {2,4,5},
                {3,6,1}
        };
        System.out.println(tab2[1][2]);
    }
}
