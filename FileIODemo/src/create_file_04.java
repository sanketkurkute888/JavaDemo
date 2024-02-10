import java.io.File;
import java.io.IOException;

public class create_file_04 {
    public static void main(String[] args) {
        File mFile=new File("newfile08.txt");
        if (mFile.exists()) {
            System.out.println("File name: "+mFile.getName());
            System.out.println("File absolute path: "+mFile.getAbsolutePath());
            System.out.println("Writable:  "+mFile.canWrite());
            System.out.println("Readable: "+mFile.canRead());
            System.out.println("File Size in byte: "+mFile.length());

        } else {
            System.out.println("file does not exist.");
        }

    }

}