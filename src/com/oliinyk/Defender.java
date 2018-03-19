package com.oliinyk;

public abstract class Defender implements FootballPlayer {
    @Override
    public abstract String name();

    @Override
    public Manning manning() {
        return new DefenderCoach();
    }

    @Override
    public abstract float price();
}
