package com.abardys.app.lesson3;
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
    static final String RESOURCES_PATH = "src/test/java/resources/";


    @Before
    public void setUp() {
        mathFunk = new MathFunk();
        int1++;
    }

    @FileParameters(RESOURCES_PATH + "multiply_parameters.csv")
    @Test
    public void multiplyTest(int a, int b, int expRes, boolean isTrue) {
        Assert.assertEquals(isTrue, expRes == MathFunk.multiply(a, b));
    }

    @FileParameters(RESOURCES_PATH + "multiply_parameters2.csv")
    @Test
    public void multiplyNotEqualsTest(int a, int b, int expRes) {
                Assert.assertNotEquals(expRes, MathFunk.multiply(a, b));
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Count of executed @Before is " + int1);
    }


}
