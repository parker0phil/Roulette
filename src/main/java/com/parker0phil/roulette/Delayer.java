package com.parker0phil.roulette;

import java.time.Clock;

public class Delayer {

    private final Clock clock;
    private final int seconds;
    private final long start;

    public Delayer(Clock clock, int seconds) {

        this.clock = clock;
        this.seconds = seconds;
        this.start = clock.millis();
    }

    public boolean finished() {
        long now = clock.millis();
        return now - start >= seconds * 1000;
    }
}
