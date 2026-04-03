class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        for(int j=0;j<n;j++){
            int x = 0;
            int y = j;
            while(x<n && y>=0){
                ans.add(mat[x][y]);
                x++;
                y--;
            }
        }
        for(int i=1;i<n;i++){
            int x = i;
            int y = n-1;
            while(x<n && y>=0){
                ans.add(mat[x][y]);
                x++;
                y--;
            }
        }
        return ans;
    }
}
