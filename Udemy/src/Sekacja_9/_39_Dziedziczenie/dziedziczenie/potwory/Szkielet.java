package Sekacja_9._39_Dziedziczenie.dziedziczenie.potwory;

public class Szkielet extends Potwor {

    public String typBroni;

    public Szkielet(){
        System.out.println("Domyslny konstruktor z klasy Szkielet");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc){ // gdybysmy nie chciali usawiwac broni
        super(predkoscChodzenia,zywotnosc);
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni){
        super(predkoscChodzenia, zywotnosc); //wywolanie takiej samej metody nadkasy ( w tym przypadku konstruktora)
        //oraz ustawinie wartosci unikalnej zmiennej dla szkieleta - typBroni

        //LUB zapisujac to powtarzajac zbedznie kod
        /*
        this.predkoscChodzenia = predkoscChodznia;
        this.zywotnosc = zywotnosc;
         */

        this.typBroni = typBroni;
        System.out.println("Niedomyslny konstruktor z klasy Szkielet");

    }
}
