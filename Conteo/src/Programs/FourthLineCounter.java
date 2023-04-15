package Programs;

import textReader.TextReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static UI.UIMenu.showMenu;

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
            //Here the app is asking for the line changer, if the line changer is different to enter then the logic is similar as the third program

            System.out.println("Please specify which is the line changer: "); //This text will be seen by the app user
            do {
                Scanner sc = new Scanner(System.in); //Here the app created a new instance of the class Scanner
                response = String.valueOf(sc.nextLine()); //Here the app collects the character that the user gave it
                if (response.length() >= 2){ //Here the app check if the length of the line changer is too big
                    System.out.println("These line changer is wrong, please do it again");
                }
            } while (response.length() != 1 ); //If the line changer is too big, then the user will bring to the app another character

            char[] chars = word.toCharArray(); //At this part we assign the File string result to a char


            int wordLenght = word.length(); //Here we assign the extension of the File String result to a variable named "wordLenght"

            for (int i = 1; i != wordLenght; i++) { //Here we evaluate if the i is not equals to the length of the File String
                String temp = String.valueOf(chars[i]); //We create a temporary variable and assign it the string of the iteration of char

                if (chars[i] != chars[i-1] ) { //If the iteration of char is not equals to itself but in the past position (to prevent count more paragraphs than the really exists) then...
                    if (response.equals(temp)){  //and only if response equals to the temporary variable than we created previously
                        counter = counter + 1; //Counter = counter + 1
                    }
                }
            }
        } else if (changeLine.equals("Yes")) { //If the line changer is entered then...
            BufferedReader br = new BufferedReader(new FileReader(file)); //we use a similar logic than the TextReader Class, creating a new instance of the class BufferedReader, and named it like br (Because in the E team we love bad bunny brr)

            while ( br.readLine() != null ) { //When br.readLine is not null then the line changes so...
                counter = counter + 1; //counter = counter + 1
            }
        }



        System.out.println("The total number of lines in the file is: " + (counter - 1)); //At the end we show in console the total number of lines in the file with the variable Counter (-1)

    }
}
