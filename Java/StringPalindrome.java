import java.util.Scanner;
public class StringPalindrome {

    public static void main(String[] args) {
            Scanner nub = new Scanner(System.in);
            System.out.print("Write a Word : ");
        String str = nub.nextLine();
        String rev ="";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
        nub.close();
    }
}
