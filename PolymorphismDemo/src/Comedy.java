public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Comedy movie starts");
    }

    public void watchingMovie(){
        System.out.println("Watching Comedy Movie");
    }
}
