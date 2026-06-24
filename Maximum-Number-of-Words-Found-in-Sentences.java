1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int maxWords = 0;
4        for(int i=0;i < sentences.length; i++) {
5            String[] words = sentences[i].split(" ");
6            int currentWordCount = words.length;
7            if (currentWordCount > maxWords) {
8                maxWords = currentWordCount;
9            }
10        }
11        return maxWords;
12    }
13}