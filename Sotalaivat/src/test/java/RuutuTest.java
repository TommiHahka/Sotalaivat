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
public class RuutuTest {
    
    Ruutu ruutu;
        
    public RuutuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ruutu = new Ruutu(3,8);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriToimii() {
        assertEquals("(3, 8, false)", ruutu.toString());
    }
    
    @Test
    public void getXToimii() {
        assertEquals(3, ruutu.getX());
    }
    
    @Test
    public void getYToimii() {
        assertEquals(8, ruutu.getY());
    }
    
    @Test
    public void getOnkoVarattuToimii() {
        assertEquals(false, ruutu.getOnkoVarattu());
    }
    
    @Test
    public void varatuksiMuuttaminenToimii() {
        ruutu.muutaVaratuksi();
        assertEquals(true, ruutu.getOnkoVarattu());
    }
    
    @Test
    public void vapaaksiMuuttaminenToimii() {
        ruutu.muutaVaratuksi();
        ruutu.muutaVapaaksi();
        assertEquals(false, ruutu.getOnkoVarattu());
    }
}
