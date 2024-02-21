import java.util.Scanner; 

public class Problem5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int array[][] = new int[3][3];
        System.out.println("Enter the elements of the array: ");   
        //loop for row  
        for (int i = 0; i < 3; i++){   
          
            for (int j = 0; j < 3; j++)   
                array[i][j] = sc.nextInt();   
        }
        sc.close();

        int even = 0, odd = 0;
 
        // Loop to find even, odd sum
        for (int i = 0; i < 3; i++) {

            for(int j=0;j<3;j++){
                if (array[i][j] % 2 == 0)
                    even += array[i][j];
                else
                    odd += array[i][j];
            }
        }
        if(even==odd){
            System.out.println("this array is special");
        }
        else{
            System.out.println("this array is not special");
        }
    }
}
