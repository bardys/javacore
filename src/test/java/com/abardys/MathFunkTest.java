package com.abardys;
import com.abardys.app.lesson3.MathFunk;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by anbar on 09-Feb-17.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFunkTest {
    MathFunk mathFunk;

    static int int1 = 0;
    static final String RESOURCES_PATH = "src/test/resources/";


    @Before
    public void setUp() {
        mathFunk = new MathFunk();
        int1++;
    }

    @FileParameters(RESOURCES_PATH + "multiply_parameters.csv")
    @Test
    public void multiplyTest(int a, int b, int expRes) {
        Assert.assertEquals(expRes, MathFunk.multiply(a, b));
    }

    @Test
    public void multiplyNotEqualsTest() {
        int a = 2, b = 3, expRes = 7;
        Assert.assertNotEquals(expRes, MathFunk.multiply(a, b));
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Count of executed @Before is " + int1);
    }


}
