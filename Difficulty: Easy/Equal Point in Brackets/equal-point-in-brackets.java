class Solution {
    public int findIndex(String s) {
        // code here
        int n = s.length();
        int[] before = new int[n+1];
        for(int i=1;i<=n;i++){
            if(s.charAt(i-1)=='('){
                before[i] = before[i-1] + 1;
            }
            else{
                before[i] = before[i-1];
            }
        }
        int[] after = new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==')'){
                after[i] = after[i+1]+1;
            }
            else{
                after[i] = after[i+1];
            }
        }
        for(int i=0;i<=n;i++){
            if(before[i]==after[i]) return i;
        }
        return n;
    }
}