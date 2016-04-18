package com.parker0phil.roulette;

import java.util.Random;

public class NumberChooser {

    private final Random source;

    public NumberChooser(Random source){
        this.source = source;
    }

    public int choose(){
        //the next pseudorandom, uniformly distributed {@code int} value between zero (inclusive)
        return source.nextInt(37);
    }
}
