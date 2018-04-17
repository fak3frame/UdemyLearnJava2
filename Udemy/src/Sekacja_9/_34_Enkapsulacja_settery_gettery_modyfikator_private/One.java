package Sekacja_9._34_Enkapsulacja_settery_gettery_modyfikator_private;

public class One {

    /*
        Enkapsulacja (hermetuzacja) - pakowanie wlasciwosci w taki sposob
                                      aby nie bylo do niech besposrednio dostepu
                                      z innych klas
     */
    public static void main(String[] args) {

        KontoBankowe oszczednosciowe = new KontoBankowe();

        System.out.println(oszczednosciowe.getSaldo());

        if(oszczednosciowe.wyplata(100)){
            System.out.println("wyplacono");
            System.out.println("pozostalo: "+oszczednosciowe.getSaldo());
        }
        else {
            System.out.println("za malo kasy");
            System.out.println("posiadasz tylko :"+oszczednosciowe.getSaldo());
        }

        if(oszczednosciowe.wplac(700)){
            System.out.println("wplata poprawna, aktualne saldo:");
            System.out.println(oszczednosciowe.getSaldo());
        }
        System.out.println("-------");

        KontoBankowe2 mk = new KontoBankowe2(900);
        System.out.println("aktulana wartosc konta: "+mk.getSaldo());
        System.out.println("proba wyplaty 1000");
        if(mk.wyplata(1000)){
            System.out.println("wyplata powiodla sie");
            System.out.println("nowa wartosc konta: "+mk.getSaldo());
        }
        else {
            System.out.println("za malo kasy");
            System.out.println("wartosc konta: "+mk.getSaldo());
        }
        System.out.println("proba wyplaty 500");
        if(mk.wyplata(500)){
            System.out.println("wyplata powiodla sie");
            System.out.println("nowa wartosc konta: "+mk.getSaldo());
        }
        else {
            System.out.println("za malo kasy");
            System.out.println("wartosc konta: "+mk.getSaldo());
        }
        mk.wplata(1500);
        System.out.println("aktulana wartosc konta: "+mk.getSaldo());

    }
}

class KontoBankowe{
    private int saldo;
    public KontoBankowe(){
        saldo = 1000;
    }

    int getSaldo(){
        return saldo;
    }

    private void setSaldo(int saldo){ //dzieki temu mozemy usatwic saldo tylko z wewnatrz poprawnych metod
        // w klasie KontoBankowe takich jak wplata czy wyplata, z main nie mozemy tego zepsuc besposrenio

        /*
            WARUNKI
         */
        this.saldo = saldo;

        //return true;
    }

    boolean wyplata(int ile){
        if(saldo < ile){
            return false;
        }
        else {
            //saldo -= ile
            setSaldo(saldo-ile);
        }
        return true;
    }

    boolean wplac(int ile){
        setSaldo(saldo+ile);
        return true;
    }

}

class KontoBankowe2{
    int saldo;
    public KontoBankowe2(int saldo){
        this.saldo = saldo;
    }
    private void setSaldo (int saldo){
    this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }
    public boolean wyplata(int kasa){
        if(saldo<kasa){
            return false;
        }
        else{
            setSaldo(saldo-kasa);
            return true;
        }
    }
    public void wplata(int kasa){
        System.out.println("wplata "+kasa+" powiodla sie");
        setSaldo(saldo+kasa);
    }
}
