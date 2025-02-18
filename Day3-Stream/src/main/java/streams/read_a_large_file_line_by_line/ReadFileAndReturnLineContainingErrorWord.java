package streams.read_a_large_file_line_by_line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndReturnLineContainingErrorWord {
    //method to read file
    public static String readFile(String sourceFileName){
        //storing in file path
        String myFile = "src/main/java/streams/read_a_large_file_line_by_line/" + sourceFileName;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line; //line contains each line
            while((line = br.readLine()) != null ){
                if(line.toLowerCase().contains("error")){
                    System.out.println( line);
                }
            }
        }
        catch (IOException e){     //Handling IO exception
            System.out.println("Source file does not exist.");
            System.out.println("Exception occurred "+ e.getMessage());
        }
        return null;
    }
}
