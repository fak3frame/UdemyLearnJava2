package Sekcaj_8._25_Instrukcja_break_i_continue;

public class One {
    public static void main(String[] args) {

        //Continue - przerwij iteracje petli i przejdz na następnej
        //Break - wychodze calkowicie z pętli

        for(int i = 0; i < 10; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        //Czy jest 69 w tabeli?

        int[] team = {
                4,
                29,
                16,
                74,
                69,
                35
        };
        for(int myValue : team){
            if(myValue == 69){
                System.out.println("A idz pan w ch");
                break;
            }
            System.out.println(myValue);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //Tabliczka mnożenia przez nieparzyste liczby
        for (int i = 1; i <= 10; i ++){
            if(i % 2 == 0){
                continue;
            }
            for (int j = 1; j <= 10; j ++){
                if(j % 2 == 0){
                    continue;
                }
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
