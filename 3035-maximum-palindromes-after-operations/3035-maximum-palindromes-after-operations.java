class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int[] count = new int[26];
        int cnt=0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                cnt += count[ch-'a']%2;
                count[ch-'a']++;
            }
        }
        
        
        int res=0;
        Arrays.sort(words, (a,b)->a.length()-b.length());
        for(String word:words){
            cnt -= word.length()/2;
            res += cnt<0?0:1;
        }
        return res;
    }
}