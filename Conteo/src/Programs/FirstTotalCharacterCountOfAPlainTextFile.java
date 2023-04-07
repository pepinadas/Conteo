package Programs;

import textReader.TextReader;

public class FirstTotalCharacterCountOfAPlainTextFile {

    public static void firstTotalCharacterCountOfAPlainTextFile(String file) {
        TextReader textReader = new TextReader();

        System.out.println(textReader.readTxt(file));
    }



}
