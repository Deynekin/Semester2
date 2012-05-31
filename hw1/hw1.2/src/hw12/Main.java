package hw12;

import java.util.Scanner;

public class Main {

   private static Scanner input = new Scanner(System.in);

    public static int fib(int a) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < a - 1; i++) {
            int temp = first;
            first = first + second;
            second = temp;

        }
        return first;
    }

    public static void main(String[] args) {


        System.out.print("input n:");
        int n = input.nextInt();
        System.out.print(fib(n));
        System.out.println("\n");
    }
}
