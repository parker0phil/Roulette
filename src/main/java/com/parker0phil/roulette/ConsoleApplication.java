package com.parker0phil.roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Clock;

public class ConsoleApplication {

    public static void main(String args[]) throws NoSuchAlgorithmException, InterruptedException {
        NumberChooser chooser = new NumberChooser(SecureRandom.getInstanceStrong());
        Delayer delayer = new Delayer(Clock.systemDefaultZone(), 20);
        RouletteWheel wheel = new RouletteWheel(chooser, delayer);
        System.out.println(wheel.spin());
    }
}
