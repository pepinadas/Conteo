package Programs;

import textReader.TextReader;

import java.util.Scanner;

public class ThirdWordCounter {

    public static void wordCounter(String file) {
        TextReader textReader = new TextReader(); //Here we create a new instance of the TextReader class that we created before.
        String word = textReader.readTxt(file); //Here we pass the object textReader into a String
        word = word.trim(); //Here the app removes all leading and trailing whitespaces

        //Here the app is asking for the word separator
        String response = ""; //String response equals "" (empty or nothing)
        System.out.println("Please specify which is the word separator: "); //This text will be seen by the app user
        do {
            Scanner sc = new Scanner(System.in); //Here the app created a new instance of the class Scanner
            response = String.valueOf(sc.nextLine()); //Here the app collects the character that the user gave it
            if (response.length() >= 2){ //Here the app check if the lenght of the word separetor is too big
                System.out.println("These word separator is too big, please try again");
            }
        } while (response.length() != 1); //If the word separator is too big, then the user will bring to the app another word separator

        char[] chars = word.toCharArray(); //At this part we assign the File string result to a char

        int counter = 1; //Counter equals 1
        int wordLenght = word.length(); //Here we assign the extension of the File String result to a variable named "wordLenght"

        for (int i = 1; i != wordLenght; i++) { //Here we evaluate if the i is not equals to the length of the File String
            String temp = String.valueOf(chars[i]); //We create a temporary variable and assign it the string of the iteration of char

            if (chars[i] != chars[i-1] ) { //If the iteration of char is not equals to itself but in the past position (to prevent count more words than the really exists) then...
                if (response.equals(temp)){ //and only if response equals to the temporary variable than we created previously
                    counter = counter + 1; //Counter = counter + 1
                }
            }
        }

        System.out.println("The total number of words is: " + counter); //At the end we show in console the total number of words with the variable "counter"



    }

}
