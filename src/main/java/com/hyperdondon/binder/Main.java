package com.hyperdondon.binder;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Binder, a Java app manager.");
            Thread.currentThread().join();
        }
        catch(Exception e) {
            System.out.println("Can't join threads?" + e);
        }
    }
}