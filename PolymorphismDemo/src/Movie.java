public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String type = getClass().getSimpleName();
        System.out.println(title + " is a "+type);
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toLowerCase()) {
            case "adventure" -> new Adventure(title);
            case "comedy" -> new Comedy(title);
            case "sciencefiction" -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
