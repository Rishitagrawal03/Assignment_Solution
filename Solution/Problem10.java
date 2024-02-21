import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7, 2};

        int sum = findMinMaxSum(numbers);
        
        System.out.println("Sum of the smallest and largest numbers: " + sum);
    }

    public static int findMinMaxSum(int[] numbers) {
        // Check if the array is empty
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Sort the array
        Arrays.sort(numbers);

        // Sum of the smallest and largest numbers
        int sum = numbers[0] + numbers[numbers.length - 1];

        return sum;
    }
}
