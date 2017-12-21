package com.abardys.app.lesson4;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by anbar on 20-Feb-17.
 */
@RunWith(JUnitParamsRunner.class)
public class CompareCircleAreaTest {
    static final String RESOURCES_PATH = "src/test/java/resources/";

    @Before
    public void setUp() {
        CompareCircleArea compareCircleArea = new CompareCircleArea();
    }

    @FileParameters(RESOURCES_PATH + "СompareCircleArea_parameters.csv")
    @Test
    public void FirstBigger21Test(double radius1, double radius2, int expRes, boolean isTrue) {
        Assert.assertEquals(isTrue, expRes == CompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Ignore("Used as parameter")
    @Test
    public void SecondBigger12Test() {
        double radius1 = 1;
        double radius2 = 2;
        int expRes = 2;
        Assert.assertEquals(expRes, CompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Ignore("Used as parameter")
    @Test
    public void Equals22Test() {
        double radius1 = 2;
        double radius2 = 2;
        int expRes = 3;
        Assert.assertEquals(expRes, CompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Ignore("Used as parameter")
    @Test
    public void Minus12Test() {
        double radius1 = -1;
        double radius2 = -2;
        int expRes = 2;
        Assert.assertEquals(expRes, CompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Ignore("Used as parameter")
    @Test
    public void FirstBigger0201Test() {
        double radius1 = 0.2;
        double radius2 = 0.1;
        int expRes = 1;
        Assert.assertEquals(expRes, CompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Ignore("Used as parameter")
    @Test
    public void SecondBigger0102Test() {
        double radius1 = 0.1;
        double radius2 = 0.2;
        int expRes = 2;
        Assert.assertEquals(expRes, CompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Ignore("Used as parameter")
    @Test
    public void Equals0202Test() {
        double radius1 = 0.2;
        double radius2 = 0.2;
        int expRes = 3;
        Assert.assertEquals(expRes, CompareCircleArea.calculateBigger(radius1, radius2));
    }
}
