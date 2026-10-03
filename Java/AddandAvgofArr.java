import java.util.Scanner;

public class AddandAvgofArr{
    public static void main(String[] args) {

        Scanner nub = new Scanner(System.in);
        
        int[] arr = new int[5];
        int sum = 0;
        int avg = 0;
        
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print("Enter your "+(i + 1)+" number--> ");
        
                arr[i] = nub.nextInt();
                sum = sum + arr[i];
                avg = sum / arr.length;
             }
            System.out.println("");
            System.out.println("Sum of these number are--> "+sum);
            System.out.println("Avg of these number are--> "+avg);
         
            nub.close();
        }
    }
