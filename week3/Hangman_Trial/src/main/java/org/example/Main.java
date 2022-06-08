package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxGuesses = 8;
        int wrongGuesses = 0;

        // we are going to use an array of characters as a string to make it easier
        int wordIndex = new Random().nextInt(words.length);
        char[] wordToGuess = words[wordIndex].toCharArray();
        char[] currentLetters = new char[wordToGuess.length];
        //List<Character> currentWrongLetters = new ArrayList<>();
        List currentWrongLetters = new ArrayList();

        // this is "seeding" currentLetters so that it displays underscores for anything missing
        for (int i = 0; i < wordToGuess.length; i++) {
            currentLetters[i] = '_';
        }
        // this is the game
        do {
            System.out.println(currentLetters);// _ _ _ _ -> _ a _ a
            System.out.println("Wrong guesses " + currentWrongLetters);
            System.out.println("Wrong guesses remaining: " + (maxGuesses - wrongGuesses));
            System.out.print("Guess a letter: ");
            char guess = input.nextLine().toLowerCase(Locale.ROOT).charAt(0);
            boolean check = false;
            for (int a = 0; a < wordToGuess.length; a++) {
                if (guess == wordToGuess[a]) {
                    currentLetters[a] = guess;
                    check = true;
                }
            }
            if (check == false) {
                currentWrongLetters.add(wrongGuesses, guess);
                wrongGuesses++;
            }
            //if (wordToGuess.equals(currentLetters)){maxGuesses = 8;}


        }while (wrongGuesses < maxGuesses) ;
    }


    static String[] words = {
            "exam",
            "people",
            "fortune",
            "football",
            "ear",
            "gene",
            "grocery",
            "advertising",
            "analyst",
            "bedroom",
            "connection",
            "negotiation",
            "speech",
            "shopping",
            "baseball",
            "magazine",
            "student",
            "freedom",
            "poet",
            "development",
            "friendship",
            "garbage",
            "product",
            "inflation",
            "difference",
            "procedure",
            "indication",
            "possession",
            "success",
            "proposal",
            "entertainment",
            "measurement",
            "concept",
            "percentage",
            "history",
            "efficiency",
            "height",
            "mixture",
            "response",
            "recording",
            "skill",
            "session",
            "potato",
            "reading",
            "queen",
            "java",
            "javalin"
    };
}
