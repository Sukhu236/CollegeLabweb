import java.util.Scanner;
public class Evenoddmethod {
    static boolean EvenOdd(int a){
        return a % 2 == 0 ;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter number = ");

        int a = number.nextInt();

        boolean nub = EvenOdd(a);

        System.out.println(" This number is even = " + nub);

        number.close();
    }
}
