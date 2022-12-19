package org.example.genericMethod;

public class ArrayHelper {

    public static <T> int count(T[] array) {
        return array.length;
    }
}
