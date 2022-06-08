package com.revature;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxGuesses = 8;
        int wrongGuesses = 0;
        int letter = 0;
        int correctLetter = 0;

        // we are going to use an array of characters as a string to make it easier
        int wordIndex = new Random().nextInt(words.length);
        char[] wordToGuess = words[wordIndex].toCharArray();
        char[] currentLetters = new char[wordToGuess.length];
        List<Character> currentWrongLetters = new ArrayList<>();
        List<Character> currentRightLetters = new ArrayList<>();

        // this is "seeding" currentLetters so that it displays underscores for anything missing
        for(int i = 0; i < wordToGuess.length; i++){
            currentLetters[i] = '_';
        }


        // this is the game
        do{
            letter = 0;
            System.out.println(currentLetters);// _ _ _ _ -> _ a _ a
            System.out.println("Wrong guesses " + currentWrongLetters);
            System.out.println("Wrong guesses remaining: " + (maxGuesses - wrongGuesses));
            System.out.print("Guess a letter: ");
            char guess = input.nextLine().toLowerCase(Locale.ROOT).charAt(0);
            // TODO: complete the game implementation
            // if the guess is correct -> replace the currentLetters array with the correct letter in any given position of that letter
            // if the guess is incorrect -> add one to wrong guesses -> add the letter to currentWrongLetters

            if(currentWrongLetters.contains(guess) || currentRightLetters.contains(guess)){
                System.out.println("You already guessed that letter. Please select a different one.");
            } else {

                for (int i = 0; i < wordToGuess.length; i++) {
                    if (wordToGuess[i] == guess) {

                        currentLetters[i] = guess;
                        letter++;
                        correctLetter++;
                        currentRightLetters.add(guess);
                    }
                }

                if(letter == 0){
                    currentWrongLetters.add(guess);
                    wrongGuesses++;
                }

            }
            if(correctLetter == wordToGuess.length){
                System.out.println("Congratulations! You win! You've saved the man! ");
                break;
            } else if(wrongGuesses >= maxGuesses){
                System.out.println("You lose. You've let the man die.");
                break;
            }

        } while(wrongGuesses < maxGuesses);

        System.out.print("The Word is: ");
        System.out.print(wordToGuess);
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
