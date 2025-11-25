/*The goal is to reverse only the vowels in the string without affecting the positions of consonants.
Since vowels can appear anywhere, a simple string traversal won't work alone. Using a two-pointer technique allows us to efficiently locate vowels from both ends and swap them.
*/  
package org.example.String;

import java.util.Scanner;

public class SwapVowelsofstring {
    public static String swap(String str){
        char [] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            while(start < end && !vowelcontain(arr[start])){
                start++;
            }
            while(start < end && !vowelcontain(arr[end])){
                end--;

            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        return new String(arr);

    }
    public static boolean vowelcontain(char c){
        return "aeiouAEIOU".indexOf(c) != -1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(swap(str));


    }
}
