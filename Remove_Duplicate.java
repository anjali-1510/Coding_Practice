/*Remove duplicate elements from Array
*/

package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Removeduplicate {
    public static int[] remove(int [] arr){
        int n = arr.length;
        int i =0;//slow pointer
        for(int j = 1; j < n;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }

        }
        return Arrays.copyOf(arr,i + 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int res [] = remove(arr);
        System.out.println(Arrays.toString(res));

    }

}
