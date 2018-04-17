package Kolekcje_ude;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Edytor{
    public static void wypisz(List<? extends Figura> lista){
        //przyjmie tylko obiekty z rodziny figura
        for(Figura x : lista){
            System.out.println(x.pobierzNazwe());
        }
    }
    public static <Type, K, G> void przepiszTabliceDoKolekcji(Type[] tab, Collection<Type> c){
        //tworze typ genetyczny Type ktory moze byc dowolnego typu np number,float
        // ale nie moze przyjmowac obiketow ktore nie sa powiazane np Figura
        for(Type o : tab){
            c.add(o);
        }
    }
    public static <T extends Figura> void wypisz2(List<T> lista){ //generyczna metoda
        //tworze ogolny typ T ktory rozszerza klase Figura dzieki czemu moge uzywac
        // tylko obiektow typu figura
        lista.add((T) new Kolo());
        lista.add((T) new Kwadrat());
        for(T x : lista){
            System.out.println(x.pobierzNazwe());
        }


    }
}

class Figura <K>{
    K zmienna;
    public String pobierzNazwe(){
        return nazwa;
    }
    String nazwa = "";
}

class Kolo extends Figura{
    public Kolo(){
        super.nazwa = "Kolo";
    }
}
class Kwadrat extends Figura{
    public Kwadrat(){
        super.nazwa = "Kwadrat";
    }
}

public class MetodyGeneryczne {
    public static void main(String[] args) {
        Figura figura1 = new Kolo();
        Figura figura2 = new Kwadrat();

        List<Figura> listaFigur = new ArrayList<Figura>();
        listaFigur.add(figura1);
        listaFigur.add(figura2);

        System.out.println("-----1------");
        Edytor.wypisz(listaFigur);

        Float[] fl = new Float[50];
        Integer[] in = new Integer[50];
        Number[] nu = new Number[50];
        Collection<Number> cn = new ArrayList<Number>();
        Edytor.przepiszTabliceDoKolekcji(fl, cn);
        //przepisuje tablice do kolekcji ktora jest typem wyzej

        System.out.println("-----2------");
        Edytor.wypisz2(listaFigur);


    }
}


