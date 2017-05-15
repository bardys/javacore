package com.abardys.lesson9;

/**
 * Created by anbar on 25-Apr-17.
 */
public class PrimitiveToString {
    public static void main(String[] args) {

        int int1 = 1;
        String stringInt = String.valueOf(int1);
        System.out.println(stringInt);

        double double1 = 1.0;
        String stringDouble = String.valueOf(double1);
        System.out.println(stringDouble);

        long long1 = 1000;
        String stringLong = String.valueOf(long1);
        System.out.println(stringLong);

        boolean bool1 = true;
        String stringBool = String.valueOf(bool1);
        System.out.println(stringBool);

        String toInt = "2";
        int intString = Integer.valueOf(toInt);
        System.out.println(intString);

        String toDouble = "2.0";
        double doubleString = Double.valueOf(toDouble);
        System.out.println(doubleString);

        String toLong = "2000";
        long longString = Long.valueOf(toLong);
        System.out.println(longString);

        String toBoolean = "false";
        boolean booleanString = Boolean.valueOf(toBoolean);
        System.out.println(booleanString);

    }
}
