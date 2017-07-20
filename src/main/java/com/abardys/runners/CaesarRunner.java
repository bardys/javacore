package com.abardys.runners;

import com.abardys.app.lesson10.Caesar;

/**
 * Created by anbar on 19-Jul-17.
 */
public class CaesarRunner {
    public static void main(String[] args) {
        Caesar.toEncode("Hello", 5013);
        Caesar.toDecode("rDKKN", 5013);
    }
}
