package sotalaivat.sotalaivat.sovelluslogiikka;

public class Laiva {

    private int xKoordinaatti;
    private int yKoordinaatti;
    private int pituus;
    private String alustyyppi;

    public Laiva(int pituus) {
        this.pituus = pituus;
        if (pituus == 1) {
            this.alustyyppi = "Sukellusvene";
        } else if (pituus == 2) {
            this.alustyyppi = "Hävittäjä";
        } else if (pituus == 3) {
            this.alustyyppi = "Risteilijä";
        } else if (pituus == 4) {
            this.alustyyppi = "Lentotukialus";
        } else {
            System.out.println("Virheellinen laivan pituus!");
        }
    }

    public String getAlustyyppi() {
        return this.alustyyppi;
    }
    
    public int getPituus() {
        return this.pituus;
    }

}
