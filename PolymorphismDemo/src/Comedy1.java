public class Comedy1 extends movie1 {

    public Comedy1(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Comedy movie starts");
    }

    public  void watchingMovies()
    {
        System.out.println("Waatching Comedy movie");
    }
}
