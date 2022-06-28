// JS is loosly typed language meaning that variables can change type and be reassigned at will

// Data Types in JS
// 7 Primitives
x = 10                  // number - can indlude decimals
x = false               // boolean - true or false
x = "hello"             // string - a sequence of characters
x = BigInt(10)          // BigInt - a number that is able to store larger values
x = Symbol("hello")     // Symbol - a unique representation of some data
x = null                // null - points to an empty location
x = undefined           // undefined - we haven't assigned a value so we cant infer the datatype

// Everything else is an object
x = {                   // this is an object literal
    question: "what is JS?",
    answer: "a super cool but wonky language"
}                           // This is a JavaScript object (different from JSON)

x = [1, 2, 3, 4, 5]         // Arrays


function doSomething(){ // Functions are objects
    console.log("Do what?")
    return function doSomethingElse(){
        return "I'm out of ideas"
    };
}

// x = doSomething     // x equals the reference
// x()                 // invoking doSomething
// x = doSomething()   // x equals the return value of the invocation
// console.log(x)


// Truthy vs Falsey is the concept of variables having a true or false condition associated with it 
// There are ONLY 6 values that equate to false 
// 1.       0 & -0 & BigInt(0), BigInt(-0)
// 2.       null
// 3.       undefined
// 4.       NaN
// 5.       empty string
// 6.       false

// == vs ===
// == does allow type coercion
// === does not allow type coercion

// Variable Declartion
//      x = 10; ->  let x = 10;
//      var x = 10      -> this is a variable, global and function scoped
//      let x = 10      -> this is a variable, block scoped
//      const x = 10    -> this is a variable, block scoped, the reference can not be changed


// regular function declaration
let fun = function something(){
    console.log("Calling from another function")
}

// arrow function declaration
let arrowFun = (param) => {
    console.log(param)
}

let callFunction = (funToCall) => {
    console.log("before fun to call")
    setTimeout(funToCall, 5000);
    console.log("after fun to call")
}

callFunction(fun); // this concept of passing a function as a parameter, is called a callback function


