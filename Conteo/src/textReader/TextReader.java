package textReader;

import java.io.*;

public class TextReader {

    public String readTxt(String File) { //File direction

        String text = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(File));

            String temp = "";
            String bfRead;

            //Do the cycle, while bfRead have data
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead; //we already saved the text of the file
            }

            text = temp;

        } catch (Exception e) {
            System.out.println("File not found \nPlease try again");
        }

        return text;
    }

}
