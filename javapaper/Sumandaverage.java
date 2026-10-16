package javapaper;
import java.util.Scanner;

public class Sumandaverage {
    public static void main(String[] args) {
        Scanner nub = new Scanner(System.in);
        
        int[] arr = new int[5];
        int sum = 0;
        int avg = 0;

        for(int i = 0; i < arr.length; i ++){
            
            System.out.println("Enter "+(1 + i)+" numbers = ");
            
            arr[i] = nub.nextInt();

                sum = sum + arr[i];
                    
                    avg = sum/arr.length; 

         }
                System.out.println("Sum = "+sum);
                System.out.println("Average = "+avg);
        nub.close();
    }
}
