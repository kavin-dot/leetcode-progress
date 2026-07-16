class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            int spaces = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    spaces++;
                }
            }

            int words = spaces + 1;
            max = Math.max(max, words);
        }

        return max;
    }
}
