// A program to print the divisors of a number efficiently

package com.Anjali;
import java.util.Scanner;

public class printtdivisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i * i <= n ;i++){
            if(n % i == 0){
                System.out.println(i);
                if(i != n / i){
                    System.out.println(n/i);
                }
                
                
            }
        }

    }

}
