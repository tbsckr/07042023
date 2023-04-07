public class Valuta {
    private String oznaka;
    private String naziv;

    public Valuta(String oznaka, String naziv) {
        this.oznaka = oznaka;
        this.naziv = naziv;
    }

    public String getOznaka() {
        return oznaka;
    }

    public String getNaziv() {
        return naziv;
    }
}