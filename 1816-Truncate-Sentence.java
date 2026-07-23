class Solution {
    public String truncateSentence(String s, int k) {
        int spaceCount = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if current character is a space
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
            
            // Once we hit k spaces, cut the string right here!
            if (spaceCount == k) {
                return s.substring(0, i);
            }
        }
        
        // If the sentence has k or fewer words, return the original string
        return s;
    }
}