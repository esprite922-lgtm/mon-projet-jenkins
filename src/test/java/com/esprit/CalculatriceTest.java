package com.esprit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTest {
    
    private Calculatrice calc = new Calculatrice();
    
    @Test
    public void testAdditionner() {
        assertEquals(5, calc.additionner(2, 3));
        assertEquals(0, calc.additionner(-1, 1));
        assertEquals(-5, calc.additionner(-2, -3));
    }
    
    @Test
    public void testSoustraire() {
        assertEquals(2, calc.soustraire(5, 3));
        assertEquals(-2, calc.soustraire(3, 5));
    }
    
    @Test
    public void testMultiplier() {
        assertEquals(15, calc.multiplier(3, 5));
        assertEquals(0, calc.multiplier(0, 5));
    }
    
    @Test
    public void testDiviser() {
        assertEquals(2, calc.diviser(10, 5));
        assertEquals(3, calc.diviser(9, 3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDiviserParZero() {
        calc.diviser(10, 0);
    }
}
