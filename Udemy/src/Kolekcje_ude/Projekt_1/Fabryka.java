package Kolekcje_ude.Projekt_1;

public class Fabryka {
    public static void main(String[] args) {
        Pracownik p1 = new Zarobki<String,Integer>("Tomas", "dwa tysiace", 2000);
        Pracownik p2 = new Zarobki<Integer,String>("Pawel", 3000, "tzy tysiace");
        System.out.println(((Zarobki) p2).podajZarobki());
    }
}

class Zarobki <Zarobki1, Zarobki2> extends Pracownik{
    private Zarobki1 stawka1;
    private Zarobki2 stawka2;
    private int stawkaInt;

    public Zarobki(String i, Zarobki1 w1, Zarobki2 w2){
        super(i);
        this.stawka1 = w1;
        this.stawka2 = w2;
        if(stawka1 instanceof Integer){
            this.stawkaInt = (Integer)stawka1;
        }
        else
            this.stawkaInt = (Integer)stawka2;

    }
    public int podajZarobki(){
            return stawkaInt;
    }
}

class Pracownik{
    private String imie;

    public Pracownik(String i){
        this.imie = i;
    }
}
