import java.util.Comparator;

public class JerseyNumberComparator implements Comparator <Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if (player1.getJerseyNumber()>player2.getJerseyNumber()){
            return 1;
        } else if (player1.getJerseyNumber()<player2.getJerseyNumber()) {
            return -1;
        }
        return 0;
    }
}