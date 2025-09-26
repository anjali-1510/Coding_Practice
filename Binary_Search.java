// Binary Search

package com.Anjali;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

    public static int search(int [] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(k == arr[mid]){
                return mid;
            }
            else if( k > arr[mid]){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }
            
            
            
        }
        return -1;

    }
    public static int[]  takeinput(int n){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();

        }
        return arr;

    }
    public static void print(int [] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( " ");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res[] = takeinput(n);
        Arrays.sort(res);
        print(res,n);
        int k = s.nextInt();
        int p = search(res,k);
        if( p == -1){
            System.out.println("Element not present");
        }else{
            System.out.println("Element present at index : " + p);
        }
    }
}
