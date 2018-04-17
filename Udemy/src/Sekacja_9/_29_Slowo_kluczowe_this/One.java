package Sekacja_9._29_Slowo_kluczowe_this;

public class One {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(10,16);
        System.out.println(p1.x);
        System.out.println(p1.y);
    }
}

class Punkt{
    int x;
    int y;
    Punkt(){

    }
    Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
}
