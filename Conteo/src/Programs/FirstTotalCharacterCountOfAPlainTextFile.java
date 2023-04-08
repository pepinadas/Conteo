package Programs;

import textReader.TextReader;

public class FirstTotalCharacterCountOfAPlainTextFile {

    public static void firstTotalCharacterCountOfAPlainTextFile(String file) {
        TextReader textReader = new TextReader();

        String word = textReader.readTxt(file);

        System.out.println("The total number of characters in the document is " + word.length());
    }
}
