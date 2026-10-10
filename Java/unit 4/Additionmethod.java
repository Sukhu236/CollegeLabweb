import java.util.Scanner;
public class Additionmethod {
    static int Add(int a,int b){
        int sum = a + b ;
        return sum ;

    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter 1 number = ");

        int a = number.nextInt();

        System.out.println("Enter 2 number = ");

        int b = number.nextInt();

        int addition = Add(10,20);
        
        System.out.println("Addition of two number = " + addition);
        number.close();
    }
}
