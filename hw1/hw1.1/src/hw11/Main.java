package hw11;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        int k = 0;
        System.out.println("Input k : ");
        k = input.nextInt();
        for (int i = 1; i <= k; i++) {
            System.out.println(factorial(i));
        }
    }
}
