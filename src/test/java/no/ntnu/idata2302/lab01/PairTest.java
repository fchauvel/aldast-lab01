package no.ntnu.idata2302.lab01;

import static org.junit.Assert.*;

import org.junit.Test;


public class PairTest
{

    @Test
    public void withZero() {
        var pairs = Pair.findAllPairs(0);
        assertEquals(1, pairs.size());
        assertTrue(pairs.contains(new Pair(0,0)));
    }

    @Test
    public void withTwo() {
        var pairs = Pair.findAllPairs(2);
        assertEquals(2, pairs.size());
        assertTrue(pairs.contains(new Pair(0,2)));
        assertTrue(pairs.contains(new Pair(1,1)));
    }

    @Test
    public void withThree() {
        var pairs = Pair.findAllPairs(3);
        assertEquals(2, pairs.size());
        assertTrue(pairs.contains(new Pair(0,3)));
        assertTrue(pairs.contains(new Pair(1,2)));
    }

    @Test
    public void withFour() {
        var pairs = Pair.findAllPairs(4);
        assertEquals(3, pairs.size());
        assertTrue(pairs.contains(new Pair(0,4)));
        assertTrue(pairs.contains(new Pair(1,3)));
        assertTrue(pairs.contains(new Pair(2,2)));
    }

    @Test
    public void withFive() {
        var pairs = Pair.findAllPairs(5);
        assertEquals(3, pairs.size());
        assertTrue(pairs.contains(new Pair(0,5)));
        assertTrue(pairs.contains(new Pair(1,4)));
        assertTrue(pairs.contains(new Pair(2,3)));
    }

    @Test
    public void withSiz() {
        var pairs = Pair.findAllPairs(6);
        assertEquals(4, pairs.size());
        assertTrue(pairs.contains(new Pair(0,6)));
        assertTrue(pairs.contains(new Pair(1,5)));
        assertTrue(pairs.contains(new Pair(2,4)));
        assertTrue(pairs.contains(new Pair(3,3)));
    }

    @Test
    public void rejectNegativeNumbers() {
        try {
            Pair.findAllPairs(-5);
            fail("Should have thrown an 'IllegalArgumentException'.");

        } catch (Exception error) {
            // Pass, all is good.

        }
    }

    @Test
    public void testPairEquality() {
        assertEquals(new Pair(4,3), new Pair(3, 4));
        assertEquals(new Pair(4, 3).hashCode(),
                     new Pair(3, 4).hashCode());
        assertNotEquals(new Pair(3,7).hashCode(),
                     new Pair(6, 4).hashCode());
    }

}
