package Sekacja_9._37_Porównywanie_stringów;

public class One {
    public static void main(String[] args) {

        String imie = "bogdan";
        String imie2 = "bogdan";

        //jesli wartosci sa takie same to bedzie przechowywal je w tym samym miejsc w pamieci

        if(imie == imie2){ // niezalecane, gdy dam new String("bogdan") nie zadziala
            System.out.println("sa rowne imiona");
        }

        String napis = new String("test");
        String napis2 = new String("test");

        if(napis == napis2){ //blad bo nowa rezerwacja w pamieci new
            System.out.println("sa rowne napisy 1");
        }

        if(napis.equals(napis2)){ // POPRAWNE
            System.out.println("sa rowne napisy 2");
        }
    }
}
