package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCreatorTest {

    private GradeCreator convertor;

    @Before
    public void setUp() throws Exception {
        convertor = new GradeCreator();
    }

    @Test
    public void test1() {
        String expected = "GOOD";
        String actual = convertor.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "inValid";
        String actual = convertor.convert(1000);
        assertEquals(expected, actual);
    }
}