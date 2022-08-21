package no.ntnu.idata2302.lab01;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class MinimumTest
{
    @Test
    public void findMinimumhouldRejectEmptyArrays() {
        try {
            Minimum.findMinimum(new int[]{});
            fail("Should have thrown an 'IllegalArgumentException'.");

        } catch (Exception error) {
            // Pass, all is good.

        }
    }


    @Test
    public void findMinimumShouldFindMinimumAtLast() {
        int minimum = Minimum.findMinimum(new int[]{4,3,2,1});
        assertEquals(1, minimum);
    }


    @Test
    public void findMinimumShouldFindMinimumAtFirst() {
        int minimum = Minimum.findMinimum(new int[]{1,2,3,4});
        assertEquals(1, minimum);
    }


    @Test
    public void findMinimumShouldFindMinimumInTheMiddle() {
        int minimum = Minimum.findMinimum(new int[]{3,2,1,2,3});
        assertEquals(1, minimum);
    }

}
