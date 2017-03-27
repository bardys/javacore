package com.abardys.app.utils.convertors;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by anbar on 27-Mar-17.
 */
@RunWith(JUnitParamsRunner.class)
public class FloatToCharTest {
    static final String RESOURCES_PATH = "src/test/java/resources/";

    @Before
    public void setUp() {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
    }

    @FileParameters(RESOURCES_PATH + "FloatToChar_parameters.csv")
    @Test
    public void floatToCharTest(float float1, char expRes, boolean isTrue) {
        Assert.assertEquals(isTrue, expRes == PrimitiveConvertor.floatToChar(float1));
    }
}
