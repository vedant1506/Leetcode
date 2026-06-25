1class Solution {
2    public void reverseString(char[] s) {
3        int left = 0;
4        int right = s.length - 1;
5
6        while (left < right) {
7            // 1. Temporary variable to hold the left character during the swap
8            char temp = s[left];
9            
10            // 2. Swap the elements
11            s[left] = s[right];
12            s[right] = temp;
13
14            // 3. Move the pointers closer to the center
15            left++;
16            right--;
17        }
18    }
19}