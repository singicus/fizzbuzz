package fizzbuzz;

import org.junit.*;

public class FizzBuzzTests {

    FizzBuzzGame subject = new FizzBuzzGame();

    @Test public void TheFirstNumberInTheListIs1() {
        assert (subject.getFizzBuzzResponse("1") == "1");
    }

    @Test public void TheNumber2Elicits2Response() {
        assert (subject.getFizzBuzzResponse("2") == "2");
    }

    @Test public void TheNumber3ElicitsFizzResponse() {
        assert (subject.getFizzBuzzResponse("3") == "fizz");
    }

    @Test public void TheNumber5ElicitsBuzzResponse() {
        assert (subject.getFizzBuzzResponse("5") == "buzz");
    }

    @Test public void TheNumber15ElicitsFizzBuzzResponse() {
        assert (subject.getFizzBuzzResponse("15") == "fizzbuzz");
    }
}
