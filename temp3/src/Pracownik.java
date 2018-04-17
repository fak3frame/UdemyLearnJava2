public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
    public Pracownik(){
        imie = "brak";
        nazwisko = "brak";
        wiek = 0;
    }
    public Pracownik(String i){
        imie = i;
        nazwisko = "brak";
        wiek = 0;
    }
    public Pracownik(String i, String n, int w){
        imie = i;
        nazwisko = n;
        wiek = w;
    }
    public Pracownik(Pracownik p){
        imie = p.imie;
        nazwisko = p.nazwisko;
        wiek = p.wiek;
    }
}
