import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileInputStream {
    public static void main(String[] args) {
        Path folder = Paths.get("C:/javaProgram/fileiodemofolder");
        Path file = Paths.get(folder + "/java04.txt");

        FileInputStream fis = null;
        
        try {
            if (!Files.exists(file)) {
                throw new FileNotFoundException();
            }

            fis = new FileInputStream(file.toFile());

            byte[] allData = fis.readAllBytes();
            System.out.println(new String(allData));

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fis != null)
                    fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
