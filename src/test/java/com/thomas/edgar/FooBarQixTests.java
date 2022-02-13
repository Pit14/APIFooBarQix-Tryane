package com.thomas.edgar;
import com.thomas.edgar.foobarqix.FooBarQix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class FooBarQixTests {

    @Test
    public void testCompute1() throws Exception {
        assertEquals("1 => 1", "1", FooBarQix.compute("1"));
    }

    @Test
    public void testCompute2() throws Exception {
        assertEquals("2  => 2", "2", FooBarQix.compute("2"));
    }

    @Test
    public void testCompute3() throws Exception {
        assertEquals("3  => FooFoo", "FooFoo", FooBarQix.compute("3"));
    }

    @Test
    public void testCompute4() throws Exception {
        assertEquals("4  => 4", "4", FooBarQix.compute("4"));
    }

    @Test
    public void testCompute5() throws Exception {
        assertEquals("5  => BarBar", "BarBar", FooBarQix.compute("5"));
    }

    @Test
    public void testCompute6() throws Exception {
        assertEquals("6  => Foo", "Foo", FooBarQix.compute("6"));
    }

    @Test
    public void testCompute7() throws Exception {
        assertEquals("7  => QixQix", "QixQix", FooBarQix.compute("7"));
    }

    @Test
    public void testCompute8() throws Exception {
        assertEquals("8  => 8", "8", FooBarQix.compute("8"));
    }

    @Test
    public void testCompute9() throws Exception {
        assertEquals("9  => Foo", "Foo", FooBarQix.compute("9"));
    }

    @Test
    public void testCompute10() throws Exception {
        assertEquals("10 => Bar*", "Bar*", FooBarQix.compute("10"));
    }

    @Test
    public void testCompute13() throws Exception {
        assertEquals("13 => Foo", "Foo", FooBarQix.compute("13"));
    }

    @Test
    public void testCompute15() throws Exception {
        assertEquals("15 => FooBarBar", "FooBarBar", FooBarQix.compute("15"));
    }

    @Test
    public void testCompute21() throws Exception {
        assertEquals("21 => FooQix", "FooQix", FooBarQix.compute("21"));
    }

    @Test
    public void testCompute33() throws Exception {
        assertEquals("33 => FooFooFoo", "FooFooFoo", FooBarQix.compute("33"));
    }

    @Test
    public void testCompute51() throws Exception {
        assertEquals("51 => FooBar", "FooBar", FooBarQix.compute("51"));
    }

    @Test
    public void testCompute53() throws Exception {
        assertEquals("53 => BarFoo", "BarFoo", FooBarQix.compute("53"));
    }

    @Test
    public void testCompute101() throws Exception {
        assertEquals("101   => 1*1", "1*1", FooBarQix.compute("101"));
    }

    @Test
    public void testCompute303() throws Exception {
        assertEquals("303   => FooFoo*Foo", "FooFoo*Foo", FooBarQix.compute("303"));
    }

    @Test
    public void testCompute105() throws Exception {
        assertEquals("105   => FooBarQix*Bar", "FooBarQix*Bar", FooBarQix.compute("105"));
    }

    @Test
    public void testCompute10101() throws Exception {
        assertEquals("10101 => FooQix**", "FooQix**", FooBarQix.compute("10101"));
    }

    @Test
    public void testCompute10101000045454() throws Exception {
        assertEquals("10101000045454 => ******BarBar", "******BarBar", FooBarQix.compute("10101000045454"));
    }

    @Test
    public void testIsNumericMax() throws Exception{
        assertTrue(FooBarQix.isNumeric("9223372036854775807"));
    }

    @Test
    public void testIsNumericOutOfRange() throws Exception{
        assertFalse(FooBarQix.isNumeric("9223372036854775808"));
    }


}
