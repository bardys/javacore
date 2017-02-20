package com.abardys.app.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anbar on 20-Feb-17.
 */
public class TriagleTest {

    @Test
    public void rightAngled345Test() {
        Triangle triangle = new Triangle();
        int a = 3;
        int b = 4;
        int c = 5;
        boolean expRes = true;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }

    @Test
    public void notRightAngled123Test() {
        Triangle triangle = new Triangle();
        int a = 1;
        int b = 2;
        int c = 3;
        boolean expRes = false;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }

    @Test
    public void notRightAngled045Test() {
        Triangle triangle = new Triangle();
        int a = 0;
        int b = 4;
        int c = 5;
        boolean expRes = false;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }

    @Test
    public void notRightAngled000Test() {
        Triangle triangle = new Triangle();
        int a = 0;
        int b = 0;
        int c = 0;
        boolean expRes = false;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }

    @Test
    public void notRightAngledMinus123Test() {
        Triangle triangle = new Triangle();
        int a = -1;
        int b = -2;
        int c = -3;
        boolean expRes = false;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }

    @Test
    public void notRightAngledMinus345Test() {
        Triangle triangle = new Triangle();
        int a = -3;
        int b = -4;
        int c = -5;
        boolean expRes = false;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }

    @Test
    public void rightAngled300400500Test() {
        Triangle triangle = new Triangle();
        int a = 300;
        int b = 400;
        int c = 500;
        boolean expRes = true;
        Assert.assertEquals(expRes, triangle.isTriangle(a, b, c));
    }
}
