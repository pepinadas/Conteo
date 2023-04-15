package UI;

import java.io.IOException;
import java.util.Scanner;

import static Programs.FourthLineCounter.lineCounter;
import static Programs.SecondCountOfEachOfTheDirefferentCharactersContained.countOfEachOfTheDirefferentCharactersContained;
import static Programs.FirstTotalCharacterCountOfAPlainTextFile.firstTotalCharacterCountOfAPlainTextFile;
import static Programs.ThirdWordCounter.wordCounter;

public class UIMenu {
    public static void showMenu(String urlTxtFile) throws IOException {


        System.out.println("Please select the correct option:");
        int response = 0;
        //Here an interface is deployed to interact with the user in a friendly and pleasant way
        do {
            System.out.println("1.- Total character count of a plain text file");
            System.out.println("2.- Count of each of the different characters contained in a plain text file");
            System.out.println("3.- Word counter");
            System.out.println("4.- Line counter");
            System.out.println("0.- Exit");

            //Here the app receives the number selected declaring the scanner class
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            //Here a Switch use the response that the user bring us to direct him to the right class
            switch (response){
                case 1:
                    System.out.println("You select Total Character count");
                    response = 0; //Here the app change the response to 0 to allow us exit the Do While
                    firstTotalCharacterCountOfAPlainTextFile(urlTxtFile); //Here the static class selected is called
                    showMenu(urlTxtFile); //Here the class is called again to "restart" the program
                    break;
                case 2:
                    System.out.println("You select Count of each of the different characters contained in a plain text file");
                    response = 0; //Here the app change the response to 0 to allow us exit the Do While
                    countOfEachOfTheDirefferentCharactersContained(urlTxtFile); //Here the static class selected is called
                    showMenu(urlTxtFile); //Here the class is called again to "restart" the program
                    break;
                case 3:
                    System.out.println("You select word counter");
                    response = 0; //Here the app change the response to 0 to allow us exit the Do While
                    wordCounter(urlTxtFile); //Here the static class selected is called
                    showMenu(urlTxtFile); //Here the class is called again to "restart" the program
                    break;
                case 4:
                    System.out.println("You select Line Counter");
                    response = 0; //Here the app change the response to 0 to allow us exit the Do While
                    lineCounter(urlTxtFile); //Here the static class selected is called
                    showMenu(urlTxtFile); //Here the class is called again to "restart" the program
                    break;
                case 0:
                    System.out.println("See you! :)"); //A nice farewell message
                    break;
                default:
                    System.out.println("Please select a correct answer"); //If the user selected an incorrect option this tells them

            }

        } while (response != 0); // When the program finish its journey, the response changes to 0
    }
}
