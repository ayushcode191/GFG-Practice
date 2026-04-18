class Solution {
    int maxOnes(int[] arr) {
        // code here
        int ones = 0;
        for(int num : arr){
            if(num==1) ones++;
        }
        
        int maxG=0;
        int currG = 0;
        for(int num : arr){
            int val=(num == 0) ? 1 : -1;
            currG = Math.max(val,currG+val);
            maxG = Math.max(maxG,currG);
        }
        return maxG+ones;
    }
};