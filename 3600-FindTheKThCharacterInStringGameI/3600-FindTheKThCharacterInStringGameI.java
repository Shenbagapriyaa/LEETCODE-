// Last updated: 6/4/2026, 1:16:51 PM
class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while (word.length() < k) {
            StringBuilder nextWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == 'z') {
                    nextWord.append('a');
                } else {
                    nextWord.append((char) (c + 1));
                }
            }
            word += nextWord.toString();
        }
        return word.charAt(k - 1); 
    }
}