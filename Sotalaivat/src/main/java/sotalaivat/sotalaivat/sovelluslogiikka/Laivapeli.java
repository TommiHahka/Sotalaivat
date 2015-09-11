package sotalaivat.sotalaivat.sovelluslogiikka;

import sotalaivat.sotalaivat.tekoaly.Tekoaly;

public class Laivapeli {

    private Tekoaly tekoaly;
    private LaivojenSijoittelu sijoittelu;
    private Ruudukko pelaajanRuudukko;
    private Ruudukko tekoalynRuudukko;
    private Ruudukko pelaajanAmpumat;
    private Ruudukko tekoalynAmpumat;

    public Laivapeli() {
        pelaajanRuudukko = new Ruudukko();
        tekoalynRuudukko = new Ruudukko();
        pelaajanAmpumat = new Ruudukko();
        tekoalynAmpumat = new Ruudukko();
        tekoaly = new Tekoaly();
        sijoittelu = new LaivojenSijoittelu();
    }

    public void kaynnista() {
        pelaajanRuudukko.taytaRuudukko();
        sijoittelu.kaynnista();
    }
}
