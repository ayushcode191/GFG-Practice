class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num : a){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : b){
           if(set1.contains(num)){
               set2.add(num);
           }
        }
        for(int ele:set2){
            res.add(ele);
        }
        Collections.sort(res);
        return res;
    }
}