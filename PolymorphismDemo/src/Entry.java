import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
//        Movie movie = new ScienceFiction("Stars Wars");
//        movie.watchMovie();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Movie title");
//        String title = scanner.nextLine();
//
//        System.out.println("Enter Movie type");
//        //scanner.next();
//        String type = scanner.next();
//        Movie movie = Movie.getMovie(type, title);
//        movie.watchMovie();
//         //var str = null;

         var movie = Movie.getMovie("ScienceFiction", "Stars Wars");

         if(movie instanceof Comedy){
             ((Comedy) movie).watchingMovie();
         } else if (movie instanceof ScienceFiction sf) {
             sf.watchingMovie();
         }
    }
}
