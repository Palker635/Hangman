import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {



        System.out.println("Welcome to Hangman!");
        System.out.println("Do you wanna play with a friend or against a bot?");
        System.out.println("Tips: write 'friend' or 'bot' below");

        Scanner test = new Scanner(System.in);
        System.out.println("Do you wanna play with a friend or against a bot? Enter your choice below");

        String choice = test.nextLine();
        System.out.println("Your choice is: " + choice);



        if (choice.equalsIgnoreCase("friend")) {
        System.out.println("Let 1 player choose a word and then let the other player begin guessing letters.");

        System.out.println("Write down your guess");
        Scanner guess = new Scanner(System.in);

        }

        else if (choice.equalsIgnoreCase("bot")) {

        //    String filePath = args[0];
            String[] lines = null;

            try (Scanner scan = new Scanner(new File("words.txt"))) {
                int arraySize = 999;
                lines = new String[arraySize];
                for (int i = 0; i < lines.length; i++) {
                    lines[i] = scan.nextLine();
                }

/*                for (String line : lines) {
                    System.out.println(line);
                }
*/

            } catch (FileNotFoundException e1) {
                e1.printStackTrace();

            }



                    Random rand = new Random();
                    int upperbound=999;
                    //generate random values from 0-24
                    int int_random = rand.nextInt(upperbound);
                    System.out.println("Random integer value from 0 to " + (upperbound-1) + " : "+ int_random);

            String botord = (lines[int_random]);

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