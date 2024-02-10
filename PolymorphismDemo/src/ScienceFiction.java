public class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Science Fiction movie starts");
    }

    public void watchingMovie(){
        System.out.println("Watching Science Fiction Movie");
    }
}
