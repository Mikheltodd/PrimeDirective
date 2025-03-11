import java.util.ArrayList;

public class PrimeDirective {

    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers){
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

}
