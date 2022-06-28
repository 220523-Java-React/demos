
// TODO: replace this list with a list of objects from an api
const groceryList = [
  "Paper Plates",
  "Plastic Cups",
  "Burgers",
  "Buns",
  "Cutlery",
];

const flashcardsEle = document.getElementById("flashcard-list");

function bindItem(item) {
  const newListItem = document.createElement("li");
  // what does item represent? the string value of each grocery item
  newListItem.textContent = item;
  flashcardsEle.appendChild(newListItem);
}


function bindFlashcard(flashcard) {
    const newListItem = document.createElement("li");
    newListItem.textContent = `Question: ${flashcard.question}   Answer: ${flashcard.answer}`;
    flashcardsEle.appendChild(newListItem);
}

function hello(){
    return "hello andrew";
}

// groceryList.forEach(bindItem);

function bindAllFlashcards(flashcards){
    flashcards.forEach(bindFlashcard);
}


/* fetch returns a Promise
        what is a Promise?
        if its asyc, its going to be done eventually, but MAYBE not right now
        make sure that while we're issuing a request and waiting for a response, that 
        we don't block the stack

*/
fetch("http://localhost:8080/flashcards").then((response) => response.json()).then(bindAllFlashcards)

