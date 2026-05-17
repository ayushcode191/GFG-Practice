class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else{
                if((stack.peek()>=0 && arr[i]<0)
                || (stack.peek()<0 && arr[i]>=0)){
                    stack.pop();
                }
                else{
                    stack.push(arr[i]);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!stack.isEmpty()){
            res.add(0,stack.pop());
        }
        return res;
    }
}