// importing Arrays package from java.util
import java.util.Arrays;
// declaring class named ArraySorting
public class ArraySorting {
    // main method where program is executed
    public static void main(String[] args) {
        // creating array of integers named numbers
        int[] numbers = {5, 2, 8, 1, 9};
        // calling sort method from Arrays class to sort by ascending order
        Arrays.sort(numbers);
        // print to console
        System.out.print("Sorted Array: ");
        // print each number in numbers array to console
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
