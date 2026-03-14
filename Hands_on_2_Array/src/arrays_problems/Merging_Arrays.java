package arrays_problems;

import java.util.Scanner;

public class Merging_Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array A: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the size of array B: ");
        int n2 = sc.nextInt();

        int a[] = new int[n1];
        System.out.print("Enter the A array elements: ");

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = new int[n2];
        System.out.print("Enter the B array elements: ");

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n1 + n2];

        int k = 0;

        for (int i = 0; i < n1; i++) {
            c[k] = a[i];
            k++;
        }

        for (int i = 0; i < n2; i++) {
            c[k] = b[i];
            k++;
        }

        System.out.print("Merged Array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
