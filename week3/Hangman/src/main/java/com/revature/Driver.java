package com.revature;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxGuesses = 8;
        int wrongGuesses = 0;

        // we are going to use an array of characters as a string to make it easier
        int wordIndex = new Random().nextInt(words.length); // this grabs random word
        char[] wordToGuess = words[wordIndex].toCharArray(); //
        char[] currentLetters = new char[wordToGuess.length]; // array containing
        List<Character> currentWrongLetters = new ArrayList<>(); //List of wrong letters.
        // this is "seeding" currentLetters so that it displays underscores for anything missing
        for(int i = 0; i < wordToGuess.length; i++){
            currentLetters[i] = '_';
        }
        // this is the game
        int correctLetterCount=0; //Total number of correct letters.
        int correctLetterDetector; //You get 1 when you guessed a letter right. Otherwise, you get 0;
        boolean duplicated=false;

        while(true){
            System.out.println(currentLetters);// _ _ _ _ -> _ a _ a
            System.out.println("Wrong guesses " + currentWrongLetters);
            System.out.println("Wrong guesses remaining: " + (maxGuesses - wrongGuesses));
            System.out.print("Guess a letter: ");
            char guess = input.nextLine().toLowerCase(Locale.ROOT).charAt(0);

            if(wrongGuesses < maxGuesses){
                correctLetterDetector=0;
                for(int i=0; i<wordToGuess.length ;i++){

                    if(wordToGuess[i]==guess){
                        duplicated=true;
                        currentLetters[i]=wordToGuess[i];
                        correctLetterCount++;
                        correctLetterDetector++;
                    }
                    z
                }
                // When guessed a wrong letter
                if(duplicated==true){
                    System.out.println("Correct");
                }
                duplicated=false;
                if(correctLetterDetector==0){
                    System.out.println("Wrong letter!");
                    currentWrongLetters.add(guess);
                    wrongGuesses++;
                }
                // When you completed all letters of the word to guess.
                if(correctLetterCount==wordToGuess.length){
                    System.out.println("You did it!");
                    System.out.println("Congratulations!");
                    break;
                }
            }
            //When a number of wrong guess turn into 0
            if(maxGuesses - wrongGuesses==0){
                System.out.println("Too bad! Game Over!");
                System.out.println("Please try again!");
                break;
            }
        }
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