class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<m;i++){
            int curr = mat[0][i];
            int p=0;
            int q=i;
            while(p<n && q<m){
                if(mat[p][q]!=curr){
                    return false;
                }
                p++;
                q++;
            }
        }
        
        for(int i=1;i<n;i++){
            int curr = mat[i][0];
            int p=i;
            int q=0;
            while(p<n && q<m){
                if(mat[p][q]!=curr){
                    return false;
                }
                p++;
                q++;
            }
        }
        return true;
    }
}