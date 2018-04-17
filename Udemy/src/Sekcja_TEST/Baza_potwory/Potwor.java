package Sekcja_TEST.Baza_potwory;

import java.util.Date;

public abstract class Potwor implements Obrona, Comparable{ //nie mozna tworzyc instancji klasy abstrakcyjnej
    //tylko klasa abstrakcyjna moze zawietac metody abstrakcyjne
    //klasa nadrzeda abstrakcyjna gdy implemetuje interfajs z metoda to klady podrzedne nie musza tej metody implemetowac
    //implementuje interfejs wbudowany w jave Comparable do porownywania

    private int hp;
    public final Date dataTworzeniaObiektu = new Date();
    public Date dataTworzeniaObiektu2;

    public Potwor(){
        System.out.println("konstuktor domyslny klasy potwor");
    }
    public Potwor(int hp){
        this.hp = hp;
    }
    public Potwor(int hp, Date data){//gdy chce wprowadzic date zatrudnienia
        this.hp = hp;
        this.dataTworzeniaObiektu2 = data;
    }
    public final Date getDataTworzeniaObiektu(){ // aby ktos w klasie dziedziczacej nie nadpisal ze swoimi danymi
        return this.dataTworzeniaObiektu;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void atakuj(); //moglem dac protected (dostepne tylko dla klasy dziedzieczacej) ale uzywam jej w-
    // w klasie stratowej, public jest takze dostepny w klasach z innej paczki
    //metoda abstrakcyjna jest wymogiem deklaracji takiej metody w klasach dziedziczacych

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { //sprawdzam czy wyslano pusty obiekt
            System.out.println("null");
            return false;
        }
        if(this == obj) //sprawdzam czy wyslano ten sam obiekt za pomoca adresu
            return true;
        if(this.getClass()!= obj.getClass()) { //zprawdzam za pomoca funkcji getClass(klasy Object) czy wyslane obiekty-
            //naleza do tej samej klasy za pomoca sprawdzenia nazwy
            System.out.println("inna klasa: ");
            System.out.print(this.getClass()+" oraz " + obj.getClass());
            return false;
        }
        return this.hp == ((Potwor)obj).hp;//dodalem down casting poniewaz przyjmuje typ nadklasy(Object)
        //NIE moglem dac public boolean equals(Potwor obj) poniewaz nie nadpisalbym metody equals(inna skladnia)
    }



    @Override
    public String toString() {
        return "hp" + this.hp;
    }

    public String bronSie(){ //musze zaimplementowac bo jest w importowanym interfejsie, nie musze w klasach -
        // dziedziczacych
        return "broni sie";
    }

    public int compareTo(Object o){ //wymog skladni
        Potwor przyslany = (Potwor)o; //przypisuje dla wygody obiekty z downcastingiem
        if(this.hp > przyslany.hp){
            return 1; // wymog metody nadpisywanej z interfejsu "Comparable"
                        //potrzebyny zwrot liczb 1,-1,0 aby funkcja w sobie umiala posortowac wybrane wartosci obiektow
        }
        if(this.hp < przyslany.hp){
            return -1;
        }
        return 0;
    }

}
