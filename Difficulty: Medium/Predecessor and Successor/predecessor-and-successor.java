/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> res = new ArrayList<>();
        Node curr = root;
        Node pred = null;
        Node succ = null;
        while(curr != null){
            if(curr.data > key){
                succ = curr;
                curr = curr.left;
            }
            else if(curr.data < key){
                pred = curr;
                curr = curr.right;
            }
            else{
                if(curr.left != null){
                    Node temp = curr.left;
                    while(temp.right != null){
                        temp = temp.right;
                    }
                    pred = temp;
                }
                if(curr.right != null){
                    Node temp = curr.right;
                    while(temp.left != null){
                        temp = temp.left;
                    }
                    succ = temp;
                }
                break;
            }
        }
        res.add(pred);
        res.add(succ);
        return res;
        
    }
}