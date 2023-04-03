import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void fourPlusSixEqualsTen() {
        // test
        var calculator = new Calculator();
        //assert
        assertEquals(10, calculator.add(4, 6)); // give assumption check
    }

    @Test
    void fivePlusNineEqualsFourteenth() {
        // test
        var calculator = new Calculator();
        //assert
        assertEquals(14, calculator.add(5, 9)); // give assumption check

    }
    // create unit test : 5-2 = 3 and 20-4 = 16, make one of this test failed the test
    @Test
    void sixteenSubtractNineEqualsSeven(){
        var calculator = new Calculator();
        assertEquals(7, calculator.Subtract(16, 9));

    }
    @Test
    void fiveSubtractTwoEqualsThree(){
        var calculator = new Calculator();
        assertEquals(3, calculator.Subtract(5, 2));

    }
    @Test
    void twentySubtractFourEqualsSixteen(){
        var calculator = new Calculator();
        assertEquals(16, calculator.Subtract(20, 4));

    }
    @Test
    void fiveMultiplyFourEqualsTwenty(){
        var calculator = new Calculator();
        assertEquals(20, calculator.Multiply(5, 4));

    }
    @Test
    void sixteenDivideTwoEqualsEight(){
        var calculator = new Calculator();
        assertEquals(8, calculator.Division(16, 2));

    }

}