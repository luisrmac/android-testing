package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Before
    public void setUp() {
        // here initialize everything your test cases are going to need
        System.out.println("Executed");
    }

    ////////////////////////////////////////

    @Test
    public void addition_isCorrect() {
        /// initialize things here
        assertEquals(6, 3 + 3);
    }

    @Test
    public void addition_isCorrect2() {
        assertEquals(4, 2 + 2);
    }

    ////////////////////////////////////////

    @After
    public void tearDown() {
        /// clean up
    }

}