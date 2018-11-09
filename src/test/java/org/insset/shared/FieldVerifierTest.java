/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

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
public class FieldVerifierTest {

    public FieldVerifierTest() {
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
    public void isValidNameTest() {
        String name = "cedric";
        boolean result = FieldVerifier.isValidName(name);

        assertEquals(true, result);
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void isValidDecimalTest() {
        Integer n = 1;
        boolean result = FieldVerifier.isValidDecimal(n);

        assertEquals(true, result);
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void isValidRomanTest() {
        String nbr = "XXVIII";
        boolean result = FieldVerifier.isValidRoman(nbr);

        assertEquals(true, result);
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void isValidDateTest() {
        String date = "28/02/1997";
        boolean result = FieldVerifier.isValidDate(date);

        assertEquals(true, result);
    }
}
