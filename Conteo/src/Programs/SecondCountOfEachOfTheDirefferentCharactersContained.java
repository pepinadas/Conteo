package Programs;

import textReader.TextReader;

import java.util.HashMap;

public class SecondCountOfEachOfTheDirefferentCharactersContained {

    public static void countOfEachOfTheDirefferentCharactersContained(String file) {
        TextReader textReader = new TextReader(); //Here we create a new instance of the TextReader class that we created before.

        String word = textReader.readTxt(file); //Here we pass the object textReader into a String

        HashMap<String, Integer> numberLetters = new HashMap<>(); //Here we create a HashMap to introduce here the letter like key and the number of times that they appear like value


        int i = 0; //we create the integer i to use it later
        do {
            char[] chars = word.toCharArray(); //At this part we assign the File string result to a char
            String charsString = String.valueOf(chars[i]); //Here we get the individual letter of the iteration and save it like "charsString"


            if (numberLetters.containsKey(charsString) == false) { //Here we evaluate if the individual letter has been previously saved
                numberLetters.put(charsString, 1); //If the individual letter hasn't been previously saved we create a new key and assign him the value 1
            } else  { //If the key already exists then...
                int temp = numberLetters.get(charsString); //We get the value of the key and...
                numberLetters.put(charsString, temp + 1); //We add a 1 to its value
            }


            i = i + 1; // i = i + 1
        } while (word.length() > i); //We use a do While because had problems using for


        System.out.println("The total number of each character is " + numberLetters); //At the end we show the hashmap with a sout in the console with the variable numberLetters
    }
}
