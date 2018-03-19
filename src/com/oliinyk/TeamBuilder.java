package com.oliinyk;

public class TeamBuilder {

    public Team prepareDeffence() {
        Team team = new Team();
        team.addPlayer(new BackDefender());
        team.addPlayer(new CentralDefender());
        return team;
    }

    public Team prepareAttack(){
        Team team = new Team();
        team.addPlayer(new CentralForward());
        team.addPlayer(new FlankForward());
        return team;
    }
}
