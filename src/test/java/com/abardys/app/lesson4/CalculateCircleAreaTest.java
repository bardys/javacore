package com.abardys.app.lesson4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anbar on 20-Feb-17.
 */
public class CalculateCircleAreaTest {

    @Before
    public void setUp() {
        CalculateCircleArea сalculateCircleArea = new CalculateCircleArea();
    }

    @Test
    public void radius1Test(){
        String radius = "1";
        double expRes = Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Test
    public void radius0Test() {
        String radius = "0";
        double expRes = 0.0;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Test
    public void radius2Test() {
        String radius = "2";
        double expRes = 4 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Test
    public void radius100Test() {
        String radius = "100";
        double expRes = 10000 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Test
    public void radius01Test() {
        String radius = "0.1";
        double expRes = 0.01 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Test
    public void radiusMinus01Test() {
        String radius = "-0.1";
        double expRes = 0.01 * Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

    @Test
    public void radiusMinus1Test() {
        String radius = "-1";
        double expRes = Math.PI;
        Assert.assertEquals(expRes, CalculateCircleArea.calculate(radius), 0);
    }

}
