package com.abardys.app.lesson10;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anbar on 17-May-17.
 */
public class CaesarTest {
    @Before
    public void setUp() {
        Caesar caesar = new Caesar();
    }

@Test
    public void first(){
    String s = "Hello world";
    int n = 1;
    String expRes = "Ifmmp0xpsme";
    Assert.assertEquals(expRes, Caesar.toEncode(s, n));
}
}
