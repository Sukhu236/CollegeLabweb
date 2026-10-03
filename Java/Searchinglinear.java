
import java.util.Scanner;

public class Searchinglinear {
    public static void main(String[] args) {
        int[] marks = { 3, 4, 5, 6, 7, 8 };
        Scanner nub = new Scanner(System.in);
        System.out.print("Enter number to Search: ");
        int search = nub.nextInt();
        boolean found = false;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == search) {

                System.out.println("number at place --> " + i);
                System.out.println("The number you search --> " + marks[i]);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Number not exist: "+ search);
            }
            nub.close();
    }

}
