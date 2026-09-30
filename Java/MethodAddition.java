package Java;
import java.util.Scanner;

public class MethodAddition {
    static int add (int a,int b){  //we need to write 'static' before any method
        return a + b;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter first and Second number: ");
        
        int sum = add(number.nextInt(), number.nextInt());


        System.out.println("Addition of Two number: " + sum);

        number.close();
    }
}
