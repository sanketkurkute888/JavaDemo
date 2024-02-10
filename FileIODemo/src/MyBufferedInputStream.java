import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyBufferedInputStream {
    public static void main(String[] args) {
        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        try(FileInputStream fis = new FileInputStream(file.toFile());
            BufferedInputStream bis = new BufferedInputStream(fis);
        ) {
            if (!Files.exists(file)) {
                throw new FileNotFoundException();
            }

            byte[] allData = bis.readAllBytes();
            System.out.println(new String(allData));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
