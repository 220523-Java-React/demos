public class FibClass {
    // the static keyword means that this method belongs to the class, not an instance of the class

    public static int sum(int a, int b){
        return a + b;
    }

    /*
            The fibonacci sequence is a sequence of numbers in which the value at any index is equal to the sum
            of the previous index (index - 1) + the previous previous index (index - 2)

            0 1 1 2 3 5 8 13 21 34 55 89

            our method should receive an index input
            and produce the value of the fib sequence at that index
     */

    // && - AND  -> both conditions must be met to be true, otherwise its false
        /*
                    true    false
             true   true    false
             false  false   false
         */

    // || - OR   -> if theres at least one true in there, its true
        /*
                    true    false
            true    true    true
            false   true    false
         */

    // 0 1 1 2 3 5 8 13 21 34 55 89
    public static int fib(int index){ // 2
        // we need to generate the sequence up to and including the index

        int current = 0;
        int prev = 1;
        int prevPrev = 1;

        if(index == 0) {
            return 0;
        }

        if(index == 1 || index == 2){
            return 1;
        }

        for(int i = 2; i < index; i++){
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }
}
