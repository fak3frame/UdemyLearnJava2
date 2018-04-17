package Sekacja_9._41_Modyfikator_protected.dziedziczenie;

import Sekacja_9._41_Modyfikator_protected.dziedzieczenie.potwory.Potwor;

public class Dziedziczenie {

    public void testD(){

    }

    public static void main(String[] args) {
        Potwor p = new Potwor();
        //bez modyfikatora (public/protected/private) dla zmiennej/metody
        //jest ona dostepna tylko w paczce

        //private ogranicza do klasy, np. ustawiamy zmienne tego typu i dostajemy sie do nich z innych klas dzieki
        //seterom i geterom

        //protected uztwamy zazwyczja do metod a private do zmienncyh
        //protected nie blokuje dostepu w klasach dziedziczacych
        //protected uzywamy jesli chcemy miec dostep do nadrzednych rzeczy z klas z innej paczki

        /*
        import Sekacja_9._41_Modyfikator_protected.dziedzieczenie.potwory.Potwor;

        public class Pajak extends Potwor{
            void f(){
                this.atakuj(); //dziedzicze klase Potwor z innej paczki, imprtuje ja i dzieki protected
                //mam do niej dostep z innej paczki
            }
        }
         */

    }
}


