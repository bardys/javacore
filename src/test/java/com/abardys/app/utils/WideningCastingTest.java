package com.abardys.app.utils;

import com.abardys.app.NarrowingCasting;
import com.abardys.app.WideningCasting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anbar on 17-Mar-17.
 */
public class WideningCastingTest {

    @Before
    public void setUp() {
        WideningCasting wideningCasting = new WideningCasting();
    }



    @Test
    public void firstTest() {
        int int1 = 127;
        long long1 = 0L;
        float float1 = 0.0f;
        double double1 = 0.0d;
        double expRes = 127.0;
        Assert.assertEquals(expRes, WideningCasting.widening(int1, long1, float1, double1), 0);
    }
}
