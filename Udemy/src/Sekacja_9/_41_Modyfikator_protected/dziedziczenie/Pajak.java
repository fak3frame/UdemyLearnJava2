package Sekacja_9._41_Modyfikator_protected.dziedziczenie;

import Sekacja_9._41_Modyfikator_protected.dziedzieczenie.potwory.Potwor;

public class Pajak extends Potwor{
    void f(){
        this.atakuj();
    }

    public static void main(String[] args) {
        Pajak p = new Pajak();
        p.atakuj();
        //p.testD();
    }

}
