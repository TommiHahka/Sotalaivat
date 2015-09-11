package sotalaivat.sotalaivat.sovelluslogiikka;

import java.util.HashMap;

public class Ruudukko {
    
    private HashMap<Integer,Ruutu> ruutulista;

    public Ruudukko() {
        ruutulista = new HashMap<Integer,Ruutu>();
    }

    public void taytaRuudukko() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Ruutu ruutu = new Ruutu(i, j);
                ruutulista.put(10*i + j, ruutu);
            }
        }
    }

    public void tulostaRuudukonTiedot() {
        for (int avain : ruutulista.keySet()) {
            System.out.println(ruutulista.get(avain));
        }
    }
    
    public Ruutu getRuutu(int x, int y) {
        return ruutulista.get(10*x + y);
    }
}
