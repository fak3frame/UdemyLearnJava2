package Sekcja_6._17_Instrukcje_warunkowe_switch;

public class One {
    public static void main(String[] args) {
        /*
            Switch (przełącznik)

         */
        int a = 50;
        switch (a){
            case 50:
                System.out.println("50");
                break;
            case 100:
                System.out.println("100");
                break;
            default:
                System.out.println("inne");
                break;
        }
    }
}
