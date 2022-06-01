## Synergy

# Open Trivia Database Documentation
The Open Trivia Database API provides questions to the user based on the specifications given in the API calls.  The API is controlled through different parameters as shown below, and gives to the user a set of questions that fulfills the parameters given in the URL.


## Amount Parameter
The amount parameter signals to the server how many questions that the user would like to receive.  This can be any number between 1 and 50.

![Amount Example](./image1.png)
> https://opentdb.com/api.php?amount=1

This API call signals to the server that the user would like one question with no specifications, therefore the given question will be chosen from any of the available questions.


## Difficulty Parameter
The difficulty parameter tells the server what difficulty of questions that the user would like.  The user can chose from "easy", "medium", or "hard" to receive questions from the respective difficulty.

![Difficulty Example](./image2.png)
> https://opentdb.com/api.php?amount=5&difficulty=hard

This API call signals to the user than the user would like 5 questions with a hard difficulty.


## Type Parameter
The type parameter signals to the server what kinds of questions that the user would like to receive.  The user can input "boolean" to receive true/false questions or "multiple" to receive multiple choice questions.
![Type Example](./image3.png)
> https://opentdb.com/api.php?amount=10&difficulty=easy&type=boolean

This API call signals to the server that the user would like 10 questions with an easy difficulty based on the "difficulty" parameter, and that the user would also like a true/false question based on the "type" parameter being boolean.


## Category Parameter
The category parameter indicates to the server what category to select the questions from.  The number can be between 1 and 32, and each of the numbers represents a different category as defined in the documentation(https://opentdb.com/api_config.php).

![Catagory 1 Example](./image4.png)
> https://opentdb.com/api.php?amount=10&category=14

This Api call signals to the server what category the user would like to recieve the 10 questions from, the parameter "category" of 14 signals to the user that the category the questions are take from have to do with entertainment.


![Catagory 2 Example](./image5.png)
> https://opentdb.com/api.php?amount=10&category=28

In this API call we change the "category" to 28, this means that we will only receive questions from the vehicles category.

## Vanquish

We used the cat facts api located at https://cat-fact.herokuapp.com.

Endpoints: /facts

Following GET requests:

1)  GET Request: https://cat-fact.herokuapp.com/facts/58e008800aac31001185ed07
    Response: 
        {
            "status": {
                "verified": true,
                "sentCount": 1
            },
            "_id": "58e008800aac31001185ed07",
            "user": {
                "name": {
                    "first": "Kasimir",
                    "last": "Schulz"
                },
                "_id": "58e007480aac31001185ecef",
                "photo": "https://lh6.googleusercontent.com/-BS_rskGd3kA/AAAAAAAAAAI/AAAAAAAAADg/yAxrX9QabMg/photo.jpg?sz=200"
            },
            "text": "Wikipedia has a recording of a cat meowing, because why not?",
            "__v": 0,
            "source": "user",
            "updatedAt": "2020-08-23T20:20:01.611Z",
            "type": "cat",
            "createdAt": "2018-03-06T21:20:03.505Z",
            "deleted": false,
            "used": false
        }

2)  GET Request: https://cat-fact.herokuapp.com/facts/58e008630aac31001185ed01
    Response: 
        {
            "status": {
                "verified": true,
                "sentCount": 1
            },
            "_id": "58e008630aac31001185ed01",
            "user": {
                "name": {
                    "first": "Kasimir",
                    "last": "Schulz"
                },
                "_id": "58e007480aac31001185ecef",
                "photo": "https://lh6.googleusercontent.com/-BS_rskGd3kA/AAAAAAAAAAI/AAAAAAAAADg/yAxrX9QabMg/photo.jpg?sz=200"
            },
            "text": "When cats grimace, they are usually \"taste-scenting.\" They have an extra organ that, with some breathing control, allows the cats to taste-sense the air.",
            "__v": 0,
            "source": "user",
            "updatedAt": "2020-08-23T20:20:01.611Z",
            "type": "cat",
            "createdAt": "2018-02-07T21:20:02.903Z",
            "deleted": false,
            "used": false
        }

