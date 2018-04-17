public class Test {
    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D();
        Punkt2D p2 = new Punkt2D(3,4);
        Punkt3D p3 = new Punkt3D(5,6, 7);
        System.out.println(p1.wspX+" "+p1.wspY);
        System.out.println(p2.wspX+" "+p2.wspY);
        System.out.println(p3.wspX+" "+p3.wspY+" "+p3.wspZ);
    }
}
