package Sekcja_TEST;

public class Butelka {
    private int pojemnosc = 15;
    private int ileLitrow;
    public Butelka(int ileLitrow){
        this.ileLitrow = ileLitrow;
    }
    public int getileLitrow(){
        return ileLitrow;
    }
    public void wylej(int wylej) throws ZaMaloWody
    {
        if(ileLitrow < wylej)
            throw new ZaMaloWody("Za malo wody");
        else
            ileLitrow-=wylej;
    }
    public void wlej(int wlej) throws PrzelejeSie{
        if((wlej+ileLitrow) > pojemnosc)
            throw new PrzelejeSie("Przeleje sie");
        else
            ileLitrow+=wlej;
    }
    public void przelej(int wylej, Butelka butelka) throws ZaMaloWody, PrzelejeSie{
        System.out.println("Probuje przelac "+wylej+" l z butelki 1 do 2");
        wylej(wylej);
        butelka.wlej(wylej);
    }
}

class ZaMaloWody extends Exception{
    public ZaMaloWody(String string){
        super(string);
    }
}
class PrzelejeSie extends Exception{
    public PrzelejeSie(String string){
        super(string);
    }
}