import java.util.Scanner; 

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        sc.close();
        // Check for addition overflow
        int sum = num1 + num2;
        boolean additionOverflow = (num1 > 0 && num2 > 0 && sum < 0) || (num1 < 0 && num2 < 0 && sum >= 0);
        if (additionOverflow) {
            System.out.println("Addition will result in overflow.");
        } else {
            System.out.println("Addition will not result in overflow.");
        }

        // Check for multiplication overflow
        long product = (long) num1 * num2;
        boolean multiplicationOverflow = product != (int) product;
        if (multiplicationOverflow) {
            System.out.println("Multiplication will result in overflow.");
        } else {
            System.out.println("Multiplication will not result in overflow.");
        }
    }
}

