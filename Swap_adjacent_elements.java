//Swap-adjacent-elements program where each pair of consecutive elements is swapped

package com.Anjali;
import java.util.Scanner; 

public class SwapArrayElements {
    public static int [] takeinput(){
        Scanner s = new Scanner (System.in);
        int size=s.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=s.nextInt();
        }
        return input;
    }
    public static void print(int input[]){
        for(int i=0;i<input.length;i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
    public static int[] Swap(int input[]){
        for(int i=0;i<input.length-1;i=i+2){
            int temp=input[i];
            input[i]=input[i+1];
            input[i+1]=temp;
        }
        return input;
    }
    public static void main(String[] args) {
        int arr[]=takeinput();
        print(arr);
        int swpped[]=Swap(arr);
        print(swpped);
    }

}
/*
 * in case of both even and odd the element which has to be Swap is even element
 * for example{0,1,2,3,4}(n=5(odd))here 0,2 will be swap
 * for even{0,1,2,3,4,5}(n=6) here 0,2,4 will be swap
 * 
 */
