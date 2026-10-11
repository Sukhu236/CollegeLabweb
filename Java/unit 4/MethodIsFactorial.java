

public class MethodIsFactorial {

    static int isFactorial(int a){

        int fa = 1;

    for(int i = a; i > 0; i --){

        fa = fa * i ;
        
        }
        return fa ;
        
    }

        public static void main(String[] args) {
            int b;
            b = isFactorial(5);
            
            System.out.println(b);
            
        }
}