class Solution {
    int countWays(int n, int k) {
        // code here.
        if(n==1) return k;
        if(n==2) return k*k;
        
        int same = k;
        int diff = k*(k-1);
        for(int i=3;i<=n;i++){
            int nSame = diff;
            int nDiff = (same+diff)*(k-1);
            same = nSame;
            diff = nDiff;
        }
        return same+diff;
    }
}
