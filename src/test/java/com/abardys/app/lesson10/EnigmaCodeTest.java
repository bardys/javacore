package com.abardys.app.lesson10;

import com.abardys.app.lesson4.СompareCircleArea;
import com.abardys.lesson10.EnigmaCode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anbar on 16-May-17.
 */
public class EnigmaCodeTest {

    @Test
    public void first() {
        String s = "cab";
        String expRes = "def";
        Assert.assertEquals(expRes, EnigmaCode.encode(s));
    }


    @Test
    public void second() {
        String s = "def";
        String expRes = "cab";
        Assert.assertEquals(expRes, EnigmaCode.decode(s));
    }


    @Test
    public void third() {
        String s = "cab";
        String expRes = "cab";
        Assert.assertEquals(expRes, EnigmaCode.decode(EnigmaCode.encode(s)));
    }
}

