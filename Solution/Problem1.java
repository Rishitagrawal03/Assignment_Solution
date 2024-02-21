import java.util.Scanner;

public class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number - ");
        int num = sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        
    }
}