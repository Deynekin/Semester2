package hw13;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static int[] bubbleSort(int[] k) {

        for (int i = 0; i < k.length; i++) {
            for (int j = i; j < k.length; j++) {
                if (k[i] > k[j]) {
                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int a[];
        System.out.println("Input length of a: ");
        int n = input.nextInt();
        a = new int[n];
        System.out.println("Input a : ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        bubbleSort(a);
        System.out.println("Result : \n");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");


        }
    }
}
