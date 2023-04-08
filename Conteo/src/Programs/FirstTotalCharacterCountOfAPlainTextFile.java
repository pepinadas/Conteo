package Programs;

import textReader.TextReader;

public class FirstTotalCharacterCountOfAPlainTextFile {

    public static void firstTotalCharacterCountOfAPlainTextFile(String file) {
        TextReader textReader = new TextReader();

        String word = textReader.readTxt(file);

        /*
        int i = 1;
        do {

            System.out.println("Tamaño de " + i);

            i = i + 1;
        } while (word.length() > i);
        */

        System.out.println("The total number of characters in the document is " + word.length());
    }



}
