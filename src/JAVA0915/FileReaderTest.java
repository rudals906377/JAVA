package JAVA0915;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\105\\Desktop\\기말\\JAVA기초\\FileIO Test")
            );

            String line = "";

            line = br.readLine();
            System.out.println(line);

            line = br.readLine();
            System.out.println(line);

            line = br.readLine();
            System.out.println(line);

            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}