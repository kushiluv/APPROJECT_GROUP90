package com.example.helloapplication;

public class Serialized_obj implements serializable {
    private static final long serialVersionUID = 20L;

    private Hero hero;
    private int coinc[];
    private int dashc[];

    public Serialized_obj(Hero hero, int[] coinc, int[] dashc) {
        this.hero = hero;
        this.coinc = coinc;
        this.dashc = dashc;
    }
}