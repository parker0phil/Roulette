package com.parker0phil.roulette;

import java.io.Console;

public class ConsoleApplication {

    public static void main(String args[]) {
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }


        System.out.println("Done.");

    }
}
