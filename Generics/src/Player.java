public abstract class Player implements Comparable <Player> {

    protected String name;
    protected int jerseyNumber;

    protected  int  matchesPlayed;

    public Player(String name, int jerseyNumber, int matchesPlayed) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.matchesPlayed = matchesPlayed;
    }

    //    public Player(String name, int jerseyNumber,int matchesPlayed) {
//        this.name = name;
//
//        this.jerseyNumber = jerseyNumber;
//        this.matchesPlayed=matchesPlayed;
//    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getNumber() {
//        return jerseyNumber;
//    }


//    public Player(int jerseyNumber) {
//        this.jerseyNumber = jerseyNumber;
//    }

//    public void setNumber(int jerseyNumber) {
//        this.jerseyNumber = jerseyNumber;
//    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", matchesPlayed=" + matchesPlayed +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Player{" +
//                "name='" + name + '\'' +
//                ", jerseyNumber=" + jerseyNumber +
//                '}';
//    }


//    @Override
//    public int compareTo(Player o) {
//        int result = this.getName().compareTo(o.getName());
//        System.out.println(result);
//        return result ;
//    }


    @Override
    public boolean equals(Object obj) {
        Player player = (Player) obj;
        return this.getName().equals(player.getName()); //&& this.getNumber() == player.jerseyNumber;
//        return super.equals(obj);
    }

    @Override
    public int compareTo(Player o) {
        int result = this.getName().compareTo(o.getName());
        System.out.println(result);
        return result;
    }


}






//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Player player = (Player) obj;
//        return name.equals(player.name);
//    }

//    @Override
//    public String toString() {
//        return "Player{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj ) {
//         return true;
//        } else {
//             return false;
//        }

//        return super.equals(obj);
//    }
//}

