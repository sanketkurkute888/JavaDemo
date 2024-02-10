import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileWriter {
    public static void main(String[] args)  {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        Path folder = Paths.get("C:/Java03/fileiodemofolder");
        Path file = Paths.get(folder + "/java03.txt");

        try {
            if (!Files.exists(file)) {
                Files.createDirectory(folder);
                Files.createFile(file);
            }

           fileWriter = new FileWriter(file.toFile());
           bufferedWriter = new BufferedWriter(fileWriter);

            for(int i=1; i<=10; i++){
                 bufferedWriter.write("Hello from java file io. Line: "+i);
                 bufferedWriter.write("\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
