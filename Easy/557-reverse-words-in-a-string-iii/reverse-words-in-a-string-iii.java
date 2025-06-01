class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            String reversed = reverseString(words[i]);
            sb.append(reversed);
            if(i != words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
    private String reverseString(String word){
        char[] chars = word.toCharArray();
        int left = 0, right = word.length() - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}