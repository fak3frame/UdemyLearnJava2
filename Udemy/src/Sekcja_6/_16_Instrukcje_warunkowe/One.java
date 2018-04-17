package Sekcja_6._16_Instrukcje_warunkowe;

public class One {
    public static void main(String[] args) {
        /*
            Instukcje warunkowe

            rozkaz czy cos prawdziwe albo fałszywe

            true/false

            if(wyrażenie) - jeśli prawdziwa
                instrukcja;
            else
                instrukcja
         */
        int a = 9;
        int b = 7;
        int c = 5;

        System.out.println(a == b);
        if(a == b)
            System.out.println("test");
        System.out.println(a != b);
        if(a != b)
            System.out.println("test");

        if(a > b)
            System.out.println("a>b");
        else if(a < b)
            System.out.println("a<b");
        else
            System.out.println("a=b");

        if(a<b || a>c)
            System.out.println("a<b lub a>c");
        if(a>b && a>c)
            System.out.println("a>b i a>c");



    }
}
