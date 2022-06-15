package com.revature;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

// Interfaces act like contracts. They ensure that an implementation exists for any of the declared behaviors
public interface Animal{ // 100% abstract
    // common behaviors
    void sleep();
    void eat();
}

abstract class Herbivore implements Animal{  // 0 - 100% abstract
    String name;

    public void sleep(){
        System.out.println("Oh I get about 2 hours...");
    }

    public void eat(){
        System.out.println("This grass is tasty.");
    }

    abstract void graze();
}

class Cow extends Herbivore {

    @Override
    void graze() {
        System.out.println("This is nice...");
    }
}

class Cat implements Animal{ // 100% Concrete

    @Override
    public void sleep() {
        System.out.println("Oh I get about 23 hours...");
    }

    @Override
    public void eat() {
        System.out.println("Yes plz");
    }
}


