package no.ntnu.idata2302.lab01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import static no.ntnu.idata2302.lab01.Triangle.*;


public class TriangleTest
{


    @Test
    public void withHeightOfOne () {
        StringBuffer buffer = new StringBuffer();
        createTriangle(1, buffer);

        assertEquals("X\n", buffer.toString());
    }


    @Test
    public void withHeightOfTwo () {
        StringBuffer buffer = new StringBuffer();
        createTriangle(2, buffer);

        assertEquals(" X\nXXX\n", buffer.toString());
    }

    @Test
    public void withHeightOfThree () {
        StringBuffer buffer = new StringBuffer();
        createTriangle(3, buffer);

        assertEquals("  X\n XXX\nXXXXX\n", buffer.toString());
    }

    @Test
    public void withHeightOfFour () {
        StringBuffer buffer = new StringBuffer();
        createTriangle(4, buffer);

        assertEquals("   X\n  XXX\n XXXXX\nXXXXXXX\n", buffer.toString());
    }

    @Test
    public void rejectNegativeHeight() {
        try {
            createTriangle(-2, new StringBuffer());
            fail("Should have detected negative height.");

        } catch (Exception error) {
            // OK

        }
    }

    @Test
    public void rejectZeroHeight() {
        try {
            createTriangle(0, new StringBuffer());
            fail("Should have detected zero height.");

        } catch (Exception error) {
            // OK

        }
    }



}
