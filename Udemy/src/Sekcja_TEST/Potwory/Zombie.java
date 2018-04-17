package Sekcja_TEST.Potwory;

import Sekcja_TEST.Baza_potwory.Potwor;

public class Zombie extends Potwor{

    private int sila;

    public Zombie(){
        System.out.println("konstruktor domyslny klasy Zombie");
    }
    public Zombie(int sila, int hp){
        super(hp);
        this.sila = sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }
    public int getSila(){
        return sila;
    }

    public void atakuj(){
        System.out.println("Zombie atakuje");
        System.out.println("jego zycie to: "+getHp());
        System.out.println("jego sila to: "+getSila());
    }
    public void gryz(){
        System.out.println("zombie gryzie");
    }

    @Override
    public String toString() {
        return super.toString() + " sila: " + this.sila;
    }
}
