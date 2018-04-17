package Sekacja_9._38_Butelka_cwicznie;

public class ButelkaCwiczenie {
     private double ileLitrow;
     private double pojemnosc = 20;

    ButelkaCwiczenie(){

    }

    ButelkaCwiczenie(double ileLitrow){ //tworzac konstruktor paramatreowy to bezparametrowy znika
        this.ileLitrow = ileLitrow;
    }

    boolean wlej(double ilosc){
        if(ilosc<(pojemnosc-ileLitrow)){
            ileLitrow += ilosc;
        }
        else{
            System.out.println("przeleje sie");
            return false;
        }
        return true;
    }
    boolean wylej(double ilosc){
        if(ilosc < this.ileLitrow){
            this.ileLitrow -= ilosc;
        }
        else {
            System.out.println("za malo litrow");
            return false;
        }
        return true;
    }

    void przelej(double ilosc, ButelkaCwiczenie gdziePrzelac){
        if(this.wylej(ilosc)){
            if(gdziePrzelac.wlej(ilosc)){
                System.out.println("przelano " +ilosc+" l");
            }
        }
    }

    public static void main(String[] args) {
        ButelkaCwiczenie[] butelki = new ButelkaCwiczenie[3]; //tworze puste

        butelki[0] = new ButelkaCwiczenie(5);
        butelki[1] = new ButelkaCwiczenie(8);
        butelki[2] = new ButelkaCwiczenie(10);

        ButelkaCwiczenie butelka = new ButelkaCwiczenie();

        System.out.println(butelki[0].ileLitrow);

        System.out.println("////");

        System.out.println("Wlewam 10 l do butelki[0]:");
        butelki[0].wlej(10);
        System.out.println("aktualna ilosc w butelki[0]:");
        System.out.println(butelki[0].ileLitrow);
        System.out.println("aktualna ilosc w butelki[1]:");
        System.out.println(butelki[1].ileLitrow);

        System.out.println("/////");

        //1: 5
        //2: 8

        System.out.println("Przelewam z butelki[0] 4 l do butelki[1]");
        butelki[0].przelej(4,butelki[1]);
        System.out.println("aktualna ilosc w butelki[0]:");
        System.out.println(butelki[0].ileLitrow);
        System.out.println("aktualna ilosc w butelki[1]:");
        System.out.println(butelki[1].ileLitrow);

        System.out.println("////");







    }
}

