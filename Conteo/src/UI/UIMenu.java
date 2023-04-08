package UI;

import java.util.Scanner;

import static Programs.CountOfEachOfTheDirefferentCharactersContained.countOfEachOfTheDirefferentCharactersContained;
import static Programs.FirstTotalCharacterCountOfAPlainTextFile.firstTotalCharacterCountOfAPlainTextFile;

public class UIMenu {
    public static void showMenu() {
        System.out.println("Welcome to our homework");
        System.out.println("Please select the correct option:");

        int response = 0;
        do {
            System.out.println("1.- Total character count of a plain text file");
            System.out.println("2.- Count of each of the different characters contained in a plain text file");
            System.out.println("3.- Word counter");
            System.out.println("4.- Line counter");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("You select Total Character count");
                    response = 0;
                    firstTotalCharacterCountOfAPlainTextFile("D:\\Usuarios\\Personal\\Escritorio\\programacion\\Tarea\\Compiladores\\Conteo\\Conteo\\src\\Conteo.txt"); //Here you must put the directory of your txt file
                    break;
                case 2:
                    System.out.println("You select Count of each of the different characters contained in a plain text file");
                    response = 0;
                    countOfEachOfTheDirefferentCharactersContained("D:\\Usuarios\\Personal\\Escritorio\\programacion\\Tarea\\Compiladores\\Conteo\\Conteo\\src\\Conteo.txt"); //Here you must put the directory of your txt file
                    break;
                case 3:
                    System.out.println("You select word counter");
                    response = 0;
                    // Aquí se va a llamar a la clase de la tercera tarea o programa
                    break;
                case 4:
                    System.out.println("You select Line Counter");
                    response = 0;
                    //Aquí se va a llamar a la clase de la cuarta tarea o programa
                    break;
                case 0:
                    System.out.println("See you! :)");
                    break;
                default:
                    System.out.println("Please select a correct answer");

            }

        } while (response != 0);
        System.out.println("Bye");
    }
}
