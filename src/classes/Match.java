package classes;

import java.util.ArrayList;
import java.util.Random;

/**
 * Match Class for the WBS Tennis Project.
 * This is where the magic happens.
 * @author pascaljipp
 *
 * @version 1.0
 */
public class Match {
    private final Team teamA;
    private final Team teamB;


    /**
     * Constructor to create a Match-Object.
     * Checks if both teams contain Player-Objects.
     * Prints a welcome message to the console.
     * @param teamA  the first Team for the match
     * @param teamB  the second Team for the match
     */
    public Match(Team teamA, Team teamB){
        this.teamA = teamA;
        this.teamB = teamB;
        if (teamA.getPlayerList().size() == 0){
            System.out.println(this.teamA.teamName+" hat keine Spieler");
        } else if (teamB.getPlayerList().size() == 0) {
            System.out.println(this.teamB.teamName+" hat keine Spieler");
        } else {

            System.out.println("Willkommen zum heutigen Turnier zwischen " + this.teamA.teamName +" und "+this.teamB.teamName+"!");
        }

    }


    /**
     * Prints all players of both teams which have joined the Championship ;)
     */
    public void printTeamsFromMatchClass(){
        teamA.printTeam();
        System.out.println();
        teamB.printTeam();
    }


    /**
     * Returns a pair of player who play against each other.
     * Prints information about the next pair to the console.
     * @param teamA first team so get a Player
     * @param teamB second team to get a Player
     * @return a pair of two random Player
     */
    public ArrayList<Player> setOpponents(ArrayList<Player> teamA, ArrayList<Player> teamB){
        ArrayList<Player> opponents = new ArrayList<>();
        Random rand = new Random();
        int randNumA = rand.nextInt(0,teamA.size()-1);
        int randNumB = rand.nextInt(0, teamB.size()-1);
        opponents.add(teamA.get(randNumA));
        opponents.add(teamB.get(randNumB));
        System.out.println("Die beiden nächsten Spieler: " + opponents.get(0).getFirstName() +" " +opponents.get(0).getLastName() + " - " +opponents.get(1).getFirstName()+" "+opponents.get(1).getLastName());
        return opponents;

    }
}
