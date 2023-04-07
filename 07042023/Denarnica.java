public class Denarnica {
    private Valuta valuta;
    private double znesek;

    private boolean blokirana;


    public Denarnica(Valuta valuta, double znesek) {
        this.valuta = valuta;
        this.znesek = znesek;
    }

    public double dodaj(double znesek1) {
        return znesek = znesek + znesek1;
    }

    public double dodaj(double[] zneski) {
        for (int i=0; i<zneski.length; i++) {
            znesek = znesek + zneski[i];
        }
        return znesek;
    }

    public double odvzemi(double znesek1) {
        return znesek = znesek - znesek1;
    }

    public double odvzemi(double[] zneski) {
        for (int i=0; i<zneski.length; i++) {
            znesek = znesek - zneski[i];
        }
        return znesek;
    }

    public void setBlokirana(boolean blokirana1) {
        blokirana = blokirana1;
    }

    public boolean getBlokirana() {
        return blokirana;
    }


    //ZACASNO
    public double getZnesek() {
        return znesek;
    }


    ////////
}