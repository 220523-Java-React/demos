package com.revature;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        /*      CRUD -> all the operations we will ever need to perform to manipulate
                Create
                Read
                Update
                Delete
         */

        List<String> list = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        Animal gerry = new Dog();

        Object jerry = new Dog();

        list.add("hi");
        linkedList.add("hi");
    }
}



class Dog implements Animal{

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}

// an example of the interface segregation principle
interface BitingAnimal extends Animal{
    void bite();
}