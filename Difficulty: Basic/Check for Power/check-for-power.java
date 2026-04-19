class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if (y == 1) return true;
        if (x == 1) return y == 1; 
        if (x == 0) return false;      
        if (y == 0) return false; 
        while(y!=1){
            if(y%x!=0) return false;
            y /= x;
        }
        return true;
    }
}