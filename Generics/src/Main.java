import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Komal",1,11);
        FootballPlayer footballPlayer2 = new FootballPlayer("Sakshi",9,12);
        FootballPlayer footballPlayer3 = new FootballPlayer("Kiran",3,10);
//        FootballPlayer footballPlayer4 = new FootballPlayer("Komal",1);
//        FootballPlayer footballPlayer5 = footballPlayer1;
        FootballPlayer footballPlayer6 = new FootballPlayer("Nikita",7,10);



        Team<FootballPlayer> footballTeam = new Team<>("India");
        footballTeam.addPlayer(footballPlayer1);
        footballTeam.addPlayer(footballPlayer2);
        footballTeam.addPlayer(footballPlayer3);
//        footballTeam.addPlayer(footballPlayer4);
//        footballTeam.addPlayer(footballPlayer5);
        footballTeam.addPlayer(footballPlayer6);
        // footballTeam.addPlayer(new CricketPlayer("dsfdsf"));

//        Collections.sort(footballTeam);
//        footballTeam.listPlayers();

        CricketPlayer cricketPlayer1 = new CricketPlayer("Sanket",10,23);
        CricketPlayer cricketPlayer2 = new CricketPlayer("Uday",20,12);
        CricketPlayer cricketPlayer3 = new CricketPlayer("Abhinav",30,23);
        CricketPlayer cricketPlayer4 = new CricketPlayer("Rohit",15,45);

        Team<CricketPlayer> cricketTeam = new Team<>("Mumbai Indians");
        cricketTeam.addPlayer(cricketPlayer1);
        cricketTeam.addPlayer(cricketPlayer2);
        cricketTeam.addPlayer(cricketPlayer3);
        cricketTeam.addPlayer(cricketPlayer4);

        //Team<String> incorrectTeam = new Team<>("Incorrect");
        // incorrectTeam.addPlayer("Hello");

        //cricketTeam.addPlayer(footballPlayer1);

       cricketTeam.listPlayers();



//       someFunction(Players);
    }
   public static void someFunction(Team<? extends Player> players){
        players.listPlayers();
   }
}