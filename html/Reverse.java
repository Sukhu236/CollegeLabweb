public class Reverse{
    public static void main(String[] args) {
        String arr = "Hello";
        String rev = "";

            for(int i = arr.length() - 1; i >= 0; i --){

                rev = rev + arr.charAt(i);
            }
            System.out.println("Original string = " + arr);
            System.out.println("Reversed string = " + rev);
    }
}