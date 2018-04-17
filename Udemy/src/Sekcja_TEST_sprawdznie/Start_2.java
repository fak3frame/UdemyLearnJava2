package Sekcja_TEST_sprawdznie;

public class Start_2 {

    public static void main(String[] args) {
        Zwykla<String> zm = new Zwykla<>();
        zm.ustawZmiennaCokolwiek("napis");
        System.out.println(zm.zwrocZmiennaCokolwiek());
        Zwykla<Integer> zm2 = new Zwykla<>();
        zm2.ustawZmiennaCokolwiek(10);
        System.out.println(zm2.zwrocZmiennaCokolwiek());

    }
}

class Zwykla <COKOLWIEK>{
    COKOLWIEK zmienna;
    public void ustawZmiennaCokolwiek(COKOLWIEK zmienna){
        this.zmienna = zmienna;
    }
    public COKOLWIEK zwrocZmiennaCokolwiek(){
        return this.zmienna;
    }
}