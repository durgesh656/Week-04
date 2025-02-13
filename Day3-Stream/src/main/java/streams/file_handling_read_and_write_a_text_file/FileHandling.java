package streams.file_handling_read_and_write_a_text_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

    public static void readWriteFile() {
        String sourceFile = "src/main/java/streams/file_handling_read_and_write_a_text_file/source.txt/"; // Change to the actual source file path
        String destinationFile = "src/main/java/streams/file_handling_read_and_write_a_text_file/destination.txt"; // Change to the desired destination file path

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File src = new File(sourceFile);
            if (!src.exists()) {
                System.out.println("Source file does not exist");
                return;
            }

            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
            System.out.println("file copied successfully ");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
