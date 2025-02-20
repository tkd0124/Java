package Exeption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class k4 {
    public static void main(String[] args) {
        try(
                FileReader fileReaderMain = new FileReader("src\\k4.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReaderMain);
        ){
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }

        }catch (FileNotFoundException e){
            System.out.println("Don't find a file");
            System.out.println("Message :  " + e.getMessage());
        }catch (IOException e){
            System.out.println("Failed reading a file");
            e.printStackTrace(System.out);
        }
    }
}
