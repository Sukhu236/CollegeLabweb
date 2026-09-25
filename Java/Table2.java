package Java;
import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner nuber = new Scanner(System.in);
        System.out.println("Enter number which you want table of:");
        int nub = nuber.nextInt();

        System.out.println("Table of "+ nub);

            for(int i = 1; i <= 10; i++){
            int table = nub * i;
                
                System.out.println(table);
            }
            nuber.close();
        }
}
