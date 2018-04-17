package Sekcaj_8._21_Czym_są_pętle_pętle_while_do_while;

public class One {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int i = 0;
        while(i<tab.length){
            if(i==0){
                tab[i] = 10;
            }
            else{
                tab[i] = 10 * (i+1);
            }
            i++;
        }
        i=0;
        do{
            System.out.println(tab[i]);
            i++;
        }
        while (i<tab.length);
    }
}
