package com.oliinyk;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<FootballPlayer> players = new ArrayList<FootballPlayer>();

    public void addPlayer(FootballPlayer player) {
        players.add(player);
    }

    public float getFullTeamPrice(){
        float price = 0;

        for (FootballPlayer player: players) {
            price += player.price();
        }
        return price;
    }

    public void showPlayers(){

        for (FootballPlayer player: players) {
            System.out.println("Player " + player.name());
            System.out.println(", Manning " + player.manning().complete());
            System.out.println(", Price " + player.price());
        }
    }
}
