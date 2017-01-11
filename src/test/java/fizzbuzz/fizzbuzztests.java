package fizzbuzz;

import org.junit.*;

public class fizzbuzztests {

@Test public void TheFirstNumberInTheListIs1(){
    FizzBuzzGame f = new FizzBuzzGame();
    assert (f.getFizzBuzzResponse("1")=="1");
}
@Test public void TheNumber2Elicits2Response(){
    FizzBuzzGame f = new FizzBuzzGame();
    assert (f.getFizzBuzzResponse("2")=="2");
}
@Test public void TheNumber3ElicitsFizzResponse(){
    FizzBuzzGame f = new FizzBuzzGame();
    assert (f.getFizzBuzzResponse("3")=="fizz");
}
@Test public void TheNumber5ElicitsBuzzResponse(){
    FizzBuzzGame f = new FizzBuzzGame();
    assert (f.getFizzBuzzResponse("5")=="buzz");
}
@Test public void TheNumber15ElicitsFizzBuzzResponse(){
    FizzBuzzGame f = new FizzBuzzGame();
    assert (f.getFizzBuzzResponse("15")=="fizzbuzz");
}


}

