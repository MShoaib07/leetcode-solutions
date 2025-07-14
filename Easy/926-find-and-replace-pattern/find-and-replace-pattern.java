class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String word: words){
            if(matches(word, pattern)){
                res.add(word);
            }
        }
        return res;
    }
    private boolean matches(String word, String pattern){
        if(word.length() != pattern.length()) return false;
        HashMap<Character, Character> wp = new HashMap<>(), pw = new HashMap<>();
        for(int i=0; i<word.length(); i++){
            char c1 = word.charAt(i);
            char c2 = pattern.charAt(i);

            if(wp.containsKey(c1) && wp.get(c1) != c2) return false;
            if(pw.containsKey(c2) && pw.get(c2) != c1) return false;
            wp.put(c1, c2);
            pw.put(c2, c1);
        }
        return true;
    }
}