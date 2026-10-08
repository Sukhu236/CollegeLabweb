public class MethodIsFactorial {

    static int isFactorial(int a){

    for(int i = a; i > 0; i --){

        System.out.print(i + "*");
        }
        return i + "*" ;
        
    }

        public static void main(String[] args) {
            int b;
            b = isFactorial(20);
            System.out.println(b);
        }
}