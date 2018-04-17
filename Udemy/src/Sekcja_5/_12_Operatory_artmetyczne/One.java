package Sekcja_5._12_Operatory_artmetyczne;

public class One {
    public static void main(String[] args) {
        /*

         */
        int a = 5;
        a = a+2; //a+=2;

        int b = 1 % 3; //1 bo pokazuje sama reszte (1/3 = 1/3)
        int x = 4%3; //=1
        System.out.println(x);
        //Przydatne jesli np chcemy w instrukcji warunkwej wykonac cos co konkretna liczbe, w tym przypadku co 3
        // b++
        // if(b%3=0)

        int c = 5;
        c++;
        System.out.println(c);
        int d = 6;
        System.out.println(d++);//post inkrementacja, pokaze 6
        int e = 7;
        System.out.println(++e);//preinkrementacja pokaze 8

    }
}
