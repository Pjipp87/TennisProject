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
    private Team winnerTeam;


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
            System.out.println(this.teamA.getTeamName()+" hat keine Spieler");
        } else if (teamB.getPlayerList().size() == 0) {
            System.out.println(this.teamB.getTeamName()+" hat keine Spieler");
        } else {

            System.out.println("Willkommen zum heutigen Turnier zwischen " + this.teamA.getTeamName() +" und "+this.teamB.getTeamName()+"!");
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
    public ArrayList<Player> setOpponents(Team teamA, Team teamB){
        // In der Plyer Klasse ein Attribut "hasPlayed" anlegen. Wenn der Spieler schon ein Spiel gespielt hat, darf er nicht noch
        // mal spielen.
        // Abfangen, das eine erneute Auslosung zweier Kontrahenten stattfindet, nachdem alle Spieler aus einem Team entfernt wurden.

        // Exception in thread "main" java.lang.IllegalArgumentException: bound must be positive
        // at java.base/java.util.Random.nextInt(Random.java:557)
        // at classes.Match.setOpponents(Match.java:72)
        // at classes.Match.startChampionship(Match.java:90)
        // at Main.main(Main.java:22)

        ArrayList<Player> opponents = new ArrayList<>();
        Random rand = new Random();
        int randNumA = rand.nextInt(teamA.getPlayerList().size()-1);
        int randNumB = rand.nextInt(teamB.getPlayerList().size()-1);
        opponents.add(teamA.getPlayer(randNumA));
        opponents.add(teamB.getPlayer(randNumB));
        System.out.println("Die beiden nächsten Spieler: " + opponents.get(0).getFirstName() +" " +opponents.get(0).getLastName() + " - " +opponents.get(1).getFirstName()+" "+opponents.get(1).getLastName());
        return opponents;

    }


    /**
     * Starts the Championship
     */
    public void startChampionship(){
        System.out.println("Tunier startet");
/*        ArrayList<Player> actualOpponents = setOpponents(this.teamA, this.teamB);
        startSet(actualOpponents);*/

       while (teamA.getPlayerList().size() != 0 && teamB.getPlayerList().size() != 0){
            ArrayList<Player> actualOpponents = setOpponents(this.teamA, this.teamB);
            startSet(actualOpponents);

        }
        System.out.println("Tunier ist beendet");
        System.out.println("Der Gewinner ist:");
        System.out.println(teamA.getPlayerList().size() == 0 ? teamA.getTeamName() : teamB.getTeamName());
    }

    /**
     * Starts a match between two Opponents.
     * Uses Random() integers between 0 - 99 to get a winner of the set.
     * If one of the players got 6 points, he gets a Match point.
     * If one of the players got 3 Match points, he is the Winner
     * The loser would be removed from the team
     *
     * @param actualOpponents  ArrayList of two Player Objects
     */
    private void startSet(ArrayList<Player> actualOpponents){
        Random rand = new Random();
        Player p1 = actualOpponents.get(0);
        Player p2 = actualOpponents.get(1);
        System.out.println(p1.getFirstName()+" "+p1.getLastName()+"\t-\t"+p2.getFirstName()+" "+p2.getLastName());
        while (p1.getMatchPoints() <= 3 && p2.getMatchPoints() <= 3){
            int randA = rand.nextInt(100);
            int randB = rand.nextInt(100);

            if (randA <= randB){

                p1.setPoints(p1.getPoints()+1);
                if (p1.getPoints() == 6){
                    p1.setPoints(0);
                    p2.setPoints(0);
                    p1.setMatchPoints(p1.getMatchPoints()+1);
                    System.out.println();
                    if (p1.getMatchPoints() == 3){
                        teamB.removePlayer(p2);
                        p1.setMatchPoints(0);
                        break;
                    }

                }
            } else {
                p2.setPoints(p2.getPoints()+1);
                if (p2.getPoints() == 6){
                    p2.setPoints(0);
                    p1.setPoints(0);
                    p2.setMatchPoints(p2.getMatchPoints()+1);
                    System.out.println();
                    if (p2.getMatchPoints() == 3){
                        teamA.removePlayer(p1);
                        p2.setMatchPoints(0);
                        break;
                    }

                }
            }
            System.out.println("\t"+(p1.getPoints())+"\t\t\t-\t\t"+(p2.getPoints()));
        }

    }

}
