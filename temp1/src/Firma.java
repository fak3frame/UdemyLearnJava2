public class Firma {
    public static void main (String[] args){
        String[] imiona = {"Adam", "Janusz", "Wieslaw"};
        String[] nazwiska = {"Nowak", "Cwikla", "Paleta"};
        int[] wiek = {30, 33, 40};
        Pracownik[] p = new Pracownik[3];

        for(int i=0; i<imiona.length; i++){
            p[i] = new Pracownik();
            p[i].imie = imiona[i];
            p[i].nazwisko = nazwiska[i];
            p[i].wiek = wiek[i];
            System.out.println("Pracownik "+i+":"+p[i].imie+", "+p[i].nazwisko+", "+p[i].wiek);
        }
    }
}
