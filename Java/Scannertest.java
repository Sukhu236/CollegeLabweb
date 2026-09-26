package Java;
import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        Scanner nub = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = nub.nextInt();
        System.out.print("Enter Second number :");
        int b = nub.nextInt();
        int c = a + b;

        System.out.println("Sum of number =" + c);
    }
    

    
}