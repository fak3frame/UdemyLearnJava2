package Sekacja_9._31_Przeciążanie_metod;

public class One {
    public static void main(String[] args) {
        Test a = new Test();
        double wynik = a.dodaj(10.5,20.1);
        double wynik2 = a.dodaj(10,14);
        System.out.println(wynik);
        System.out.println(wynik2);
    }
}

class Test{
    int dodaj(int a, int b){
        return a+b;
    }
    double dodaj(double a, double b){
        return a+b;
    }
}
