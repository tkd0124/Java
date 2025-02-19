package Exeption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) {

        try {

            FileReader fileReaderMain = new FileReader("src\\text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReaderMain);

            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
                bufferedReader.close();
            }
        }catch (FileNotFoundException e){
            System.out.println("Don't find a file");
            System.out.println("Message :  " + e.getMessage());
        }catch (IOException e){
            System.out.println("Failed reading a file");
            e.printStackTrace(System.out);
        }

        System.out.println("End of this Program");
    }
}
