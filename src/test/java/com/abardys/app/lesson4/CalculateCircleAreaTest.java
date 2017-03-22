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
public class CalculateCircleAreaTest {
    static final String RESOURCES_PATH = "src/test/java/resources/";

    @Before
    public void setUp() {
        CalculateCircleArea сalculateCircleArea = new CalculateCircleArea();
    }

    @FileParameters(RESOURCES_PATH + "CalculateCircleArea_parameters.csv")
    @Test
    public void radius1Test(String radius, double expRes, boolean isTrue){
        Assert.assertEquals(isTrue, expRes == CalculateCircleArea.calculate(radius));
    }

    @Ignore("Used as parameter")
    @Test
    public void radius0Test() {
        String radius = "0";
        double expRes = 0.0;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @FileParameters(RESOURCES_PATH + "CalculateCircleArea_parameters2.csv")
    @Test
    public void radius2Test(String radius, double expRes, boolean isTrue) {
        Assert.assertEquals(isTrue, expRes*Math.PI == CalculateCircleArea.calculate(radius));
    }

    @Ignore("Used as parameter")
    @Test
    public void radius100Test() {
        String radius = "100";
        double expRes = 10000 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Ignore("Used as parameter")
    @Test
    public void radius01Test() {
        String radius = "0.1";
        double expRes = 0.01 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Ignore("Used as parameter")
    @Test
    public void radiusMinus01Test() {
        String radius = "-0.1";
        double expRes = 0.01 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Ignore("Used as parameter")
    @Test
    public void radiusMinus1Test() {
        String radius = "-1";
        double expRes = Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

}
