import java.util.Scanner;
public class Switchcode {
    void main(){
        Scanner nub = new Scanner(System.in);
        IO.println("enter number to know day :");
        var day = nub.nextInt();

switch (day){
    case 1:
    IO.println("monday");
    break;
    case 2:
    IO.println("tuesday");
    break;
    case 3:
    IO.println("wednesday");
    break;
    case 4:
    IO.println("thursday");
    break;
    case 5:
    IO.println("friday");
    break;
    case 6:
    IO.println("saturday");
    break;
    case 7:
    IO.println("sunday");
    break;
    default :
    IO.println("invalid input");
     break;
    }
    nub.close();
   }
}
