public class Methodoverloading {
    static int add(int a,int b){
        return a + b ;
    }

       static int add(int a, int b, int c){
            
            return a + b + c ;
       }

       public static void main(String [] args){
       int ret = add(10,20);
       System.out.println(ret);
       int ret1 = add(10,20,30);
       System.out.println(ret1);

       }
}
    
