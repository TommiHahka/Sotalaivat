package sotalaivat.sotalaivat.sovelluslogiikka;

public class Ruutu {
    private int xKoordinaatti;
    private int yKoordinaatti;
    private boolean onkoVarattu;
    
    public Ruutu(int x, int y) {
        xKoordinaatti = x;
        yKoordinaatti = y;
        onkoVarattu = false;
    }
    
    @Override
    public String toString() {
        return "(" + this.xKoordinaatti + ", " + this.yKoordinaatti + ", " + this.onkoVarattu + ")";
    }
    
    public int getX() {
        return this.xKoordinaatti;
    }
    
    public int getY() {
        return this.yKoordinaatti;
    }
    
    public boolean getOnkoVarattu() {
        return this.onkoVarattu;
    }
    
    public void muutaVaratuksi() {
        this.onkoVarattu = true;
    }
    
    public void muutaVapaaksi() {
        this.onkoVarattu = false;
    }
}
