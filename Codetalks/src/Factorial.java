// declare class name Factorial
public class Factorial {
    // create a static method that takes an integer and returns the factorial of that integer (result)
    public static int factorial(int n) {
        // declare result variable as integer
       int result = 1;
       // for loop (starts with 1, increment until the number n is reached)
       for(int i = 1; i <= n; i++) {
           // update current result value by multiplying result by i
           result *= i;
       }
       // return the final result
       return result;
    }


    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is. " + result);
    }
}

