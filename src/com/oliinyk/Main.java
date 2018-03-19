package com.oliinyk;

public class Main {

    public static void main(String[] args) {
	    TeamBuilder teamBuilder = new TeamBuilder();

	    Team defence = teamBuilder.prepareDeffence();
        System.out.println("Defence");
        defence.showPlayers();
        System.out.println("Total defenders price " + defence.getFullTeamPrice());

        Team attack = teamBuilder.prepareAttack();
        System.out.println("Attack");
        attack.showPlayers();
        System.out.println("Total attackers price " + attack.getFullTeamPrice());

    }
}
