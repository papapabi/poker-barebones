package com.pokergame.backend;

/**
 *
 * @author Joshua Isaac
 */
public class Combination {

    private final double cashMultiplier;
    private final String name;

    public Combination(double cashMultiplier, String name) {
        this.cashMultiplier = cashMultiplier;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public double getCashMultiplier() {
        return this.cashMultiplier;
    }
} // end inner class Combination
