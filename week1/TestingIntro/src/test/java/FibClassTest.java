import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
        Test Composition

        Setup the environment
        Run the method to be tested and store the result
        Assert that the result is what is to be expected
 */
/*
        A Test Class is a Test Suite
 */
public class FibClassTest {

    @Test// JUnit annotation to mark a method as a test method
    public void whenGivenOneAndTwoSumReturnsThree(){
        // how do we invoke a method that belongs to another class??
        int actual = FibClass.sum(1,2); // 1 + 2 -> expected: 3
        Assertions.assertEquals(3, actual);
    }

    /*
            TDD - Test Driven Development
                Writing tests for expected behavior before you write any code

            Red/Green Testing
                1. We write our tests to test the behavior of a method
                2. We run our tests expecting them to fail
                3. Implement just enough code to make the tests pass
                4. Refactor/Enhance
     */

    // indices: 0 1 2 3 4 5 6 7  8
    // values : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    @Test
    public void whenGiven0AsAnIndexFibReturns0(){
        int result = FibClass.fib(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void whenGiven13AsAnIndexFibReturns233(){
        int result = FibClass.fib(13);
        Assertions.assertEquals(233, result);
    }

    @Test
    public void whenGiven5AsAnIndexFibReturns5(){
        int result = FibClass.fib(5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void whenGiven20AsAnIndexFibReturns6765(){
        int result = FibClass.fib(20);
        Assertions.assertEquals(6765, result);
    }

}
