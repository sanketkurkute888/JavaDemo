import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyBufferedOutputStream {
    public static void main(String[] args) {
        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        try(FileOutputStream fos = new FileOutputStream(file.toFile());
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            if (!Files.exists(file)) {
                Files.createDirectory(folder);
                Files.createFile(file);
            }

            String str = null;

            for(int i=1; i<= 10; i++){
                str = "Hello from BOS. Line : "+i;
                bos.write(str.getBytes());
                bos.write("\n".getBytes());
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
