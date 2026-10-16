public class MethodEvenOdd {
    static boolean isEven(int nub){
        return nub % 2 == 0;
    }
    public static void main(String[] args) {
        int nub = 0;
        boolean b = isEven (10);
        System.out.println(b);
    }
}