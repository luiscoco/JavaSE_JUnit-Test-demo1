package com.example;

// import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(2, 3);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSubtract() {
        App app = new App();
        int result = app.subtract(5, 3);
        Assert.assertEquals(2, result);
    }
}
