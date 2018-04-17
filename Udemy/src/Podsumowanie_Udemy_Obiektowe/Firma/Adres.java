package Podsumowanie_Udemy_Obiektowe.Firma;

public class Adres {
    private String ulica;
    private int nrDomu;

    public String getUlica() {
        return ulica;
    }
    public int getNrDomu() {
        return nrDomu;
    }
    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Adres(String ulica, int nrDomu){
        this.nrDomu = nrDomu;
        this.ulica = ulica;
    }
}
