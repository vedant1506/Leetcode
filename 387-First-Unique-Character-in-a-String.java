class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // Pass 1: Build the frequency count of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Pass 2: Find the FIRST character with a frequency count of 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index immediately!
            }
        }

        // If no unique character exists
        return -1;
    }
}