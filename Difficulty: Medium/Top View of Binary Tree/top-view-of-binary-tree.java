/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Pair{
    Node node;
    int hd;
    Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        queue.offer(new Pair(root, 0));

        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            Node node = curr.node;
            int hd = curr.hd;
            if(!map.containsKey(hd)){
                map.put(hd, node.data);
            }
            if(node.left != null){
                queue.offer(new Pair(node.left, hd - 1));
            }
            if(node.right != null){
                queue.offer(new Pair(node.right, hd + 1));
            }
        }

        for(int val : map.values()){
            result.add(val);
        }
        return result;
    }
}