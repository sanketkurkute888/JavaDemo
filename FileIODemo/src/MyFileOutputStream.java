import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileOutputStream {
    public static void main(String[] args) {
        Path folder = Paths.get("C:/javaprogram/fileiodemofolder1");
        Path file = Paths.get(folder + "/java04.txt");

        FileOutputStream fos = null;

        try {
            if (!Files.exists(file)) {
                Files.createDirectory(folder);
                Files.createFile(file);
            }

            fos = new FileOutputStream(file.toFile());
            String str = null;

            for(int i=1; i<= 10; i++){
                str = "Hello from FIS. Line : "+i;
                fos.write(str.getBytes());
                fos.write("\n".getBytes());
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fos != null)
                    fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
