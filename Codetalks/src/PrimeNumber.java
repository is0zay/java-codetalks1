// declare class named PrimeNumber
public class PrimeNumber {
    // create static method that takes in a number and returns a boolean value (true or false)
    public static boolean isPrime(int number) {
        // check if number is less than or equal to 1, return false
        if(number <= 1) {
            return false;
        }
        // starting from 2, if the number is divisible without remainder by any number smaller than the number, it returns false
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        // if all these tests fail return true
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        // call function with argument passed
        // use falsey and truthy values to determine what to print to console.
        if(isPrime(17)) {
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
