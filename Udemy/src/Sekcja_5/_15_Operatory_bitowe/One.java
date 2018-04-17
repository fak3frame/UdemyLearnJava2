package Sekcja_5._15_Operatory_bitowe;

public class One {
    public static void main(String[] args) {
        /*
            int a = 5;
            000000000000000000000101;

            zamiana systemu 2-10
            1 1 1 1
            8 4 1 1 = SUMA = 15
            2^3 2^2 2^1 2^0

            0 1 0 1 1
            0 8 0 2 1 = K11_LinkedHashMapLinkedHashSet

            0 - flase 1 - ture

            Operatory bitowe
            & - iloczyn bitowy
            | - suma bitowa
            ^ - XOR eXclusive OR
            x << 1 - przesuniecie w lewo o 1
            x >> 2 - przesuniecie w prawo 0 2

            ~negacja bitowa

            do wykorzystania do prawnien np. na forum

            0 0 0 1 moze pisac post
            0 0 1 0 moze edytowac post
            0 1 0 0 moze usuwac post
            1 0 0 0 moze banowac

            1 1 1 0 //14

         */

        //iloczyn
        System.out.println(14&1); // czy uzytkownik o uprawnieniach 14 moze wykonac 1

        /* suma bitowa
            dziala jak dodawania z alternatywa

            1 0 1 1 / K11_LinkedHashMapLinkedHashSet
            0 1 0 0 / 4
            --------
            1 1 1 1 / 15
         */
        System.out.println(11|4);

        /*
            XOR - to albo to
            0 0 = 0
            0 1 = 1
            1 0 = 1
            1 1 = 0

            1 1 0 //6
            0 1 0 //2
            ------
            1 0 0 //4
        */
        System.out.println(6^2);

        /* Przesuniecie
            0 1 0 1 0 //10 >> 1 //przesuniecie o 1
            0 0 1 0 1 //5

            0 1 0 1 0 //10 >> 2
            0 0 0 1 0 //2
         */
        System.out.println(10>>1);

        /* Negacja
            1 0 1 0
         */


    }
}
