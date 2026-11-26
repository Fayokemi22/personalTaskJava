import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumbersTest {
    TwoNumbers numbers;
@BeforeEach
    void setUp() {
         numbers = new TwoNumbers();
    }

@Test
  void testThatThreeNumberCanBeAdded(){
int firstNumber = 4;
int secondNumber =9;
int thirdNumber = 2;
assertEquals(15, numbers.add(firstNumber,secondNumber, thirdNumber));
}

@Test
    void testThatAverageOfThreeNumbersCanBeKnown(){

    assertEquals(5.0,numbers.average(4,9,2));
    }

    @Test
    void testTheAverageOfAGivenNumber(){
        int firstNumber = 4;
        int secondNumber =9;
        int thirdNumber = 2;
        assertEquals(5,numbers.average(4,9,2));
    }
    @Test
    void testThatThreeNumbersCanBeMultiply(){
        int firstNumber = 4;
        int secondNumber =9;
        int thirdNumber = 2;

        assertEquals(72,numbers.multiply(4,9,2));
    }
}
