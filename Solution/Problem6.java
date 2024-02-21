import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // take input from users
    System.out.print("Enter the principal: ");
    double principal = sc.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = sc.nextDouble();

    System.out.print("Enter month: ");
    double month = sc.nextDouble();

    double interest = (principal * month/12 * rate) / 100;
    System.out.println("Total Interest is: "+interest);
    }
}
