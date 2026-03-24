class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        // 1. create graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int[] indg = new int[n];
        for(int[] p : prerequisites){
            int x = p[0];
            int y = p[1];
            graph.get(y).add(x);
            indg[x]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indg[i]==0){
                queue.offer(i);
            }
        }
        int count = 0;
        while(!queue.isEmpty()){
            int course = queue.poll();
            count++;
            for(int c : graph.get(course)){
                indg[c]--;
                if(indg[c]==0) queue.offer(c);
            }
        }
        return count == n;
    }
}