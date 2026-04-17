class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int[] letters = new int[26];
        for(int i=0;i<s.length();i++){
            letters[s.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int i=0;i<26;i++){
            if(letters[i]%2==1) odd++;
            if(odd>1) return false;
        }
        return true;
    }
}