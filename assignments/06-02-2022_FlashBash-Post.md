# FlashBash POST assignment

## Instructions
Each team will work on implementing a POST Handler in the FlashcardController of the FlashBash API.
This handler should be reachable when a POST request is submitted to the /flashcards endpoint.
This handler should be capable of the following:
- Grab the contents of the request body as a String (check the context object to see what is available)
- Converting the String body into a Flashcard object (this is a process called marshaling)
- The handler should send the newly created Flashcard object to the FlashcardService to be stored in our list of Flashcards

You are NOT permitted to use an ObjectMapper to perform the marhsalling for you. You must convert the String into an Object by hand.

## Tips
The Java String API has a ton of methods available for you to manipulate Strings.
Some noteworthy methods on the String class are:
- substring()
- split()
- contains()

## Submission
Once the implementation has been completed, please push your code up to your teams branch within demos and submit a pull request back to the main branch. 
