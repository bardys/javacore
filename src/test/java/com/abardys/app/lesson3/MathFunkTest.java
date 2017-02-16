package com.abardys.app.lesson3;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anbar on 09-Feb-17.
 */
public class MathFunkTest {
    @Test
    public void multiplyTest() {
        int a = 2, b = 3, expRes = 6;
        Assert.assertEquals(expRes, MathFunk.multiply(a, b));
    }
        @Test
        public void multiplyFailedTest(){
                int a = 2, b = 3, expRes = 7;
                Assert.assertEquals(expRes, MathFunk.multiply(a, b));
    }
}
