package Sekcja_TEST_sprawdznie.Rodzina;

public abstract class Ojciec_T {
    private String imie;
    private int wiek;
    private int id;
    private static int nextId;

    public Ojciec_T(){
        System.out.println("konstr dom ojciec");
    }
    public Ojciec_T(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
        id = nextId;
        nextId++;
        System.out.println("konstr niedom ojciec");
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }
    public int getWiek() {
        return wiek;
    }
    public String getImie() {
        return imie;
    }
    public int getId() {
        return id;
    }

    public abstract void bawSie();

    public static void dajObiekt(Ojciec_T []obj){
        for (Ojciec_T x : obj){
            if(x instanceof Syn_T){
                System.out.println("Obiekt numer: "+x.id);
                System.out.println(x.imie);
                System.out.println(x.wiek);
                System.out.println(((Syn_T) x).getSamochody());
            }
            else if(x instanceof Corka_T){
                System.out.println("Obiekt numer: "+x.id);
                System.out.println(x.imie);
                System.out.println(x.wiek);
                System.out.println(((Corka_T) x).getLalki());
            }
            else{
                System.out.println("mam pusty obiekt o numerze tab: " + nextId);
                nextId++;
            }
        }
    }

    @Override
    public String toString() {
        return "toString ojca: " + imie + " " + wiek;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            System.out.println("obiekt wyslany pusty");
            return false;
        }
        if(this == obj){
            System.out.println("obiekty sa takie same");
            return true;
        }
        if(this.getClass() != obj.getClass()){
            System.out.println("obiekty innych klas");
            System.out.println(this.getClass() + " oraz " + obj.getClass());
            return false;
        }
        else {
            System.out.println("rowny wiek");
            return this.wiek == ((Ojciec_T) obj).getWiek();
        }
    }
}
