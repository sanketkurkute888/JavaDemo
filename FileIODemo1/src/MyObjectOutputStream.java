import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyObjectOutputStream {
    public static void main(String[] args) throws IOException {
        Person person = new Person(20, "Komal", "Female");
        Path folder = Paths.get("C:/javaProgram/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        if (!Files.exists(file)) {
            Files.createDirectory(folder);
            Files.createFile(file);
        }

        try {
            fos = new FileOutputStream(file.toFile());
            oos = new ObjectOutputStream(fos);

            oos.writeObject(person);


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(oos != null)
                oos.close();
            if(fos != null)
                fos.close();
        }
    }
}
