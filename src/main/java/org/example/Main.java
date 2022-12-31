package org.example;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        HashTest hashTest = new HashTest();
        hashTest.put();
        //hashTest.get();
        //hashTest.forEach();
        hashTest.resizeHash();
        hashTest.testToString();
        //hashTest.toString();
        //hashTest.insert();
        //hashTest.sizeRecorder();
        //hashTest.remove();
        //hashTest.testToString();
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время: " + finish);
    }
}