package org.example.genericType;

public class MainPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>("Mohammad",20);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        Pair<String, Integer> pair2 = new Pair<String, Integer>("Aditya",15);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());


        Pair<String, Integer> pair3 = new Pair<String, Integer>("Rifki",10);
        System.out.println(pair3.getFirst());
        System.out.println(pair3.getSecond());

    }
}
