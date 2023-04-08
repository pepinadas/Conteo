package Programs;

import textReader.TextReader;

import java.util.Scanner;

public class ThirdWordCounter {

    public static void wordCounter(String file) {
        TextReader textReader = new TextReader();
        String word = textReader.readTxt(file);
        word = word.trim(); //Here the app removes all leading and trailing whitespaces

        //Here the app is asking for the word separator
        String response = "";
        System.out.println("Please specify which is the word separator: "); //This text will be seen by the app user
        do {
            Scanner sc = new Scanner(System.in); //Here the app created a new instance of the class Scanner
            response = String.valueOf(sc.nextLine()); //Here the app collects the character that the user gave it
            if (response.length() >= 2){ //Here the app check if the lenght of the word separetor is too big
                System.out.println("These word separator is too big, please try again");
            }
        } while (response.length() != 1); //If the word separator is too big, then the user will bring to the app another word separator

        char[] chars = word.toCharArray();

        int counter = 1;
        int wordLenght = word.length();

        for (int i = 1; i != wordLenght; i++) {
            String temp = String.valueOf(chars[i]);

            if (chars[i] != chars[i-1] ) {
                if (response.equals(temp)){
                    counter = counter + 1;
                }
            }
            System.out.println("Iteracion numero " + i);
            System.out.println(counter);
            System.out.println(temp);
            System.out.println(response);
        }

        System.out.println("The total number of words is: " + counter);



    }

}
