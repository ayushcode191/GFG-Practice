class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int[] prefix = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            prefix[i] = sum;
        }
        for(int[] q : queries){
            int l = q[0];
            int r = q[1];
            int s = prefix[r]-prefix[l]+arr[l];
            res.add(s/(r-l+1));
        }
        return res;
    }
}