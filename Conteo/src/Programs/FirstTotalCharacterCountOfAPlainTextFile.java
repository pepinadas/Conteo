package Programs;

import textReader.TextReader;

public class FirstTotalCharacterCountOfAPlainTextFile {

    public static void firstTotalCharacterCountOfAPlainTextFile(String file) { //The static function receives a String named file
        TextReader textReader = new TextReader(); //Here we create a new instance of the TextReader class that we created before.
        String word = textReader.readTxt(file); //Here we pass the object textReader into a String

        System.out.println("The total number of characters in the document is " + word.length()); //Here the app shows in console the length of the txt file
    }
}
