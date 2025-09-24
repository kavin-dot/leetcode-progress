class Solution {
    public String sortSentence(String s) {
        String st[] = s.split(" ");
        String ans[] = new String[st.length];
        for(String w : st){
            int idx = w.charAt(w.length()-1)-'1';
            ans[idx] = w.substring(0,w.length()-1);
        }
        return String.join(" ",ans);
    }
}
