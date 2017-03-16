package com.abardys.app.utils;

import com.abardys.app.NarrowingCasting;
import com.abardys.runners.CastingRunner;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anbar on 16-Mar-17.
 */
public class NarrowingCastingTest {



    @Test
    public void firstTest() {
        float float1 = 0.0f;
        double double1 = 3.14159d;
        float expRes = 3.14159f;
        Assert.assertEquals(expRes, NarrowingCasting.narrowing(float1, double1));
    }
}