import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyObjectInputStream {
    public static void main(String[] args) throws IOException {
        Person person = new Person(20, "Komal", "Female");

        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        if (!Files.exists(file)) {
            Files.createDirectory(folder);
            Files.createFile(file);
        }

        try {
            fis = new FileInputStream(file.toFile());
            ois = new ObjectInputStream(fis);

            Person p = (Person)ois.readObject();
            System.out.println(p);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(ois != null)
                ois.close();
            if(fis != null)
                fis.close();
        }
    }
}
