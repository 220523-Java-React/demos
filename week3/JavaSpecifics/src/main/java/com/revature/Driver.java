package com.revature;

/*          two runtime entities
            primitives
            objects are built a class

            what is the parent class from which every class extends??
            the Object class
 */
public class Driver {
    public static void main(String... anything){
        Object o = new Object();
        A a = new A();
        A a1 = new A();

        System.out.println(a);
        // do they have the same value on the stack??
        boolean test = a == a1;
        System.out.println(test); // false? false!

        // are these two equal by whatever the Object class decided?
        test = a.equals(a1);
        System.out.println(test); // true? false!!

        // by default the .equals() from the object is the same as ==

        B b = new B();
        b.sayHello();

        C c = new C();
        c.sayHello();

        System.out.println();

        System.out.println(varArgs());
        System.out.println(varArgs(1));
        System.out.println(varArgs(1, 2, 3, 4, 5, 6, 7, 87));

        CC cc = new CC();
    }

    // varying number of arguments
    public static int varArgs(int ...args){
        int sum = 0; // start from 0

        for(int x: args){ // go through each and every int within args
            sum += x;           // add the value of that int to our sum
        }

        return sum;
    }
}

class A{
    public void sayHello(){
        System.out.println("hello.");
    }
}

// B is A
// The IS A principle denotes that if you inherit from something you ARE that thing, and more
// The HAS A principle
class B extends A{


    // this is a concept of Overriding
    @Override // help the compiler understand that you are overriding your parent
    public void sayHello(){
        System.out.println("Sup!");
    }
}

class C extends B{
    @Override
    public String toString() {
        return "C{}";
    }
}

abstract class AC{
    public void sayHello(String... words){
        System.out.println(words);
    };
}

class CC extends AC{
    @Override
    public void sayHello(String... words) {
        super.sayHello(words);
    }

    // two methods with identical names, that must have different argument arrangements
    public void sayHello(String words){

    }

    public void sayHello(String words, String word2){

    }
}

class ObjectChild {

}

class Animal{

}

// A Dog is an Animal
class Dog extends Animal{

}

class Cat extends Animal{

}

class Person{
    // This person HAS a dog
    Dog dog;
}
