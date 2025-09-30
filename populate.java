//Populate the array
package com.Anjali;

import java.util.Scanner;

public class Populatearray {
    public static int[] populate(int n){
        int i = 0;
        int j = n - 1;
        int num = 1;
        int arr[] = new int[n];
        while(i < j){
            arr[i] = num;
            num += 1;
            i++;
            arr[j] = num;
            num += 1;
            j--;
        }
        if(i == j){
            arr[i] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       // int a[] = populate(n);
        System.out.println(populate(n));
    }

}
