package Sekcja_TEST;

import Sekcja_TEST.Baza_potwory.Obrona;
import Sekcja_TEST.Baza_potwory.Potwor;
import Sekcja_TEST.Potwory.Szkielet;
import Sekcja_TEST.Potwory.Zombie;
import Sekcja_TEST.Rodzina.Dziecko;
import Sekcja_TEST.Rodzina.Ojciec;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        System.out.println("ZADANIE 1");
        System.out.println("Tworze tablice obiektow Dziecka typ Ojeciec");
        Ojciec[] tabDziecko = new Ojciec[2]; //polimorfizm
        //obiekt jest to zmienna REFERNCYJNA, przekazywana jest przez adres pamieci
        //Obiekt(instance) sluzy do przechowywania zmiennych i funkcji tematycznie ze soba powiazanych, zawiera adres
        //Klasa jest to foremka do tworzenia obiektu
        //Metody powinny byc samoopisujace sie (self-describing). przeciążanie metod - overload
        //Przy tworzeniu obiektu klasy podrzednej(dziecka) (niewazne czy typ podrzednej czy nadrzednej) wywolaja sie
        // konstruktory obu klas, w pierwszej kolejnosci klasy nadrzednej(rodzica). Jesli stworzymy obiekt-
        // podklasy(dziecka) z parametrmi wywola sie konstuktor domyslny nadklasy(rodzica) chyba ze uzyjemy-
        // w konstruktorze podklasy NA POCZATKU instrukcji super a w niej wyslane parametry do konstruktora-
        // NIEDOMYSLNEGO nadklasy
        //Ilosc parametrow w instrukcji super zdecysduje ktory konstruktor nadklasy(rodzica) zostanie wywolany
        tabDziecko[0] = new Dziecko("pszemek", 20, "rudy");
        tabDziecko[1] = new Dziecko("pawel", 10, "zielony");

        System.out.println("\n"+"ZADANIE 2");
        //System.out.println(tabDziecko[0].getImie() + " " + tabDziecko[0].getWiek() + " "
        // tabDziecko[0].getKolorWlosow() + " " + "id obiektu: " + tabDziecko[0].getId());
        //System.out.println(tabDziecko[1].getImie() + " " + tabDziecko[1].getWiek() + " "
        // + tabDziecko[1].getKolorWlosow() + " " + "id obiektu: " + tabDziecko[1].getId());
        for (int i = 0; i<tabDziecko.length; i++){ //wyswietlenie dwóch linii powyżej za pomoca metody
            Ojciec.dajDaneObiektu(tabDziecko[i]); //dzieki tablicy dzieci typu ojciec moge wyslac do metody-
            // przyjmujacej typ ojciec kilka dzieci (wysylam adres pamieci czyli zmienna referencyjna)
            //metode wywoluje za pomoca nazwy klasy poniwważ w klasie Ojciec jest ona statyczna
        }

        System.out.println("\n"+"ZADANIE 3"); //SUPER
        tabDziecko[0].mow(); //moge wywolac metode tylko z klasy ojciec poniewaz obiekt jest jego typu (Ojca)
        //wywola sie metoda z klasy dziecko poniewaz jest w niej taka sama metoda i nadpisuje ta z rodzica
        //dodalem w niej takze na koncu (w konstruktorach trzeba na poczatku) metode super aby wywolala sie takze-
        // metoda rodzica
        //instrukcja super w metodzie ma inna konstrukcje w ktorej trzeba podac nazwe metody super.nazwaMetody(parametry)
        Dziecko d1 = new Dziecko();
        d1.mow2();//ta metoda jest juz tylko w klasie dziecka ale mam takze dostep do metod rodzica NIE NA ODWROT

        System.out.println("\n\n"+"ZADANIE 4"); //REFERENCJA vs ZMIANA
        Ojciec kopiaD1 = tabDziecko[0]; //tworze obiekt i przpisuje mu ADRES PAMIECI obiektu tabDziecko[0]
        //wszystkie zmiany beda dokonywaly sie na obu obiektach W OBIE STRONY
        Ojciec.dajDaneObiektu(kopiaD1);
        tabDziecko[0].setImie("brajan"); //zmieniam imie na tabDziecko[0]
        System.out.println("po zmianie:");
        Ojciec.dajDaneObiektu(kopiaD1); //zmiana dokonala sie takze na kopiaD1


        System.out.println("\n"+"ZADANIE 5"); //ZACHOWANIE STRINGOW W PAMIECI
        String napis1 = "tomek";
        String napis2 = napis1; //String jest zmienna obektowa ale moze przyjmowac kopie jak zmienne proste
        napis1 = "pawel"; //zmieni sie tylko napis 1, wykonuje kopie prosta(zmiane) a nie jak kopie adresu w obiektach
        System.out.println(napis1);
        System.out.println(napis2);
        String napis3 = "pawel"; //jesli wartosc bedzie taka sama jak innego Stringa to bedzie to ten sam adres-
        // w pamieci.
        if(napis1 == napis3){ //porownuje ADRESY
            System.out.println("rowne napisy");  //pokaze tylko dlatego ze maja ten sam adres pamieci przez proste-
            // przypsanie "="
            //zle porownanie zmiennych obiektowych!
            //jesli zmienie wartosc napis3 to juz nie zadziala
        }
        String napis4 = new String("pawel"); //tworze unikalna rezerwacje pamieci dla napis4 oraz nie daje-
        //prostego przypisania "=" tylko w nawiasie new String("wartosc"). gdybym w nowej linii dal przypsanie proste-
        // napis4= "cos"; to gdyby inny String zawieral to samo, wskazywalyby to samo miejsce w pamieci czyli -
        // moglyby byc rowne z innym Stringiem
        if(napis1 == napis4){
            System.out.println("rowne napisy 2"); // juz nie zadziala
        }
        if(napis1.equals(napis4)){
            System.out.println("rowne napisy 3");//poprawne sprawdznie zawartosci obiektu
        }






        System.out.println("\n"+"\n"+"ZADANIE 6"); //KLASY ABSTRAKCYJNE
        Potwor p1 = new Szkielet(10, 100); //polimorfizm
        Potwor p2 = new Zombie(20, 200);
        p1.atakuj();
        p2.atakuj();

        System.out.println("\n"+"\n"+"ZADANIE 7"); //INSTANCE OF, EXTENDS FOR
        Potwor[] potwory = new Potwor[4]; // moge stworzyc tablice abstrakcyjnych obiektow, nie wywoluja sie kontruktory
        potwory[0] = new Szkielet(10,100);
        potwory[1] = new Zombie(20, 200);
        for(int i = 0; i<potwory.length; i++){
            if(potwory[i] instanceof Potwor){//zabezpiczam sie przed pustymi elementami tablicy obiekow
                potwory[i].atakuj();
            }
            else{
                break; //aby na darmo nie chodzila petla
            }
        }
        System.out.println("\n"+"rozszerzona petla for:");
        for(Potwor p : potwory){
            if(p instanceof Potwor){
                p.atakuj();
            }
            else{
                break;
            }
        }

        System.out.println("\n"+"\n"+"ZADANIE 8"); //RZUTOWANIE W DOL, LATE BINDING
        Potwor[] potwory2 = new Potwor[4];
        potwory2[0] = new Szkielet(10,100);
        potwory2[1] = new Zombie(20, 150);
        for(Potwor x : potwory2){
            if (x instanceof Szkielet)
                ((Szkielet)x).strzelaj();//musze zrobic rzutowanie W DÓL jesli metoda jest tylko w podklasie a typem-
                // jest nadklasa! (down casting)
            else if (x instanceof Zombie)
                ((Zombie)x).gryz();
            else
                break;
        }

        System.out.println("\n"+"\n"+"ZADANIE 9"); //KLASA OBJECT, METODY(equals,getClass,toString)
        //domyslne kazda klasa rozszerza kase Objects i ma dostep do jej metod i moze je nadpisywac
        Potwor s = new Szkielet(10, 100);
        Potwor z = new Zombie(10, 120); //nie moge dac zambie bo w equalas powinien byc warunek sprawdzajacy-
        // czy obuekty sa tej samej klasy (czy obie sa ze szkieleta, czy z zombie). sprawdze to za pomoca metody
        // getClass w warunku metody equeals
        Potwor s2 = new Szkielet(10, 120);
        Potwor s3 = new Szkielet(10, 100);
        if(s.equals(z)) //ustawilem dzialanie metody equals w nadklasie
            //na obiekcie s wywoluje metode z klasy takiej jakiego jest typu czyli Potwora(rodzica)
            //dodaje metode z nadklasy Object - equals ktora przyjmuje obiekt z
            //nie przejdzie bo w equals dodalem warunek nazwy sprawdzenia nazwy klasy
            System.out.println("sa rowne1");
        if(s.equals(s2))
            System.out.println("sa rowne2");
        if (s.equals(s3))
            System.out.println("\n"+"\n"+"sa rowne3");
        System.out.println("\n"+"Wyswietlam obiekty z metod toString");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(z);
        System.out.println();

        System.out.println("ZADANIE 10"); //final, date
        System.out.println(s.dataTworzeniaObiektu);
        System.out.println();





















        System.out.println("ZADANIE K11_LinkedHashMapLinkedHashSet"); //interfejsy, sortownie(klasa arrays)
        //interfejs sie implementuje - jest to klasa
        //metody - publiczne abstrakcyjne
        //wlasciwosci - publiczne finalne i statyczne
        //interfejsy tworzy sie aby zachowac pewne zachowanie dzialania na klasy
        //mozna implementowac wiele interfjsow!
        //moge stworzyc obiekt typu interfejsu i w niego umiescic obiekt klasy po to aby miec dostep do wlasciewosci-
        // i metod interfejsu (ich definicji) czyli z downcastingiem do pelnych metod ale z polimorfizmem czyli-
        // moge umiescic wiele klas implementujacych ten interfejs
        int[] tabLiczb = new int[3];
        tabLiczb[0] = 3;
        tabLiczb[1] = -2;
        tabLiczb[2] = 1;
        Arrays.sort(tabLiczb); //musze dodac import.java.util.Arrays;
        //klasa arrays implementuje metode compereTo dla intow z interface
        //metoda Arrays.sort(jakasTablica) automatycznie wykrywa jaki typ zmiennych zawiera przyjmowana tablica\
        //dla obiektow musze zadeklarowac jej dzialanie (musi zwracac -1, lub 1 lub 0)
        for(int x : tabLiczb){
            System.out.println(x);
        }
        Potwor[] potworyZad11 = new Potwor[2];
        potworyZad11[0] = new Szkielet(10, 250);
        potworyZad11[1] = new Szkielet(10, 200);
        for(Potwor x : potworyZad11){
            System.out.println(x.getHp());
        }
        System.out.println("wywoluje funkcje compareTo z Potwora i sortuje");
        Arrays.sort(potworyZad11);
        //jesli bede chcial odwrocic to dam:
        //Arrays.sort(potworyZad11, Collections.reverseOrder());
        for(Potwor y : potworyZad11){
            System.out.println(y.getHp());
        }
        //Tworze obiekt typu interfejs aby moc umiescic w nia wiele klas (polimorfizm)
        //klasa ktora bede umieszczal w ten obiekt musi implementowac ten interfejs (lub klasa ktora rozszerza)
        System.out.println("Wyswietlam dane obiektu typu interfejsc");
        Obrona obiektInterfejsu = new Szkielet(10, 100);
        System.out.println(((Potwor)obiektInterfejsu).getHp()); //z downcastingiem dobieram sie do wybranych danych
        System.out.println();

        System.out.println("ZADANIE 12");// klasy zagniezdzone
        //pola klasy zewnetrznej private sa dostepne dla dlasy wewnetrznej a na odwrot juz nie
        A obiektZew = new A();
        A.B tmp = obiektZew.new B();//konstrukcja wymagana
        //tworze zmienna referencyjna tmp typu klasy zagniezdzonej i klasy zaw i z pomoca obiektu klasy zew tworze
        // obiekt klasy wewnetrznej
        A.C tmp2 = new A.C(); // w przypadku zagniezdzonej klasy statycznej nie musz pomagac sobie obektem klasy zew.
        //klasa statyczna moze istniec tylko jako zagniezdzona
        //zmienne statyczne moga byc umieszczone tylko w klasie statycznej zagniezdzonej lub w klasie zwenetrznej
        // poniewaz do stworznie instncji statycznej klasy zagniezdzonej nie jest wymagana instancja klasy zewnetrznej
        // A.C tmp2 = new A.C(); natomiast do stworzenia instancji klasy zgniezdzonej zwyklej potrzebny jest juz obiekt
        // klasy zewnetrznej a nie jest wiadomo czy zawsze bedzie on utworzony (pole statyczne)
        // A obZEW = new A(); A.B tmp = obZEW.new B():
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.utworzKonto(5);
        System.out.println(kontoBankowe.getStanKonta());
        KontoBankoweTest kontoBankoweTest = new KontoBankoweTest(500);
        kontoBankoweTest.utworzKonto(10);
        System.out.println();

        System.out.println("ZADANIE 13"); //klasy anonimowe
        //Klasy anonomowej uzywamy jeali chcemy stworzyc zachowanie jedno dla kilku klas np przycisku
        //tworzymy interace deklaraujacy zachownie przycisku posiadajacy metode akcja
        //tworzymy wspolna klase dla przyciskow ktora wykorzystamy jako tym zmkennej referencyjnej
        // w niej deklarujemy metode dodajAkcje ktora bedzie przyjmowala obiekt interacu i wywolywala jego metode
        //na stworzonym obiekcie przycisku wtwolujemt metode dodajAkcje i wysylamy do niej klase anonimowa w ktorej
        // odrazu deklarujemy dzialanie metody akcji z interfejsu
        Przycisk p = new Przycisk();
        p.dodajAkcje(new ZachowniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("jestem z klasy anonimowej");
            }
        });
        System.out.println();

        System.out.println("ZADANIE 14");// kompozycja i agregacja
        //kompozycja daje mozliwosc stworzenia zmiemnej w klasie typu innej klasy ktory bedzie przechowywal cala jej
        // zawartosc np adres dla pracownika lecz nie musi sie on znajdowac
        //agregacja rozni sie tym ze musi wystepowac np typ klasy silnik w klasie samochod
        Pracownik kamil = new Pracownik("Kamil", new Adres("Sloneczna", 4));
        System.out.println(kamil);
        System.out.println();






        System.out.println("ZADANIE 15");// wyjatki
        try{
            System.out.println("instrukcja przed wyrzuconym wyjatkiem sie wykona");
            System.out.println(5/0); // wyrzucam wyjatek ktory jest obiektem
            System.out.println("instrukcja po juz nie");
        }
        catch (ArithmeticException x){
            System.out.println(x.getMessage());
            System.out.println("lub inaczej dzielisz przez 0 debilu!");
        }
        finally {
            System.out.println("TO SIE WYKONA ZAWSZE w bloku finally");
        }
        Butelka b1 = new Butelka(10);
        Butelka b2 = new Butelka(8);
        System.out.println("W butelce 1 jest "+b1.getileLitrow()+" litrow");
        System.out.println("W butelce 2 jest "+b2.getileLitrow()+" litrow");
        try{
            b1.przelej(8, b2);
        }
        catch (ZaMaloWody x){
            System.out.println(x.getMessage()); //zadeklarowalem sobie klase wyjatku wraz ze zmiana wiadomosci
        }
        catch (PrzelejeSie x){
            System.out.println(x.getMessage());
        }
        System.out.println("W butelce 1 jest "+b1.getileLitrow()+" litrow");
        System.out.println("W butelce 2 jest "+b2.getileLitrow()+" litrow");


    }
}

