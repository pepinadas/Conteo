import java.io.IOException;
import java.util.Scanner;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) throws IOException {
        //


        System.out.println("Welcome to our homework");
        System.out.println("Enter the url of the file");

        String urlTxtFile = "D:\\Usuarios\\Personal\\Escritorio\\programacion\\Tarea\\Compiladores\\Conteo\\Conteo\\src\\Conteo.txt"; //Example of how to introduce the url

        Scanner url = new Scanner(System.in);
        urlTxtFile = String.valueOf(url.nextLine()); //Here you must put the directory of your txt file by console




        //Take the static function from the class UIMenu to show a simple UI to interact with the user
        showMenu(urlTxtFile);
    }
}