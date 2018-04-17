package Sekcja_6._18_Wyrażenia_warunkowe;

public class One {
    public static void main(String[] args) {
        /*


         */

        int x = 5;

        if(x%2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");

        //LUB

        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyParzysta);
    }
}
