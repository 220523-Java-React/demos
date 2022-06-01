# Open Trivia Database Documentation
The Open Trivia Database Api provides questions to the user based on the specifications given in the Api calls.  The Api is controlled through different paramters as shown below, and gives to the user a set of questions that fulfils the paramters given in the URL.

## Amount Parameter
> https://opentdb.com/api.php?amount=1

![image1](image1.png)

This Api call signals to the server that the user would like one question with no specifications, therefore the given quesiton will be chosen from any of the available questions.

## Difficulty Parameter
> https://opentdb.com/api.php?amount=5&difficulty=hard

![image2](image2.png)

This Api call signals to the user than the user would like 5 questions with a hard difficulty.

## Type Parameter
> https://opentdb.com/api.php?amount=10&difficulty=easy&type=boolean

![image3](image3.png)

The Api call signals to the server that the user would like 10 questions with an easy difficulty based on the "difficulty" parameter, and that the user would also like a true/false question based on the "type" parameter being boolean.

## Category Parameter
> https://opentdb.com/api.php?amount=10&category=14

![image4](image4.png)

This Api call signals to the server what category the user would like to receive the 10 questions from, the parameter "category" of 14 signals to the user that the category the questions are take from have to do with entertainment.


![image5](image5.png)

In this Api call we change the "category" to 28, this means that we will only receive questions from the vehicles category.