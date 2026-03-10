class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        int n = arr.length;
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            count += nextSmaller[i]-i;
        }
        return count;
    }
}
