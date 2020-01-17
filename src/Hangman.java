import javax.swing.*;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {



        System.out.println("Welcome to Hangman!");
        System.out.println("Do you wanna play with a friend or against a bot?");
        System.out.println("Tips: write 'friend' or 'bot' below");

        Scanner test = new Scanner(System.in);
        System.out.println("Do you wanna play with a friend or against a bot? Enter your choice below");

        String choice = test.nextLine();
        System.out.println("Your choice is: " + choice);

        if (choice == "friend") {

        }
        else if (choice == "bot") {

        }

        else {
            System.out.println("Welcome to Hangman!");
            System.out.println("Do you wanna play with a friend or against a bot?");
            System.out.println("Tips: write 'friend' or 'bot' below");

            Scanner test = new Scanner(System.in);
            System.out.println("Do you wanna play with a friend or against a bot? Enter your choice below");

            String choice = test.nextLine();
            System.out.println("Your choice is: " + choice);
        }

    }
}