3)  GET Request: https://cat-fact.herokuapp.com/facts/random?amount=2
    Response: 
    [
        {
            "status": {
                "verified": null,
                "sentCount": 0
            },
            "_id": "6238c6cab18ea9c710f23c37",
            "user": "6235e7a89e4951c6ead6b256",
            "text": "Another facts about cats.",
            "type": "cat",
            "deleted": false,
            "createdAt": "2022-03-21T18:41:14.481Z",
            "updatedAt": "2022-03-21T18:41:14.481Z",
            "__v": 0
        },
        {
            "status": {
                "verified": null,
                "sentCount": 0
            },
            "_id": "624726217950cf88160ae9f8",
            "user": "624725eb7950cf88160ae9d8",
            "text": "Cats aren’t cool.",
            "type": "cat",
            "deleted": false,
            "createdAt": "2022-04-01T16:19:45.884Z",
            "updatedAt": "2022-04-01T16:19:45.884Z",
            "__v": 0
        }
    ]

4)  GET Request: https://cat-fact.herokuapp.com/facts?animal_type=cat
    Response: 
        [
            {
                "status": {
                    "verified": true,
                    "sentCount": 1
                },
                "_id": "58e008800aac31001185ed07",
                "user": "58e007480aac31001185ecef",
                "text": "Wikipedia has a recording of a cat meowing, because why not?",
                "__v": 0,
                "source": "user",
                "updatedAt": "2020-08-23T20:20:01.611Z",
                "type": "cat",
                "createdAt": "2018-03-06T21:20:03.505Z",
                "deleted": false,
                "used": false
            },
            {
                "status": {
                    "verified": true,
                    "sentCount": 1
                },
                "_id": "58e008630aac31001185ed01",
                "user": "58e007480aac31001185ecef",
                "text": "When cats grimace, they are usually \"taste-scenting.\" They have an extra organ that, with some breathing control, allows the cats to taste-sense the air.",
                "__v": 0,
                "source": "user",
                "updatedAt": "2020-08-23T20:20:01.611Z",
                "type": "cat",
                "createdAt": "2018-02-07T21:20:02.903Z",
                "deleted": false,
                "used": false
            },
            {
                "status": {
                    "verified": true,
                    "sentCount": 1
                },
                "_id": "58e00a090aac31001185ed16",
                "user": "58e007480aac31001185ecef",
                "text": "Cats make more than 100 different sounds whereas dogs make around 10.",
                "__v": 0,
                "source": "user",
                "updatedAt": "2020-08-23T20:20:01.611Z",
                "type": "cat",
                "createdAt": "2018-02-11T21:20:03.745Z",
                "deleted": false,
                "used": false
            },
            {
                "status": {
                    "verified": true,
                    "sentCount": 1
                },
                "_id": "58e009390aac31001185ed10",
                "user": "58e007480aac31001185ecef",
                "text": "Most cats are lactose intolerant, and milk can cause painful stomach cramps and diarrhea. It's best to forego the milk and just give your cat the standard: clean, cool drinking water.",
                "__v": 0,
                "source": "user",
                "updatedAt": "2020-08-23T20:20:01.611Z",
                "type": "cat",
                "createdAt": "2018-03-04T21:20:02.979Z",
                "deleted": false,
                "used": false
            },
            {
                "status": {
                    "verified": true,
                    "sentCount": 1
                },
                "_id": "58e008780aac31001185ed05",
                "user": "58e007480aac31001185ecef",
                "text": "Owning a cat can reduce the risk of stroke and heart attack by a third.",
                "__v": 0,
                "source": "user",
                "updatedAt": "2020-08-23T20:20:01.611Z",
                "type": "cat",
                "createdAt": "2018-03-29T20:20:03.844Z",
                "deleted": false,
                "used": false
            }
        ]

5)  GET Request: https://cat-fact.herokuapp.com/facts?animal_type=horse
    Response:
        {
            "status": {
                "verified": true,
                "sentCount": 1
            },
            "_id": "5b7a06cf2048fd0014e9d8a4",
            "updatedAt": "2020-09-15T01:18:10.849Z",
            "createdAt": "2018-08-20T00:09:51.957Z",
            "user": "5a9ac18c7478810ea6c06381",
            "text": "Horses will not lie down simultaneously because at least one will act as a look-out to alert its companions of potential dangers.",
            "deleted": false,
            "type": "horse",
            "source": "user",
            "__v": 0,
            "used": true
        }