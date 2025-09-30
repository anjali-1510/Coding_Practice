//Linear Search
package com.Anjali;

import java.util.Scanner;

public class LinearSearchh {
    public static int Linear(int [] arr , int k){
        int n = arr.length;
        for(int i=0; i < n; i++){
            if (arr[i] == k){
                return i;
            }



        }
        return -1;
        
    }
    public static int [] takeinput(int n){
        
        Scanner s = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i] = s.nextInt();
        }
        return arr;

    }
    public static void print(int [] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = s.nextInt();
        System.out.println("Enter the key");
        int k = s.nextInt();
        System.out.println("Enter the array elements");
        int arr[] = takeinput(n);
        print(arr);
        int j = Linear(arr , k);
        if(j ==  -1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element found at " + j);
        }
    }

}
