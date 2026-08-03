class Solution {
    public String sortSentence(String s) {
        // Step 1: Split sentence into individual words
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        // Step 2: Place each word at its correct position
        for (String word : words) {
            // Find the 1-based index from the last character
            int index = word.charAt(word.length() - 1) - '0';
            
            // Extract the actual word (excluding the number)
            String actualWord = word.substring(0, word.length() - 1);
            
            // Place it in our result array (converting 1-based to 0-based index)
            result[index - 1] = actualWord;
        }

        // Step 3: Join words back together with spaces
        return String.join(" ", result);
    }
}