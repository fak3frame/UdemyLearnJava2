public class Firma {
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[4];
        pracownicy[0] = new Pracownik();
        pracownicy[1] = new Pracownik("Adam");
        pracownicy[2] = new Pracownik("Wieslaw", "Paleta", 30);
        pracownicy[3] = new Pracownik(pracownicy[2]);
        for(int i=0; i<pracownicy.length; i++){
            System.out.println("Pracownik "+i+": "+pracownicy[i].imie+" "+pracownicy[i].nazwisko+" "+pracownicy[i].wiek);
        }
    }
}
