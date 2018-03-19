package com.oliinyk;

public abstract class Forward implements FootballPlayer {


    @Override
    public abstract String name();

    @Override
    public Manning manning() {
        return new ForwardCoach();
    }

    @Override
    public abstract float price();
}
