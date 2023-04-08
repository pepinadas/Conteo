package textReader;

import java.io.*;

public class TextReader {

    public String readTxt(String File) { //File direction

        String text = ""; //Here we declared text before the try to use it later

        try { //Here we used a try because the BufferedReader could fail catching a bad document url
            BufferedReader bf = new BufferedReader(new FileReader(File)); //Here we create a new BufferedReader instance and pass him the parameter file

            String temp = ""; //Here we create a new temporary String to use it later
            String bfRead;

            //Do the cycle, while bfRead have data
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead; //we already saved the text of the file
            }

            text = temp; //Here we pass the text to the variable text

        } catch (Exception e) {
            System.out.println("File not found \nPlease try again"); //If the document url is wrong this will appear
        }

        return text; //The function returns the text of the file
    }

}
