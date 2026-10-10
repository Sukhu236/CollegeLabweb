public class factorialmethod {
    static int isfactorial(int a){
        int n = 1;
        for(int i = a ; i > 0 ; i --){
            n = n * i ;
        }
        return n ;
    }
    public static void main(String[] args) {
        int a = 6 ;
        int nub = isfactorial(a);
        System.out.println("factorial of "+ a + " is = " +  nub );
        
        
    }
}
