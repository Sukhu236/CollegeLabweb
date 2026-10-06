import java.util.Scanner;
public class TableofAnynumber {
    public static void main(String[] args) {
        Scanner nub = new Scanner(System.in);
        System.out.print("Enter number which table you want : ");
        int number = nub.nextInt();
        int table = 0;
                for(int i = 0; i <= 10; i ++){
                    table = number * i ;
                    System.out.println(number + " * " + i + " = " + table);
                }
                nub.close();
    }
}
