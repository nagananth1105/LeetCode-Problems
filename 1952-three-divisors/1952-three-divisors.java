class Solution {
    public boolean isThree(int n) {
        if (n < 4) 
        return false; 
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i * i != n) {
                    count++; 
                }
            }
            if (count > 3) return false;
        }
        return count == 3; 
    }
}
