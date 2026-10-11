public class methodiseven {
    static boolean isEven(int nub){
        if(nub % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    void main(){
        
        boolean even = isEven(10);
        IO.println(even);
    }
}
