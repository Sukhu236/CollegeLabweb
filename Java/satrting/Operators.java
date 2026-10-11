public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 8;

        //Arithmetic operators
        System.out.println("-->Arithmetic operators");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        a++;
        System.out.println(a++);
        b--;
        System.out.println(b--);

        //Relational operators
        System.out.println("-->Relational operators");
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        // Logical operators
        System.out.println("-->Logical operators");
        System.out.println(a > 5 && b < 10 && c < 10); //
        System.out.println(a < 5 || b > 10); // 
        System.out.println(a > 5);  // 

        // Assignment operators
        System.out.println("-->Assignment operators");
        System.out.println(a += 5);
        System.out.println(a *= 2);
        System.out.println(a -= 10);
        System.out.println(a /= 5);
        System.out.println(a %= 3);
        System.out.println("DONE");

    }
}
