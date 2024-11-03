package com.hyperdondon.binder.cmdline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommandLine {

    public static void Initialize() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");

                String command = scanner.nextLine();
                List<String> args = new ArrayList<>(Arrays.asList(command.split(" ")));

                switch (args.get(0)) {
                    default:
                        System.out.println("Unknown command");
                        break;
                    case "stop":
                        System.out.println("Stopping, thanks for using Binder!");
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



