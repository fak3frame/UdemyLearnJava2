package Sekcja_5._14_Operatory_logiczne;

public class One {
    public static void main(String[] args) {

    /*
        Operatory logiczne

        true false

        ! - negacja

        !(true) - false
        !(false) - true

        && - koniunkcja - "I" - "w tym samym momencie" - wszystkie warunki sa spelnione
        || - alternatywa = "LUB" - chociaz jeden warunet jest spelniony


     */

        int a = 5,
            b = 7,
            c = 9;

        if(a==b)
            System.out.println("a = b");

        else if(!(a==b))
            System.out.println("a =/= b");

        if(a==b && a==c)
            System.out.println("a==b oraz a==c");
        else
            System.out.println("a=/=b oraz a=/=c");

        if(a == 6 || a == 5)
            System.out.println("a jest rowne 5 lub 6");



    }
}
