import java.util.Random;

public class Teater{
    private  int seat;
    private int rows;
    private int columns;

    public Teater(int seat, int rows, int columns) {
        this.seat = seat;
        this.rows = rows;
        this.columns = columns;
    }

    public int getSeat() {
        return seat;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Teater{" +
                "seat=" + seat +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }


    public void printSeat()
    {
          
    }

    private String generateSeatNumber() {
       5241
        Random rand = new Random();
        int num = rand.nextInt(0,26) +; // Generating a 6-digit random number
        return "SBI" + num;
    }


}
