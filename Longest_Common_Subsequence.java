/*Medium
Topics
premium lock icon
Companies
Hint
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.
Example 1:
Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:
Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
Constraints:
1 <= text1.length, text2.length <= 1000
text1 and text2 consist of only lowercase English characters.
*/


class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // Recursive APPROACH ->
         // if(text1.length()==0 ||text2.length()==0){
        //     return 0;
        // }
        // if(text1.charAt(0)==text2.charAt(0)){
        //     int option1=1+longestCommonSubsequence(text1.substring(1),text2.substring(1));
        //     return option1;
        // }else{
        //     int option1=longestCommonSubsequence(text1,text2.substring(1));
        //     int option2=longestCommonSubsequence(text1.substring(1),text2);
        //     int ans=Math.max(option1,option2);
        //     return ans;
        // }
      // MEMOIZATION approach
        Integer storage[][]=new Integer[text1.length()+1][text2.length()+1];
        // for(int i=0;i<text1.length()+1;i++){
        //     for(int j=0;j<text2.length()+1;j++){
        //         storage[i][j]=-1;
        //     }
        // }
        return  longestCommonSubsequenceM(text1,text2,storage);
    }
    public int longestCommonSubsequenceM(String text1,String text2,Integer[][]storage){
        int m=text1.length();
        int n=text2.length();
        if(m==0 || n==0){
           return 0;
        }
        if(storage[m][n]!=null){//It shows that storage at this place is filled before
            return storage[m][n];
        }
        if(text1.charAt(0)==text2.charAt(0)){
            storage[m][n]=1+longestCommonSubsequenceM(text1.substring(1),text2.substring(1),storage);
        }else{
           int option1=longestCommonSubsequenceM(text1,text2.substring(1),storage);
           int option2=longestCommonSubsequenceM(text1.substring(1),text2,storage);
           storage[m][n]=Math.max(option1,option2);
        }
        return storage[m][n];
    }      
}
