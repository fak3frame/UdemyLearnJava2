public class one {

    public static void f(int[] x){
        for(int i:x){
            System.out.println(i+" ");
        }
    }


    public static void main(String[] args) {
        int[] t = {1,2,3};
        f(t);
        String napis = "123";
        String napis2 = "123";

        //String napis3 = new StringBuilder(napis).reverse().toString();

        System.out.println(new StringBuilder(napis).reverse().toString());



        if(napis.equals(napis2)){
            System.out.println("true");
        }



    }
}
