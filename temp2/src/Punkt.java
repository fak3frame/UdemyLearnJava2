public class Punkt {
    int x;
    int y;
    public void zwiekszX(){
        x++;
    }
    public void zwiekszY(){
        y++;
    }
    public void zmienX(int x1){
        this.x = x1;
    }
    public void zmienY(int y1){
        this.y = y1;
    }
    public int wyswX(){
        return x;
    }
    public int wyswY(){
        return y;
    }
    public void pokazWsp(){
        System.out.println("wspolrzedne wynosza:"+x+", "+y);
    }
}
