public class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Adventure movie starts");
    }

    public void watchingMovie(){
        System.out.println("Watching Adventure Movie");
    }
}
