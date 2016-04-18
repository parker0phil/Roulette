package com.parker0phil.roulette;

import java.util.Random;

public class NumberChooser {

    private final Random source;

    public NumberChooser(Random source){
        this.source = source;
    }

    public int choose(){
        //next pseudorandom value between zero (inclusive)... and the upper bound (exclusive)
        return source.nextInt(37);
    }
}
