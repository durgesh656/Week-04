package streams.read_user_input_from_console;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteUserInput {
    public static void readAndWriteUserInput() {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "src/main/java/streams/read_user_input_from_console/user_data.txt";

        try {
            FileWriter writer = new FileWriter(fileName,true);
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            writer.write("Name: " + name + "\n");

            System.out.print("Enter your age: ");
            String age = reader.readLine();
            writer.write("Age: " + age + "\n");

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            writer.write("Favorite Programming Language: " + language + "\n");

            writer.flush();
            System.out.println("User information saved successfully!");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
