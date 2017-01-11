package fizzbuzz;

import org.junit.*;

public class fizzbuzztests {

@Test public void TheFirstNumberInTheListIs1(){
    fizzbuzz f = new fizzbuzz();
    assert (f.getFizzBuzzResponse("1")=="1");
}
@Test public void TheNumber2Elicits2Response(){
    fizzbuzz f = new fizzbuzz();
    assert (f.getFizzBuzzResponse("2")=="2");
}
@Test public void TheNumber3ElicitsFizzResponse(){
    fizzbuzz f = new fizzbuzz();
    assert (f.getFizzBuzzResponse("3")=="fizz");
}
@Test public void TheNumber5ElicitsBuzzResponse(){
    fizzbuzz f = new fizzbuzz();
    assert (f.getFizzBuzzResponse("5")=="buzz");
}
@Test public void TheNumber15ElicitsFizzBuzzResponse(){
    fizzbuzz f = new fizzbuzz();
    assert (f.getFizzBuzzResponse("15")=="fizzbuzz");
}


}

