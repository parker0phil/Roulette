package com.parker0phil.roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ConsoleApplication {

    public static void main(String args[]) throws NoSuchAlgorithmException {
        System.out.println(new NumberChooser(SecureRandom.getInstanceStrong()).choose());
    }
}
