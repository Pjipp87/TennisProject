package classes;

import java.util.ArrayList;


/**
 * Team Class for the WBS Tennis Project
 * @author pascaljipp
 *
 * @version 1.0
 */
public class Team {
    private final String teamName;
    ArrayList<Player> list;
    private final ArrayList<Player> winnerlist;


    /**
     * Constructor to create a Team-Object
     * @param teamName  defines the name of the new Team
     */
    public Team(String teamName){
        this.teamName = teamName;
        this.list = new ArrayList<>();
        this.winnerlist = new ArrayList<>();
    }

    /**
     * Adds Player to the specific Team-Object
     * @param p     Player-Object to add
     */
    public void addToTeam(Player p){
        this.list.add(p);
    }

    /**
     * Returns the name of the actual Team Objekt
     * @return String teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Prints the Team members of the specific Team
     * to the console
     */
    public void printTeam(){
        System.out.println(this.teamName +":");
        for (Player p: this.list) {
            System.out.println(p.getFirstName() +" "+p.getLastName());
        }
        System.out.println();
    }


    /**
     * Returns an ArrayList of all Players in the specific Team
     * @return ArrayList<Player>
     */
    public ArrayList<Player> getPlayerList(){
        return this.list;
    }


    /**
     * Returns the winner list
     * @return the winner list
     */
    public ArrayList<Player> getWinnerlist() {
        return winnerlist;
    }


    /**
     * Adds a Player-Object to the winner List
     * @param p a Player Object to add
     */
    public void addPlayerToWinnerlist(Player p) {
        this.winnerlist.add(p);
    }

    /**
     * Prints a list of all winners of the team to the console
     */
    public void printWinnerList(){
        for (Player p: this.winnerlist) {
            System.out.println(p.getFirstName() +" "+p.getLastName());
        }
        System.out.println();
    }

    /**
     * Returns a specific player of the Team
     * @param index Index of the Player in the PlayerList
     * @return Player-Object
     */
    public Player getPlayer(int index){
        return this.list.get(index);
    }

    public void removePlayer(Player player){
        this.list.remove(player);
    }
}
