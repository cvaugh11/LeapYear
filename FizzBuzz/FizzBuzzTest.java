package FizzBuzz;

import org.junit.Test;

import jdk.internal.jline.internal.TestAccessible;

public class FizzBuzzTest {
    @Test
    public void test() {

    }
    @Test
    
    public void shouldProcessInput() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.processNumber(1));
        assertEquals("2", fizzbuzz.processNumber(2));
        assertEquals("Fizz", fizzbuzz.processNumber(3));
        assertEquals("Buzz", fizzbuzz.processNumber(5));
        assertEquals("Fizz", fizzbuzz.processNumber(6));
        assertEquals("Fizz", fizzbuzz.processNumber(9));
        assertEquals("Fizz Buzz", fizzbuzz.processNumber(5));

    }
}