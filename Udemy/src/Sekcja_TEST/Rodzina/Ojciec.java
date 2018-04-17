package Sekcja_TEST.Rodzina;

public class Ojciec {

    private int wiek; //hermetyzacja/enkapsulacja - dostep do pol tylko z wnetrza klasy(private) albo za pomoca seterow i geterow
    //brak modyfikatora - dostepny tylko w paczce
    //public - dosteone wszedzie, mozna importowac w innej paczce, aby importowac metode/pole nalezy dodac-
    // import paczka.plik; klasa musi byc publiczna oraz pole/metoda importowanej klasu
    private String imie;
    private int id;
    private static int nextId; //istnieje bez wzgledu na tworznie obiektow, podczas zwiekszania kolejny obiekt
    // bedzie mial nowa wartosc

    public Ojciec(){
        System.out.println("konstruktor domyslny klasy ojciec");
    }
    public Ojciec(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
        nextId++;
        id = nextId; //id - pole unikalne dla kazdego obiektu
        System.out.println("konstruktor ojca");
    }

    protected int getWiek() {
        return wiek;
    }
    protected String getImie() {
        return imie;
    }
    protected int getId(){
        return id;
    }
    protected String getKolorWlosow() {
        return null;
    }
    protected void setWiek(int wiek){
        this.wiek = wiek;
    }
    public void setImie(String imie){ //dalem public dla testow
        this.imie = imie;
    }

    public void mow(){
        System.out.println("ojciec mowi");
    }

    public static void dajDaneObiektu(Ojciec o){//o przyjmuje kopie adresu dziecka (typ ojciec) ktory zostal wyslany
        System.out.println("wiek: " + o.getWiek());
        System.out.println("imie: " + o.getImie());
        System.out.println("id: " + o.getId());
        System.out.println("kolor wlosow: " + o.getKolorWlosow());
        System.out.println();
    }

    public String toString(){
        return null;
    }

}
