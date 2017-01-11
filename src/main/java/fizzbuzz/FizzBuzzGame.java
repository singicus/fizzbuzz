package fizzbuzz;

public class FizzBuzzGame {

public static void main(String[] args) {
    FizzBuzzGame fizzbuzzgame = new FizzBuzzGame();
    String fizzBuzzVocalization = "";
        for (int i=1;i<101;i++){
            String iString = i+"";
             fizzBuzzVocalization = fizzbuzzgame.getFizzBuzzResponse(iString);
            System.out.println("person " + i + " says..." + fizzBuzzVocalization);
        }
    }

public String getFizzBuzzResponse(String currentRealNumeral){
        String fizzBuzzResponse = "";
        int currentRealInteger = Integer.parseInt(currentRealNumeral);
        if (currentRealInteger % 3==0 && currentRealInteger % 5==0){
            fizzBuzzResponse = "fizzbuzz";
        } else if (currentRealInteger % 3==0){
            fizzBuzzResponse = "fizz";
        } else if (currentRealInteger % 5==0){
            fizzBuzzResponse = "buzz";
        } else {
            fizzBuzzResponse = currentRealNumeral;
        }
        return fizzBuzzResponse;
    }
}