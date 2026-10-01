import java.util.Scanner;

public class MethodAddition {
    static int add(int a, int b) { // we need to write 'static' before any method
        return a + b;
    }

    public static void main(String[] args) {
        System.out.print("Enter first and Second number: ");

        Scanner number = new Scanner(System.in);


        int sum = add(number.nextInt(), number.nextInt());

        System.out.println("Addition of Two no: " + sum);
        
        number.close();
    }
}
