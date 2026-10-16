package javapaper.unit4;

public class isFactorial {

    static int isFactorial(int n){
        
        int fa = 1;

        for (int i = n; i > 0; i--) {
            
            fa = fa * i;
        }
        return fa ;
    }
    public static void main(String[] args) {
        int n = 5;
        int a = isFactorial(n);
        System.out.println("Factorial of "+ n + " is = "+ a);
        
    }
}
