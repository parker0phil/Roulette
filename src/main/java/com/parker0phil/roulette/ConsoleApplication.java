package com.parker0phil.roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Clock;

public class ConsoleApplication {

    public static void main(String args[]) throws NoSuchAlgorithmException, InterruptedException {
        Delayer delayer = new Delayer(Clock.systemDefaultZone(), 20);
        while (!delayer.finished()) {
            Thread.sleep(50);
        }
        System.out.println(new NumberChooser(SecureRandom.getInstanceStrong()).choose());
    }
}
