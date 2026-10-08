import java.util.Scanner;
public class MethodPalindrome {

        static String isPalindrome(String name){

        String rev = "";
        for(int i = name.length() - 1; i >= 0 ; i--){
            
            rev = rev + name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println(name + " is Palindrome");
            }else{
                System.out.println(name + " is not palindrome");
            }
            return "";
    }

    public static void main(String[] args) {
        Scanner nub = new Scanner(System.in);
        System.out.println("Enter Word : ");
         String  out = isPalindrome(nub.nextLine());
        
        nub.close();
    }

}
