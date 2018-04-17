package Sekacja_9._38_Butelka_cwicznie;

public class Butelka {

    private double ileLitrow; // ENKAPSULUJE WARTOSCI aby nie mozna bylo miec do nich dostepu z zewnatrz
    private double pojemnosc = 20;

    Butelka(){

    }

    Butelka(double ileLitrow){ /* jesli tworze konstruktor z parametrem automatycznie znika
        konstruktor bezparamtrowy (ukryty/robiony z automatu) wiec trzeba go dodac recznie */
        //zadziala TYLKO jesli obiekty beda tworzone z paramtrem
        /* dlatego lepiej jest takze dodac konstruktor domyslny/bezparametrowy aby
        byla mozliwosc takze tworzenia obiektow bez parametrow */
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow(){
        return ileLitrow;
    }

    boolean wlej(double ilosc) {
        if (ilosc < (this.pojemnosc - this.ileLitrow))
            this.ileLitrow += ilosc;
        else{
            return false;
        }
        return true;
    }
    boolean wylej(double ilosc){
        if(ilosc < ileLitrow) {
            this.ileLitrow -= ilosc;
        }
        else {
            return false;
        }
        return true;
    }
    void przelej(double ilosc, Butelka gdzie){
        if(this.wylej(ilosc)){
            //System.out.println("test1");
            if(gdzie.wlej(ilosc)){
                //System.out.println("test2");
            }
            else{
                this.wlej(ilosc);
                System.out.println("w butelce 2 sie przeleje!");
            }
        }
        else{
            System.out.println("za malow wody w butelce 1");
        }
    }


    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[7]; //puste elementy tablicy

        butelka[0] = new Butelka(15);
        butelka[1] = new Butelka(12);
        butelka[2] = new Butelka();
        butelka[3] = new Butelka(20);
        butelka[4] = new Butelka();
        butelka[5] = new Butelka(7);
        butelka[6] = new Butelka(15);

        butelka[3].ileLitrow = 10; //? dlaczego jak bylo protected
        System.out.println(butelka[3].ileLitrow);

        System.out.println("///////////");

        butelka[0].przelej(4,butelka[1]);
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());

        System.out.println("///////////");

        butelka[0].przelej(16,butelka[1]);
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());System.out.println("///////////");

        butelka[5].przelej(6,butelka[6]);
        System.out.println(butelka[5].getIleLitrow());
        System.out.println(butelka[6].getIleLitrow());

    }

}
