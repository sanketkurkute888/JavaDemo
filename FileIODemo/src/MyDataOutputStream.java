import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyDataOutputStream {
    public static void main(String[] args) throws IOException {
        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        if (!Files.exists(file)) {
            Files.createDirectory(folder);
            Files.createFile(file);
        }

        try(FileOutputStream fos = new FileOutputStream(file.toFile());
            DataOutputStream dos = new DataOutputStream(fos);) {

            String str = null;

            for(int i=1; i<= 10; i++){
                str = "Hello from DOS. Line : "+i;
                dos.writeUTF(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            try {
//                if (dos != null)
//                    dos.close();
//                if(fos != null)
//                    fos.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
    }
}
