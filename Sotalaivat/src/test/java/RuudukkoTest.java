/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sotalaivat.sotalaivat.sovelluslogiikka.*;

/**
 *
 * @author Tommi
 */
public class RuudukkoTest {

    Ruudukko ruudukko;

    public RuudukkoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ruudukko = new Ruudukko();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getRuutuToimii() {
        Ruutu uusiruutu = new Ruutu(3, 5);
        ruudukko.taytaRuudukko();
        assertEquals(uusiruutu.toString(), ruudukko.getRuutu(3, 5).toString());
    }

    @Test
    public void taytaRuudukkoToimii() {
        ruudukko.taytaRuudukko();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals("(" + i + ", " + j + ", false)", ruudukko.getRuutu(i, j).toString());
            }
        }
    }
}
