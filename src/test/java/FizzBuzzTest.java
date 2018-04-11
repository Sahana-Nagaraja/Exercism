import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", fizzBuzz.displayForRange(new int[]{3}));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5() {
        assertEquals("Buzz", fizzBuzz.displayForRange(new int[]{5}));
    }

    @Test
    public void shouldReturnFizzIfNumberIsMultiple3() {
        assertEquals("Fizz", fizzBuzz.displayForRange(new int[]{6}));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsMultiple5() {
        assertEquals("Buzz", fizzBuzz.displayForRange(new int[]{10}));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsMultipleOf5And3() {
        assertEquals("FizzBuzz", fizzBuzz.displayForRange(new int[]{15}));
    }

    @Test
    public void shouldReturnNumberIfNotAMultipleOf3Or5() {
        assertEquals("2", fizzBuzz.displayForRange(new int[]{2}));
    }

    @Test
    public void shouldReturnArray() {
        assertEquals(new String[]{"2","4","Fizz"}, fizzBuzz.displayForRange(new int[]{2, 4, 3}));
    }

}