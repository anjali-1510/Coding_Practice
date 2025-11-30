/*
Intuition-
A string is almost a palindrome if we can remove at most one character to make it a palindrome. When we find a mismatch, we get one chance to skip either the left or right character and continue checking.
Approach-
Use two pointers, start at the beginning and end at the end of the string.
Move both pointers inward while characters match.
On the first mismatch, try skipping either the left or right character and check if the remaining substring is a palindrome using a helper function.
If either option works, the string is a valid palindrome; otherwise, it’s not.
Complexity-
Time complexity: O(n) – each character is checked at most twice.
Space complexity: O(1) – only pointers are used (ignoring recursion stack for helper).

*/
class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // If mismatch, try skipping either left or right character
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);       
            }
            start++;
            end--;
        }

        // All characters matched, it's a valid palindrome
        return true;
    }

    private boolean isPalindrome(String s, int start, int end){
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;    
        }
        return true;
    }        
}
