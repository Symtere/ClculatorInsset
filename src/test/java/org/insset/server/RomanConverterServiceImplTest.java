/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class RomanConverterServiceImplTest {

    public RomanConverterServiceImplTest() {
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

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void convertDateYearsTest() {
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        
        String str = "28/02/1997";
        String expResult = "XXVIII/II/MCMXCVII";
        String result = instance.convertDateYears(str);

        assertEquals(expResult, result);
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void convertRomanToArabeTest() {
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        
        String str = "XXVIII";
        String expResult = "28";
        String result = instance.convertRomanToArabe(str);

        assertEquals(expResult, result);
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void convertArabeToRomanTest() {
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        
        Integer n = 28;
        String expResult = "XXVIII";
        String result = instance.convertArabeToRoman(n);

        assertEquals(expResult, result);
    }
}
