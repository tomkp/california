package com.tomkp.california;

import junit.framework.TestSuite;


public class InternalSuite extends CaliforniaSuiteX {

    public static TestSuite suite() {

        return generateSuite("Internal Tests", "com.tomkp", ".spec", "specs");

    }

}