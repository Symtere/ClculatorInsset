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
public class CedricConverterIntegerToRomanServiceImplTest {

    public CedricConverterIntegerToRomanServiceImplTest() {
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
    public void AmountMultiPourcentageTest() {
        CedricConverterIntegerToRomanServiceImpl instance = new CedricConverterIntegerToRomanServiceImpl();
        
        String nbr = "60";
        String pourcent = "10";
        String[] result = instance.AmountMultiPourcentage(nbr, pourcent);
        
        String expResult[] = {"10", "54"};
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void ReducDivisePourcentageTest() {
        CedricConverterIntegerToRomanServiceImpl instance = new CedricConverterIntegerToRomanServiceImpl();
        
        String nbr = "54";
        String pourcent = "10";
        String[] result = instance.ReducDivisePourcentage(nbr, pourcent);
        
        String expResult[] = {"60", "10"};
    }
}
