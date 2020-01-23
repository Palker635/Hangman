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
        System.out.println("Let 1 player choose a word and then let the other player begin guessing letters.");

        System.out.println("Write down your guess");
        Scanner guess = new Scanner(System.in);

        }
        else if (choice == "bot") {

        }

        else {
            System.out.println("Error, you have to write either bot or friend");
            test = new Scanner(System.in);
            System.out.println("Do you wanna play with a friend or against a bot? Enter your choice below");

            choice = test.nextLine();
            System.out.println("Your choice is: " + choice);


        }
    }
}