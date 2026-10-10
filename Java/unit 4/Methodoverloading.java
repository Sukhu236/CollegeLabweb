public class Methodoverloading {
    static int add(int a,int b){
        return a + b ;

        static int add(int a, int b, int c){
            
            return a + b + c ;
        }
    }
    public static void main(String [] args){
        int return = add(a,b);
        System.out.println(return);
        
    }
}
