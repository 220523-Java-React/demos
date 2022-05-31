# Open Trivia Database Documentation
The Open Trivia Database provides questions to the user based on the specifications given in the Api calls.  The Api is controlled through different paramters as follows, to give the user a set of questions that fulfils the paramters in given in the URL.

## amount Parameter
https://opentdb.com/api.php?amount=1
This Api call signals to the server that the user would like one question with no specifications, therefore the given quesiton will be chosen from any of the available questions.

## difficulty Parameter
https://opentdb.com/api.php?amount=5&difficulty=hard
This Api call signals to the user than the user would like 5 questions with a hard difficulty.

## type Paramter
https://opentdb.com/api.php?amount=10&difficulty=easy&type=boolean
The Api call signals to the server that the user would like 10 questions with an easy difficulty based on the "difficulty" parameter, and that the user would also like a true/false question based on the "type" paramter being boolean.

## catagory Paramter
https://opentdb.com/api.php?amount=10&category=14
This Api call signals to the server what catagory the user would like to recieve the 10 questions from, the parameter "catagory" of 14 signals to the user that the catagory the questions are take from have to do with entertainment.

https://opentdb.com/api.php?amount=10&category=28
In this Api call we change the "catagory" to 28, this means that we will only recieve questions from teh vehicles catagory.