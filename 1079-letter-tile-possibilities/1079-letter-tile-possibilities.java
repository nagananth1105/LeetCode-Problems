class Solution {
    public int numTilePossibilities(String tiles) {
        int [] co= new int [26];
        for(char c:tiles.toCharArray() ){
            co[c-'A']++;
        }
        return backtrack(co);
    }
         private int backtrack(int[] co) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (co[i] > 0) { 
                sum++; 
                co[i]--; 
                sum += backtrack(co); 
                co[i]++; 
            }
        }
        return sum;
    }
}