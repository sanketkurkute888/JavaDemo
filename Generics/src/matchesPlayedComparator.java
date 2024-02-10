import java.util.Comparator;

public class matchesPlayedComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if (player1.getMatchesPlayed()>player2.getMatchesPlayed()){
            return 1;
        } else if (player1.getMatchesPlayed()<player2.getMatchesPlayed()) {
            return -1;
        }
        return 0;
    }
}
