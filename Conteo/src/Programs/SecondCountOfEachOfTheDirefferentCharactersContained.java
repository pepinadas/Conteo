package Programs;

import textReader.TextReader;

import java.util.HashMap;

public class SecondCountOfEachOfTheDirefferentCharactersContained {

    public static void countOfEachOfTheDirefferentCharactersContained(String file) {
        TextReader textReader = new TextReader();

        String word = textReader.readTxt(file);

        HashMap<String, Integer> numberLetters = new HashMap<>();


        int i = 0;
        do {
            char[] chars = word.toCharArray();
            String charsString = String.valueOf(chars[i]);


            if (numberLetters.containsKey(charsString) == false) {
                numberLetters.put(charsString, 1);
            } else  {
                int temp = numberLetters.get(charsString);
                numberLetters.put(charsString, temp + 1);
            }


            i = i + 1;
        } while (word.length() > i);


        System.out.println("The total number of each character is " + numberLetters);
    }
}
