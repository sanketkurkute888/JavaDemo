import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team<T extends Player> {
    List<T> players;
    private String name;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(T player) {
        if (players.contains(player)) {
            System.out.println("Player Already Present");
        } else {
            players.add(player);
        }

//        players.contains(player);
//        players.add(player);
    }

    public void listPlayers() {
//        Collections.sort(players,new JerseyNumberComparator());
//        Collections.sort(players);
//        players.sort(new nameComparator());
//        players.sort(new JerseyNumberComparator());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the correct choice to sort");
        System.out.println("1.By matches Played");
        System.out.println("2.By jursey Number");
        int choice = scanner.nextInt();
        if (choice == 1) {
            players.sort(new matchesPlayedComparator());
        } else if (choice == 2) {
            players.sort(new JerseyNumberComparator());
        }

        for (T player : players) {
            System.out.println(player);
//            System.out.println(player.getNumber());
//            System.out.println(player.getName());
        }
    }
}