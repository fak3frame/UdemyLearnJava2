package Kolekcje_ude.K4_MetodyGeneryczne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Edytor{
    public static void wypisz(List<? extends Figura> lista){
        //przyjmie tylko obiekty z rodziny figura

        //lista.add(new Kolo());
        //nie moge dodac poniwac uzywam bounded wildcards jako przyjmowanej listy
        //musialbym dodac (List<Figura> lista)
        // zadklarowalem metode ponizej (metoda generyczna)

        for(Figura x : lista){
            System.out.println(x.pobierzNazwe());
        }
    }
    public static <Type, K> void przepiszTabliceDoKolekcji(Type[] tab, Collection<K> c){
        //tworze typ genetyczny Type oraz K ktory moze byc dowolnego typu np number,float
        // ale NIE moze przyjmowac obiketow ktore sa powiazane np Figura
        // do tego musialbym zastosowac metode generyczna np <Type extends Figura>
        for(Type tablica : tab){
            c.add((K)tablica);//musze zrobic rzutownie poniwaz kolekcja jest innego typu
        }
    }
    public static <T extends Figura> void wypisz2(List<T> lista){ //generyczna metoda
        //tworze ogolny typ T ktory rozszerza klase Figura dzieki czemu moge uzywac
        // tylko obiektow rodziny figura
        lista.add((T) new Kolo()); //musze zastosowac rzutowanie do typu generycznego
        lista.add((T) new Kwadrat());
        for(T x : lista){
            System.out.println(x.pobierzNazwe());
        }
    }
}

class Figura <Figura>{
    Figura zmiennaFigura;
    public void ustawFigure(Figura zmiennaFigura){
        this.zmiennaFigura=zmiennaFigura;
    }
    public String pobierzNazwe(){
        return nazwa;
    }
    String nazwa = "";
}

class Kolo<Kolo> extends Figura{
    Kolo zmiennaKolo;
    public void ustawKolo(Kolo zmiennaKolo){
        this.zmiennaKolo=zmiennaKolo;
    }

    public Kolo(){
        super.nazwa = "Kolo"; //przypisuje wartosc zmiennej nadkasy
    }
}
class Kwadrat<Kwadrat> extends Figura{
    Kwadrat zmiennaKwadrat;
    public void ustawKwadrat(Kwadrat zmiennaKwadrat){
        this.zmiennaKwadrat=zmiennaKwadrat;
    }

    public Kwadrat(){
        super.nazwa = "Kwadrat";
    }
}

public class MetodyGeneryczne {
    public static void main(String[] args) {
        Figura<Integer> figura1 = new Kolo<String>();
        Figura<Integer> figura2 = new Kwadrat<String>();

        List<Figura> listaFigur = new ArrayList<Figura>();

        listaFigur.add(figura1);
        figura1.ustawFigure(1);
        ((Kolo) figura1).ustawKolo(12);//?? nie widzi deklaracji new Kolo<String>();

        listaFigur.add(figura2);

        System.out.println("-----2------");
        Edytor.wypisz(listaFigur);
        System.out.println("-----3------");
        Edytor.wypisz2(listaFigur);


        Float[] fl = new Float[50];
        Integer[] in = new Integer[50];
        Number[] nu = new Number[50];
        Collection<Number> cn = new ArrayList<Number>();
        Edytor.przepiszTabliceDoKolekcji(fl, cn);
        //przepisuje tablice do kolekcji ktora jest typem wyzej



    }
}


