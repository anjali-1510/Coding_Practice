/*The program finds the unique element in an array where all other elements appear twice.
This is a common coding problem that uses the XOR operation to solve it efficiently.
*/

package com.Anjali;
import java.util.Scanner;

public class FindUnique {

    // Read array input
    public static int[] takeInput(Scanner sc) {
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    // Find unique element using XOR
    public static int uniqueElement(int[] input) {
        int unique = 0;
        for (int num : input) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] arr = takeInput(sc);
            System.out.println(uniqueElement(arr));
        }

        sc.close();
    }
}
