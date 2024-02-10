import java.security.PublicKey;

public class movie1 {

    private String title;

    public movie1(String title) {
        this.title = title;
    }

    public void watchMovie()
    {
        String type=getClass().getSimpleName();
        System.out.println(title+"is a type"+type);
    }

    static movie1 getMovie(String title,String type)
    {
       return switch (type.toLowerCase())
        {
            case "adventure"->new Adventure1(title);
            case "comedy"->new Comedy1(title);
            default -> new movie1(title);
        };
    }

}