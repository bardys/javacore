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
    int n = 20;
    String expRes = "by447JF7A4x";
    Assert.assertEquals(expRes, Caesar.toEncode(s, n));
}
    @Test
    public void second(){
        String s = "by447JF7A4x";
        int n = 20;
        String expRes = "Hello world";
        Assert.assertEquals(expRes, Caesar.toDecode(s, n));
    }


}
