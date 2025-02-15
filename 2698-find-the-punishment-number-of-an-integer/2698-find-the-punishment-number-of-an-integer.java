class Solution {
    public int punishmentNumber(int n) {
        int res = 0;  
        for (int i = 1; i <= n; i++) {
            int x = i * i; 
            if (canBePartitioned(Integer.toString(x), i, 0, 0)) {
                res += x;
            }
        } 
        return res;
    }

    private boolean canBePartitioned(String s, int target, int index, int currentSum) {
        if (index == s.length()) {
            return currentSum == target;
        }
        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');  
            if (canBePartitioned(s, target, i + 1, currentSum + num)) {
                return true;
            }
        }
        
        return false;
    }
}
