package com.revature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Driver {

    /*
                What could possibly go wrong in my application??
                A lot of things:

                Errors: Severe issues with your application that are somewhat out of your control
                    - these typically will crash your application
                    - Errors occur at runtime
                    - We DO NOT typically handle errors (we don't catch these)

                Exceptions: are relatively common issues with an implementation not working as intended
                    (Checked)   Compile-time Exceptions: these are checked for by the compiler (we are forced to catch these)
                    (Unchecked) Runtime Exceptions : occur during the execution of the program and are typically dependent on some
                        form of user input, or some degree of variability imposed on your application while it is running
                        (We can but are not forced to catch these)

                The parent of all of these classes is Throwable
     */

    public static void main(String[] args){

        // what do we need to do when we throw a checked exception
        // what do we need to do when we throw an unchecked exception

        // a try block is a sequence of operations that you want to attempt to perform
        // typically code that may or may not throw an exception will be placed in a try block
        try {
            File file = new File("text.txt");
            FileReader reader = new FileReader(file);

            throw new RuntimeException();
        }
        // the catch block will give us a chance to evaluate what happened (document)
        // and maybe we can do something to save the situation
        // the catch block is a sequence of operations that we want to perform if this exception is caught
        catch(RuntimeException variableName){
            variableName.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("We still continue");



        // What happens when we throw a Runtime Exception
        // the compiler doesn't care
        try{
            int x = 5/0;
        } catch(Throwable e){
            System.out.println("In the catch for runtime");
        }
    }
}
