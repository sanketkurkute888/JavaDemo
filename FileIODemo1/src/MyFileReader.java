import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        try {
            if (!Files.exists(file)) {
                System.out.println("File not exists");
                return;
            }

            fileReader = new FileReader(file.toFile());
            bufferedReader = new BufferedReader(fileReader);

            String str = null;
            while((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
