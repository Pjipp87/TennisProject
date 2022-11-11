package classes;


public class Match {
    private final Team teamA;
    private final Team teamB;


    /**
     * Constructor to create a Match-Object
     * @param teamA  the first Team for the match
     * @param teamB  the second Team for the match
     */
    public Match(Team teamA, Team teamB){
        this.teamA = teamA;
        this.teamB = teamB;
    }


    /**
     * Prints all players of both teams which have joined the Championship ;)
     *
     */
    public void printTeamsFromMatchClass(){
        teamA.printTeam();
        System.out.println();
        teamB.printTeam();
    }
}
