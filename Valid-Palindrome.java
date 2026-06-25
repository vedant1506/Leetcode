1class Solution {
2    public boolean isPalindrome(String s) {
3        // 1. Initialize two pointers
4        int left = 0;
5        int right = s.length() - 1;
6
7        // 2. Loop until the pointers meet in the middle
8        while (left < right) {
9            char leftChar = s.charAt(left);
10            char rightChar = s.charAt(right);
11
12            // 3. If the left character is not a letter or digit, skip it
13            if (!Character.isLetterOrDigit(leftChar)) {
14                left++;
15            } 
16            // 4. If the right character is not a letter or digit, skip it
17            else if (!Character.isLetterOrDigit(rightChar)) {
18                right--;
19            } 
20            // 5. If both are valid, convert to lowercase and compare
21            else {
22                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
23                    return false; // Not a palindrome
24                }
25                // Move both pointers inward if they match
26                left++;
27                right--;
28            }
29        }
30
31        // 6. If the loop finishes without a mismatch, it's a valid palindrome
32        return true;
33    }
34}