import java.util.Scanner;

public class AdditionofArr{
    public static void main(String[] args) {

        Scanner nub = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.println("Enter your "+(i + 1)+" number--> ");
        
                arr[i] = nub.nextInt();
            
            
         }
    nub.close();

        }
    }
