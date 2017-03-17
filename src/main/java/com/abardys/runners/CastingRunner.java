package com.abardys.runners;

import com.abardys.app.NarrowingCasting;
import com.abardys.app.WideningCasting;

/**
 * Created by anbar on 02-Feb-17.
 */
public class CastingRunner {
    public static void main(String[] args) {
        WideningCasting casting1 = new WideningCasting();
        casting1.widening(127, 0, 0, 0);

        NarrowingCasting narrowing1 = new NarrowingCasting();
        narrowing1.narrowing(0.0f, 3.14159f);
    }
}
