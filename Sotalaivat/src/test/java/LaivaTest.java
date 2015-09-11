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
public class LaivaTest {

    Laiva laiva;

    public LaivaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void lentotukialuksenNimenMaaritysToimii() {
        laiva = new Laiva(4);
        assertEquals("Lentotukialus", laiva.getAlustyyppi());
    }
    
    @Test
    public void risteilijanNimenMaaritysToimii() {
        laiva = new Laiva(3);
        assertEquals("Risteilijä", laiva.getAlustyyppi());
    }
    
    @Test
    public void havittajanNimenMaaritysToimii() {
        laiva = new Laiva(2);
        assertEquals("Hävittäjä", laiva.getAlustyyppi());
    }
    
    @Test
    public void sukellusveneenNimenMaaritysToimii() {
        laiva = new Laiva(1);
        assertEquals("Sukellusvene", laiva.getAlustyyppi());
    }

}
