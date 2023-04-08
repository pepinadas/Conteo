package Programs;

import textReader.TextReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FourthLineCounter {
    public static void lineCounter(String file) throws IOException {
        TextReader textReader = new TextReader();
        String word = textReader.readTxt(file);
        word = word.trim(); //Here the app removes all leading and trailing whitespaces

        String changeLine;
        System.out.println("Is the line change an enter? (Yes / No)");
        Scanner src = new Scanner(System.in); //Here the app created a new instance of the class Scanner
        changeLine = String.valueOf(src.nextLine());

        String response = "";

        int counter = 1;

        if (changeLine.equals("No")) {
            //Here the app is asking for the line changer

            System.out.println("Please specify which is the line changer: "); //This text will be seen by the app user
            do {
                Scanner sc = new Scanner(System.in); //Here the app created a new instance of the class Scanner
                response = String.valueOf(sc.nextLine()); //Here the app collects the character that the user gave it
                if (response.length() >= 2){ //Here the app check if the length of the line changer is too big
                    System.out.println("These line changer is wrong, please do it again");
                }
            } while (response.length() != 1 ); //If the line changer is too big, then the user will bring to the app another character

            char[] chars = word.toCharArray();


            int wordLenght = word.length();

            for (int i = 1; i != wordLenght; i++) {
                String temp = String.valueOf(chars[i]);

                if (chars[i] != chars[i-1] ) {
                    if (response.equals(temp)){
                        counter = counter + 1;
                    }
                }
            }
        } else if (changeLine.equals("Yes")) {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ( br.readLine() != null ) {
                counter = counter + 1;
            }
        }




        System.out.println("The total number of lines in the file is: " + (counter - 1));



    }
}
