public class Hranilnica {
    private String naziv;
    private int letoUstanovitve;
    private Denarnica[] denarnice;

    public Hranilnica(String naziv, int letoUstanovitve, Denarnica[] denarnice) {
        this.naziv = naziv;
        this.letoUstanovitve = letoUstanovitve;
        this.denarnice = denarnice;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getLetoUstanovitve() {
        return letoUstanovitve;
    }

    public int steviloDenarnic() {
        return denarnice.length;
    }

    public String izpisiDenarnice() {
        return String.format("Naziv: " + getNaziv() + ", leto ustanovitve: " + getLetoUstanovitve() + ": ");
    }


}