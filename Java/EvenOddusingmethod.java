package Java;
import java.util.Scanner;


public class EvenOddusingmethod {
    static boolean isEven(int nub){
        return nub % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int nub = isEven (number.nextInt()); 

        
    }
    
}
