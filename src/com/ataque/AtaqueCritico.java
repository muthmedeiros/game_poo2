package com.ataque;

import java.util.Random;

public class AtaqueCritico {
    public static int critico(int danoAtual) {
        int rand = new Random().nextInt(101);

        if (rand < 15) {
            return danoAtual * 2;
        } else if (rand == 100) {
            return danoAtual * 5;
        }

        return danoAtual;
    }
}
