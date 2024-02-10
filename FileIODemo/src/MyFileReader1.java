import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFileReader1 {
    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader= null;

        Path folder= Paths.get("C:/javaprogram/fileiodemofolder1");
        Path file= Paths.get(folder+"/java04.txt");

        try
        {
            if(!Files.exists(file))
            {
                throw  new FileNotFoundException();
            }

            fileReader=new FileReader(file.toFile());
            bufferedReader = new BufferedReader(fileReader);


             String str=null;
             while ( (str=bufferedReader.readLine())!=null)
             {
                 System.out.println(str);
             }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(bufferedReader!=null)
                {
                    bufferedReader.close();
                }
                if(fileReader!=null)
                    fileReader.close();

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }

}
