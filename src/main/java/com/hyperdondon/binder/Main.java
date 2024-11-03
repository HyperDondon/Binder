package com.hyperdondon.binder;

import com.hyperdondon.binder.cmdline.CommandLine;
import com.hyperdondon.binder.config.Config;

public class Main {
    public static String WorkDir = System.getProperty("user.dir");

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Binder, a Java app manager.");
            Config.Initilize();
            CommandLine.Initialize();
            Thread.currentThread().join();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
