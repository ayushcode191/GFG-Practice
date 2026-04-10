class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[j]>arr[i]){
                    for(int k=j+1;k<n;k++){
                        if(arr[k]>arr[j]){
                            return new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
                        }
                    }
                }
            }
        }
        return new ArrayList<Integer>();
    }
}