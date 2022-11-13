package classes;

/**
 * Player Class for the WBS Tennis Project
 * @author pascaljipp
 *
 * @version 1.0
 */
public class Player {
    private final String firstName;
    private final String lastName;
    private int points = 0;
    private int matchPoints = 0;
    private boolean played = false;



    /**
     * Constructor to create a Player-Object
     * @param firstName  defines the first name of the new Player
     * @param lastName  defines the first name of the new Player
     */
    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMatchPoints() {
        return matchPoints;
    }

    public void setMatchPoints(int matchPoints) {
        this.matchPoints = matchPoints;
    }

    public boolean hasplayed(){ return played; };

    public void setPlayed(boolean played) { this.played = played; };


}
