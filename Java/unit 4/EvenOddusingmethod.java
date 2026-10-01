package Java;

import java.util.Scanner;

public class EvenOddusingmethod {
    static int isEven(int nub) {
        return nub % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        boolean nub = isEven(number.nextInt());
        System.out.print(isEven);

    }

}
