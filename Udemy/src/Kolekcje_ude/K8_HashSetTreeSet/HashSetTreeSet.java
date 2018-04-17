package Kolekcje_ude.K8_HashSetTreeSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

class Element2{
    int wartosc;
    public Element2(int wartosc){
        this.wartosc = wartosc;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this.getClass() != obj.getClass() || obj == null) return false;
        return this.wartosc == ((Element2)obj).wartosc;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wartosc);
    }
}

public class HashSetTreeSet {
    public static void main(String[] args) {

        long mili = 0;
        long totalMili = 0;

        //tworze zbior, niuporzadkowany, nie przechowuje duplikatow (np wyrazow z pliku)
        Set<String> set = new HashSet<String>(512);

        set = new TreeSet<String>();//dlatego tworze treeSet
        //elementy beda uporzadkowane, treeset jest wolniejszy

        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader("mojPlik.txt")));
            while(reader.hasNext()){
                mili = System.currentTimeMillis();

                set.add(reader.next());//po dodaniu 1 wyrazu token zostaje przesuniety o 1 wyraz

                totalMili+=(System.currentTimeMillis() - mili);
            }

            reader.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("--------1-------");
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("--------2-------");
        System.out.println("czas wykonania: " + totalMili);
        System.out.println("wielkosc zbioru: " + set.size());


    }
}
