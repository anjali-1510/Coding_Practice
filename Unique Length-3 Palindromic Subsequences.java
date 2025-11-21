/* Intuition
A palindromic subsequence of length 3 must look like this: x _ x
The first and last characters must be the same, and the middle can be anything.
So the idea is simple:
For every character (from 'a' to 'z'), if we can find its first and last appearance in the string, then any character that appears between those two positions can act as the middle character to form a palindrome.
Each distinct middle character will give us a unique palindrome.

Approach
Loop through all characters from 'a' to 'z'.
For each character:
Find where it first appears in the string.
Find where it last appears.
If the character appears at least twice and there is space between the two positions:
Collect all the characters between them in a HashSet to keep only unique ones.
Each unique character in this range forms a distinct palindromic subsequence.
Add them up for all 26 possible outer characters.

Complexity
Time complexity:
We look for the first/last position of each letter and scan the middle range.
Since there are only 26 letters, this works out to roughly O(n) overall.

Space complexity:
The HashSet can hold at most 26 characters, so the space used is O(1) (constant).
*/
class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            int first = -1;
            int last = -1;

            // find first and last occurrence
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    if (first == -1) first = i;
                    last = i;
                }
            }

            // If no space between same letters → skip
            if (first != -1 && last - first >= 2) {
                HashSet<Character> set = new HashSet<>();

                // collect middle characters
                for (int i = first + 1; i < last; i++) {
                    set.add(s.charAt(i));
                }

                ans += set.size();
            }
        }

        return ans;
    }
}
