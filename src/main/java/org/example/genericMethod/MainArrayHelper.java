package org.example.genericMethod;

public class MainArrayHelper {
    public static void main(String[] args) {
        String[] names = { "Aditya","Rifki"};
        Integer[] values = {1,2,3,4,5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
