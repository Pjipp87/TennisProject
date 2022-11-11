package classes;

import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Player> list;

    public Team(String teamName){
        this.teamName = teamName;
        this.list = new ArrayList<Player>();
    }

    public void addToTeam(Player p){
        this.list.add(p);
//        System.out.println(p.getFirstName() +" " +p.getLastName() +" wurde in " +this.teamName +" aufgenommen!");
    }

    public void printTeam(){
        System.out.println(this.teamName +":");
        for (Player p: this.list) {
            System.out.println(p.getFirstName() +" "+p.getLastName());
        }
    }
}
