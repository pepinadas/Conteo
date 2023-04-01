package UI;

import java.util.Scanner;

public class UIMenu {
    public static void showMenu() {
        System.out.println("Welcome to our homework");
        System.out.println("Please select the correct option:");

        int response = 0;
        do {
            System.out.println("1.- Total character count of a plain text file");
            System.out.println("2.- Count of each of the different characters contained in a plain text file");
            System.out.println("3.- Word count");
            System.out.println("4.- Line count");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Your select Total Character count");
                case 2:
            }

        } while (response != 0);
    }
}
