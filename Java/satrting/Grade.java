import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks ->");
        int marks = sc.nextInt();

        if (marks >= 90){
            System.out.println("grade a = " + marks);
        }else if (marks >= 75){
                System.out.println("grade b = " + marks);
            }else if (marks >= 60){
                System.out.println("grade c = " + marks);
            }
            else{
                System.out.println("fale");
            }
            sc.close();
            
        }
}
