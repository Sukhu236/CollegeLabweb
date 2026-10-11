public class Primenumber {
    public static void main(String[] args) {
        int n = 17;
        int count = 0;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                count ++;
                break;
            
            }

            
        }
        if (count == 0){
            System.out.println(n + " is prime no");
        }else{
            System.out.println(n +" is not prime number");
        }
    }
}
