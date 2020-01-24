import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

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
        String[] ord = {"ord.txt"};

        }

        else if (choice == "bot") {

            String filePath = args[0];
            String[] lines = null;

            try (Scanner scan = new Scanner(new File("words.txt"))) {
                int arraySize = 999;
                lines = new String[arraySize];
                for (int i = 0; i < lines.length; i++) {
                    lines[i] = scan.nextLine();
                }

                System.out.println("Display results:");
                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();

            }

        }

        else if (!(choice != "bot" && choice != "friend")) {
            System.out.println("Error, you have to write either bot or friend");
            test = new Scanner(System.in);
            System.out.println("Do you wanna play with a friend or against a bot? Enter your choice below");

            choice = test.nextLine();
            System.out.println("Your choice is: " + choice);


        }
    }
}