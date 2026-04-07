class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        // code here
        int n = men.length;
        int[][] rank = new int[n][n];
        
        for(int w = 0; w < n; w++){
            for (int i = 0; i < n; i++) {
                rank[w][women[w][i]] = i;
            }
        }

        int[] womanPartner = new int[n];
        Arrays.fill(womanPartner, -1);

        int[] result = new int[n];
        Arrays.fill(result, -1);

        int[] nextProposal = new int[n];

        Queue<Integer> freeMen = new LinkedList<>();
        for(int m = 0; m < n; m++){
            freeMen.offer(m);
        }

        while(!freeMen.isEmpty()){
            int man = freeMen.poll();

            int woman = men[man][nextProposal[man]];
            nextProposal[man]++;

            if(womanPartner[woman] == -1){
                womanPartner[woman] = man;
                result[man] = woman;
            } 
            else{
                int currentMan = womanPartner[woman];

                if(rank[woman][man] < rank[woman][currentMan]){
                    womanPartner[woman] = man;
                    result[man] = woman;
                    result[currentMan] = -1;
                    freeMen.offer(currentMan);
                } 
                else{
                    freeMen.offer(man);
                }
            }
        }

        return result;
    }
}