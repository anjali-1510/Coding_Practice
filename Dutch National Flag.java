/**Dutch National Flag Algorithm (0, 1, 2 Sort)

This repository contains an implementation of the Dutch National Flag (DNF) Algorithm, which efficiently sorts an array consisting only of 0, 1, and 2 in linear time O(n) and constant space O(1)
*/
package org.example.Array;

import java.util.*;

/**
 * Dutch National Flag Algorithm
 * ------------------------------
 * Sorts an array containing only 0s, 1s, and 2s in O(n) time
 * without using extra space.
 *
 * Approach:
 *  - low  : boundary for 0s
 *  - mid  : current index
 *  - high : boundary for 2s
 */
public class DNF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
