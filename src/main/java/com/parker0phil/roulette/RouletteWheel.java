package com.parker0phil.roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Clock;

public class RouletteWheel {


    private final NumberChooser chooser;
    private final Delayer delayer;

    public RouletteWheel(NumberChooser chooser, Delayer delayer){

        this.chooser = chooser;
        this.delayer = delayer;
    }

    public int spin() throws InterruptedException, NoSuchAlgorithmException {
        while (!delayer.finished()) {
            Thread.sleep(50);
        }
        return chooser.choose();
    }

}
