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
    public void whenGivenOneAndTwoReturnsThree(){
        // how do we invoke a method that belongs to another class??
        int actual = FibClass.sum(1,2); // 1 + 2 -> expected: 3
        Assertions.assertEquals(3, actual);
    }

    @Test // JUnit annotation to mark a method as a test method
    public void whenGivenOneAndTwoReturnsThree1(){
        // how do we invoke a method that belongs to another class??
        int actual = FibClass.sum(1,2); // 1 + 2 -> expected: 3
        Assertions.assertEquals(3, actual);
    }

    @Test // JUnit annotation to mark a method as a test method
    public void whenGivenOneAndTwoReturnsThree2(){
        // how do we invoke a method that belongs to another class??
        int actual = FibClass.sum(1,2); // 1 + 2 -> expected: 3
        Assertions.assertEquals(3, actual);
    }

    @Test // JUnit annotation to mark a method as a test method
    public void whenGivenOneAndTwoReturnsThree3(){
        // how do we invoke a method that belongs to another class??
        int actual = FibClass.sum(1,2); // 1 + 2 -> expected: 3
        Assertions.assertEquals(3, actual);
    }

}
