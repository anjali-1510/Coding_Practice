/**
 * LeetCode: Reverse Vowels of a String
 * Author: Anjali Mishra
 * Description:
 * This solution uses two pointers (start and end) to swap vowels from both ends.
 */
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Move start forward until it hits a vowel
            while (start < end && !isVowel(arr[start])) {
                start++;
            }
            // Move end backward until it hits a vowel
            while (start < end && !isVowel(arr[end])) {
                end--;
            }
            // Swap vowels
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
