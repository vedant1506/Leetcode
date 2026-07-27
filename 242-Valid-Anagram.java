class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; // 26 alphabet slots

        // Single loop to count letters in s and cancel with t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // add letter from s
            count[t.charAt(i) - 'a']--; // remove letter from t
        }

        //Verify if everything canceled out
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}