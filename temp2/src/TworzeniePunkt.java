public class TworzeniePunkt {
    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        p1.zmienX(1);
        p1.zmienY(2);
        p1.pokazWsp();
        p1.zwiekszX();
        p1.zwiekszY();
        p1.pokazWsp();
        System.out.println(p1.wyswX());
        System.out.println(p1.wyswY());
    }
}
