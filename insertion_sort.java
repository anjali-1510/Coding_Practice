// Insertion Sort
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i -1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;
            
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = s.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
