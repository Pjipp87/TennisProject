import classes.Match;
import classes.Player;
import classes.Team;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");

        team1.addToTeam(new Player("Hugo", "Meier"));
        team1.addToTeam(new Player("Susi", "Sorglos"));
        team1.addToTeam(new Player("Fred", "Feuerstein"));
        team1.addToTeam(new Player("Marie", "Müller"));


        team2.addToTeam(new Player("Fritz", "Como"));
        team2.addToTeam(new Player("Walter", "Reindl"));
        team2.addToTeam(new Player("Sigrid", "Volk"));
        team2.addToTeam(new Player("Annemarie", "Bienemann"));

        Match tennisMatch = new Match(team1, team2);
        tennisMatch.runChampionship(team1, team2);







        //Debug
/*        team1.getPlayerList().get(0).setPoints(team1.getPlayerList().get(0).getPoints() + 1);
        team1.getPlayerList().get(0).setMatchPoints(team1.getPlayerList().get(0).getMatchPoints() +1);
        System.out.println(team1.getPlayer(0).getFirstName());
        team1.printTeam();
        team2.printTeam();
        tennisMatch.printTeamsFromMatchClass();
        tennisMatch.setOpponents(team1.getPlayerList(), team2.getPlayerList());
        */


    }
}