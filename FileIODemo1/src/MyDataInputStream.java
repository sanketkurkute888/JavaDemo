import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyDataInputStream {
    public static void main(String[] args) {
        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            if (!Files.exists(file)) {
                Files.createDirectory(folder);
                Files.createFile(file);
            }

            fis = new FileInputStream(file.toFile());
            dis = new DataInputStream(fis);

            while (dis.available() > 0){
                System.out.println(dis.readUTF());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (dis != null)
                    dis.close();
                if(fis != null)
                    fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
