package com.abardys.app.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anbar on 20-Feb-17.
 */
public class CompareCircleAreaTest {

    @Test
    public void FirstBigger21Test() {
        double radius1 = 2;
        double radius2 = 1;
        int expRes = 1;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void SecondBigger12Test() {
        double radius1 = 1;
        double radius2 = 2;
        int expRes = 2;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void Equals22Test() {
        double radius1 = 2;
        double radius2 = 2;
        int expRes = 3;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void Minus12Test() {
        double radius1 = -1;
        double radius2 = -2;
        int expRes = 2;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void FirstBigger0201Test() {
        double radius1 = 0.2;
        double radius2 = 0.1;
        int expRes = 1;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void SecondBigger0102Test() {
        double radius1 = 0.1;
        double radius2 = 0.2;
        int expRes = 2;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void Equals0202Test() {
        double radius1 = 0.2;
        double radius2 = 0.2;
        int expRes = 3;
        Assert.assertEquals(expRes, СompareCircleArea.calculateBigger(radius1, radius2));
    }
}
