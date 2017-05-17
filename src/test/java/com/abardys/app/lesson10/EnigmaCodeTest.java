package com.abardys.app.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anbar on 16-May-17.
 */
public class EnigmaCodeTest {
    @Before
    public void setUp() {
        EnigmaCode enigmaCode = new EnigmaCode();
    }

    @Test
    public void first() {
        String s = "Hello world";
        String expRes = "ihVVMmcM8Vg";
        Assert.assertEquals(expRes, EnigmaCode.encode(s));
    }


    @Test
    public void second() {
        String s = "ihVVMmcM8Vg";
        String expRes = "Hello world";
        Assert.assertEquals(expRes, EnigmaCode.decode(s));
    }


    @Test
    public void third() {
        String s = "Hello world";
        String expRes = "Hello world";
        Assert.assertEquals(expRes, EnigmaCode.decode(EnigmaCode.encode(s)));
    }
}

