public class Naloga {
    public static void main(String[] args) {

        System.out.println("DOBER DAN!");
        System.out.println("");

        //USTVARIMO VALUTE

        Valuta eur = new Valuta(
            "EUR",
            "evro"
        );
        Valuta gbp = new Valuta(
            "GBP",
            "britanski funt"
        );
        Valuta usd = new Valuta(
            "USD",
            "ameriski dolar"
        );


        //USTVARIMO DENARNICE

        Denarnica eurD1 = new Denarnica(
            eur,
            5000.00
        );
        Denarnica eurD2 = new Denarnica(
            eur,
            10000.00
        );

        Denarnica gbpD1 = new Denarnica(
            gbp,
            4000.00
        );
        Denarnica gbpD2 = new Denarnica(
            gbp,
            11000.00
        );

        Denarnica usdD1 = new Denarnica(
            usd,
            3000.00
        );
        Denarnica usdD2 = new Denarnica(
            usd,
            12000.00
        );


        Denarnica[] denarnice = new Denarnica[] {
            eurD1,
            eurD2,
            gbpD1,
            gbpD2,
            usdD1,
            usdD2,
        };



        //USTVARIMO HRANILNICO

        Hranilnica nova = new Hranilnica(
            "Nova hranilnica",
            1995,
            denarnice
        );



        //PREVERIMO ZACETNO STANJE

        System.out.println("Zacetno stanje v " + nova.steviloDenarnic() + " denarnicah:");

        System.out.println("EUR 1: " + eurD1.getZnesek() + ", blokirana: " + eurD1.getBlokirana());
        System.out.println("EUR 2: " + eurD2.getZnesek() + ", blokirana: " + eurD2.getBlokirana());

        System.out.println("GBP 1: " + gbpD1.getZnesek() + ", blokirana: " + gbpD1.getBlokirana());
        System.out.println("GBP 2: " + gbpD2.getZnesek() + ", blokirana: " + gbpD2.getBlokirana());

        System.out.println("USD 1: " + usdD1.getZnesek() + ", blokirana: " + usdD1.getBlokirana());
        System.out.println("USD 2: " + usdD2.getZnesek() + ", blokirana: " + usdD2.getBlokirana());

        System.out.println("");

        

        //IZVEDEMO TRANSAKCIJE V DENARNICAH

        System.out.println("Zacetek izvajanja transakcij:");
        
        System.out.println("EUR 1: " + eurD1.dodaj(1000.00));
        System.out.println("EUR 2: " + eurD1.odvzemi(1000.00));
        System.out.println("GBP 1: " + gbpD1.dodaj(2000.00));
        System.out.println("GBP 2: " + gbpD1.odvzemi(3000.00));
        System.out.println("USD 1: " + usdD1.dodaj(3000.00));
        System.out.println("USD 2: " + usdD2.odvzemi(3000.00));


        //BLOKIRAMO ENO DENARNICO

        System.out.println("");
        System.out.println("Blokiramo eno denarnico:");

        usdD2.setBlokirana(true);
        System.out.println("USD 2 blokirana: " + usdD2.getBlokirana());


        //IZPISEMO DENARNICE

        System.out.println("");
        System.out.println("Izpisemo:");

        System.out.println(nova.izpisiDenarnice());
        
    }
}